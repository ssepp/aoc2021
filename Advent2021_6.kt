package advent2021_6

import adventExtensions.extractInts

const val input = """4,1,1,1,5,1,3,1,5,3,4,3,3,1,3,3,1,5,3,2,4,4,3,4,1,4,2,2,1,3,5,1,1,3,2,5,1,1,4,2,5,4,3,2,5,3,3,4,5,4,3,5,4,2,5,5,2,2,2,3,5,5,4,2,1,1,5,1,4,3,2,2,1,2,1,5,3,3,3,5,1,5,4,2,2,2,1,4,2,5,2,3,3,2,3,4,4,1,4,4,3,1,1,1,1,1,4,4,5,4,2,5,1,5,4,4,5,2,3,5,4,1,4,5,2,1,1,2,5,4,5,5,1,1,1,1,1,4,5,3,1,3,4,3,3,1,5,4,2,1,4,4,4,1,1,3,1,3,5,3,1,4,5,3,5,1,1,2,2,4,4,1,4,1,3,1,1,3,1,3,3,5,4,2,1,1,2,1,2,3,3,5,4,1,1,2,1,2,5,3,1,5,4,3,1,5,2,3,4,4,3,1,1,1,2,1,1,2,1,5,4,2,2,1,4,3,1,1,1,1,3,1,5,2,4,1,3,2,3,4,3,4,2,1,2,1,2,4,2,1,5,2,2,5,5,1,1,2,3,1,1,1,3,5,1,3,5,1,3,3,2,4,5,5,3,1,4,1,5,2,4,5,5,5,2,4,2,2,5,2,4,1,3,2,1,1,4,4,1,5"""

val timeMap = mutableMapOf<Int,Long>()

fun main() {

    resetFish()

    repeat(80) {
        runCycle()
    }

    println("p1: " + timeMap.values.sum())


    resetFish()

    repeat(256) {
        runCycle()
    }

    println("p2: " + timeMap.values.sum())

}

fun resetFish() {

    for (i in 0..8) {
        timeMap[i] = 0
    }

    for (fish in input.extractInts()) {

        timeMap[fish] = timeMap[fish]!! + 1
    }
}

fun runCycle() {

    val newTimeMap = mutableMapOf<Int, Long>()

    newTimeMap[6] = timeMap[7]!! + timeMap[0]!!

    for (i in 0..5) {
        newTimeMap[i] = timeMap[i+1]!!
    }

    newTimeMap[7] = timeMap[8]!!

    newTimeMap[8] = timeMap[0]!!

    for (i in 0..8) {
        timeMap[i] = newTimeMap[i]!!
    }

}
