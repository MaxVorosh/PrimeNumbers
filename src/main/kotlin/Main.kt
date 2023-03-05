fun getPrimeNumbers(seq: Sequence<Int>) : Sequence<Int> {
    return sequence {
        if (seq.first() > 1) {
            yield(seq.first())
            yieldAll(getPrimeNumbers(seq.drop(1).asSequence().filter { it % seq.first() != 0}))
        }
        else {
            yieldAll(getPrimeNumbers(seq.drop(1)))
        }
    }
}

fun main(args: Array<String>) {
}