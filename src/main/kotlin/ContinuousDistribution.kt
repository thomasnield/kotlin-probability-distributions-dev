

interface ContinuousDistribution: Distribution {


    /**
     * In probability theory, a probability density function (pdf), or density of a continuous random variable
     * is a function that describes the relative likelihood for this random variable to occur at a given
     * point. The probability for the random variable to fall within a particular region is given by the
     * integral of this variable's density over the region. The probability density function is nonnegative
     * everywhere, and its integral over the entire space is equal to one.
     * <a href="http://en.wikipedia.org/wiki/Probability_density_function">Wikipedia</a>
     *
     * @param value x
     * @return P(x)
     */
    fun getDensity(value: Double): Double

    /**
     * In probability theory and statistics, the cumulative distribution function (CDF), or just distribution
     * function, describes the probability that a real-valued random variable X with a given probability
     * distribution will be found at a value less than or equal to x. Intuitively, it is the "area so far"
     * function of the probability distribution. Cumulative distribution functions are also used to specify
     * the distribution of multivariate random variables.
     * [Wikipedia](http://en.wikipedia.org/wiki/Cumulative_distribution_function)
     *
     * @param value x
     * @return P(x)
     */
    fun getDistribution(value: Double): Double

    /**
     * The quantile function, for any distribution, is defined for real variables between zero and one and is
     * mathematically the inverse of the cumulative distribution function.
     * [Wikipedia](http://en.wikipedia.org/wiki/Quantile_function) The input probability absolutely
     * has to be [0.0, 1.0], but values close to 0.0 and 1.0 may be problematic
     *
     * @param probability P(&lt;=x)
     * @return x
     */
    fun getQuantile(probability: Double): Double
}