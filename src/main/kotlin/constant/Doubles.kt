package constant

import kotlin.math.absoluteValue

object Doubles {

    val ZERO = BigDecimals.ZERO.toDouble()
    val ONE = BigDecimals.ONE.toDouble()

    val E = BigDecimals.E.toDouble()
    val PI = BigDecimals.PI.toDouble()

    fun abs(x: Double) = x.absoluteValue

    fun cos(x: Double) = kotlin.math.cos(x)

    fun acos(x: Double) = kotlin.math.acos(x)

    fun ln(x: Double) = kotlin.math.ln(x)

    fun log10(x: Double) = kotlin.math.log10(x)

    fun logistic(x: Double) = ln(ONE / (ONE - x))

    fun sqrt(x: Double) = kotlin.math.sqrt(x)
}