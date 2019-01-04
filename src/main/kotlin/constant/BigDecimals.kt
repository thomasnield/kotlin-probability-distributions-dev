package constant

import java.math.BigDecimal
import java.math.MathContext

object BigDecimals {

    val CONTEXT = MathContext.DECIMAL128

    val ZERO = BigDecimal("0", CONTEXT)
    val ONE = BigDecimal("1", CONTEXT)
    val TWO = BigDecimal("2", CONTEXT)

    /**
     * Euler's Number
     */
    val E = BigDecimal("2.71828182845904523536028747135266249775724709369996", CONTEXT)
    val PI = BigDecimal("3.14159265358979323846264338327950288419716939937511", CONTEXT)

    fun abs(x: BigDecimal) = x.abs()

    fun acos(x: BigDecimal) = Doubles.acos(x.toDouble()).asBigDecimal()

    fun ln(x: BigDecimal) = Doubles.ln(x.toDouble()).asBigDecimal()

    fun log10(x: BigDecimal) = Doubles.log10(x.toDouble()).asBigDecimal()

    fun logistic(x: BigDecimal) = Doubles.logistic(x.toDouble()).asBigDecimal()


    fun sqrt(x: BigDecimal): BigDecimal {

        val xScaled = x.round(CONTEXT)

        var retVal = ZERO
        val tmpDoubleArg = x.toDouble()
        if (!java.lang.Double.isInfinite(tmpDoubleArg) && !java.lang.Double.isNaN(tmpDoubleArg)) {
            retVal = Doubles.sqrt(tmpDoubleArg).asBigDecimal() // initial guess
        }

        // this helps the precision of the square root of BigDecimal?
        generateSequence {
            retVal.multiply(retVal, CONTEXT) -  xScaled
        }.takeWhile { it.signum() != 0 }
        .forEach { tmpShouldBeZero ->
            retVal = retVal.subtract(tmpShouldBeZero.divide(TWO.multiply(retVal), CONTEXT))

        }

        return retVal
    }

    private fun Double.asBigDecimal() = BigDecimal.valueOf(this)
}


