package advent2021_examples

import adventExtensions.extractInts
import adventExtensions.extractLongs
import adventutil.PowerSet
import adventutil.permute
import kotlin.math.absoluteValue

const val full_input = """todo"""
const val test_input = """todo"""

const val isTest = true

val input = if (isTest) test_input else full_input

val l = mutableListOf<String>()
val m = mutableMapOf<String, String>()
val s = mutableSetOf<String>()

val d = listOf(-1 to 0, 1 to 0, 0 to 1, 0 to -1)

data class Node(val row: Int, val col: Int) {
    fun manhattan() = row.absoluteValue + col.absoluteValue
}

fun main() {

    println (PowerSet(listOf(1,2,3)).results)

    println (permute(listOf('a', 'b', 'c')))



}

private fun createIntListFromRawInput(): MutableList<Int> {

    val intList: MutableList<Int> = ArrayList()

    for (number in input.lines()) {

        if (number.isBlank())
            continue

        intList.add(Integer.parseInt(number))
    }

    return intList;
}



fun parseInput() {

    for (lineWithIndex in input.lines().withIndex()) {

        val line = lineWithIndex.value
        val index = lineWithIndex.index

        // line.split("-")
        // val (a, b, c, d ,e) =
        // """#(\d*) @ (\d*),(\d*): (\d*)x(\d*)""".toRegex().find(line)!!.destructured
        // line.extractInts()
        // line.extractLongs()

    }

}

