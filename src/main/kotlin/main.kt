import kotlin.math.pow

fun dialectalEOf(sentence: List<Char>): List<Char> {

    val vocalsList = listOf('a', 'e', 'i', 'o', 'u')
    val sentenceWithE = sentence.map {

        if (it in vocalsList) {

            'e'

        } else {

            it
        }
    }
    return sentenceWithE
}

fun sumLists(l1: List<Int>, l2: List<Int>): List<Int> {

    val list = l1.zip(l2) { a, b ->  a + b
    }

    return list

}

fun findInsert(orderedList: List<Int>, newNumber: Int): Int {

    orderedList.forEachIndexed { i, elem ->
        if (elem > newNumber) {
            return i
        }
    }

    return orderedList.size + 1
}

fun <E> similar(l1: List<E>, l2: List<E>): Boolean {
    return l1.all { l2.contains(it) } && l2.all { l1.contains(it) }
}

fun anonymousMathOperation(a: Int, b: Int, operation: (Int, Int) -> Double): Double{
    return operation(a,b)
}

enum class Dialect(val vocal: Char) {
    A('a'), E('e'), I('i'), O('o'), U('u')
}

fun dialectalOf(sentence: String, dialect: Dialect): String {

    val vocalsList = listOf('a', 'e', 'i', 'o', 'u')
    val sentenceWithE = sentence.map {

        if (it in vocalsList) {
            dialect.vocal
        } else {
            it
        }
    }
    return  String(sentenceWithE.toCharArray())
}

fun productOfPairs(list: List<Int>): Double{
    return list.filter { it %2 == 0 }.reduce { acc, it ->
        acc*it
    }.toDouble()
}

fun powers(list: List<Int?>): List<Int>{
    return list.filterNotNull().mapIndexed { index, it ->
        (it.toDouble().pow(index)).toInt()
    }
}

fun <E> equals2(l1: List<E>, l2: List<E>): Boolean {
    if (l1.size != l2.size){
        return false
    }
    l1.zip(l2) { e1, e2 ->
        if (e1 != e2) {
            return false
        }
    }
    return true
}


fun main() {



}

