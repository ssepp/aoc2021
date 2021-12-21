package advent2021_21

import adventExtensions.extractInts

const val full_input = """Player 1 starting position: 3
Player 2 starting position: 10"""
const val test_input = """todo"""

const val isTest = false

val input = if (isTest) test_input else full_input

val lines = lines()

fun main() {

    println("abcde")
}


fun nums1() : List<Int> = input.lines().filter{l -> l.isNotBlank()}.map{it.toInt()}
fun numsn() : List<List<Int>>  = input.lines().filter{l -> l.isNotBlank()}.map{it.extractInts()}
fun blocks() : List<String> = input.split("\n\n").filter{ b -> b.isNotBlank()}
fun lines() : List<String> = input.lines().filter{ l -> l.isNotBlank()}