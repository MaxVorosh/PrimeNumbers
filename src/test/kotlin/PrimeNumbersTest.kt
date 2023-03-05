import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class PrimeNumbersTest {

    @Test
    fun getPrimeNumbersTest() {
        val realPrimes = listOf(2, 3, 5, 7, 11, 13, 17, 19)
        val myPrimes = getPrimeNumbers(generateSequence(2) { it + 1 }).take(8).toList()
        assertEquals(8, myPrimes.count())
        for (i in 0..7) {
            assertEquals(realPrimes[i], myPrimes[i])
        }
    }

    @Test
    fun getPrimeNumbersFromZeroTest() {
        val realPrimes = listOf<Int>(2, 3, 5, 7)
        val myPrimes = getPrimeNumbers(generateSequence(0) { it + 1 }).take(4).toList()
        for (i in 0..3) {
            assertEquals(realPrimes[i], myPrimes[i])
        }
    }
}