package advent2021_17

import adventExtensions.extractInts

const val full_input = """target area: x=287..309, y=-76..-48"""
const val test_input = """target area: x=20..30, y=-10..-5"""

const val isTest = false

val input = if (isTest) test_input else full_input

val lines = lines()

var x = 0
var y = 0

var dx = 0
var dy = 0

var tminx = 0
var tmaxx = 0
var tminy = 0
var tmaxy = 0

var workingX = 0

var p2 = 0

var uniqueP2 = mutableSetOf<Pair<Int,Int>>()

// wrong: 1132
fun main() {

    tminx = input.extractInts()[0]
    tmaxx = input.extractInts()[1]
    tminy = input.extractInts()[2]
    tmaxy = input.extractInts()[3]

    var hittingTarget = false

    var maxDy = 0

    var tryY = -1000
    while(true) {

//        println("trying $tryY")

        var hits = hits(tryY)

        tryY++
    }

    println("maxDY: $maxDy")

    printMaxY(maxDy, workingX)

}

fun printMaxY(tryY: Int, tryDxX: Int) {
    dy = tryY
    dx = tryDxX

    x = 0
    y = 0

    var maxY = 0

    while (dy > 0 || y > tminy) {
        step()

        maxY = maxY.coerceAtLeast(y)

    }

    println("p1 answer: $maxY")
}


fun hits(tryY: Int) {

    for (tryDxX in -1000..1000) {
        dy = tryY
        dx = tryDxX

        x = 0
        y = 0


        while (dy > 0 || y > tminy) {
            step()
//        println(dy)

            if (y in tminy..tmaxy && x in tminx..tmaxx) {

                uniqueP2.add(tryDxX to tryY)
                p2 = uniqueP2.size
                println("p2: $p2 for dx: $tryDxX and dy: $tryY")
            }
        }
    }

}



fun step() {

    x += dx
    y += dy

    if (dx>0)
        dx--
    if (dx<0)
        dx++
    dy--

}


fun nums1() : List<Int> = input.lines().filter{l -> l.isNotBlank()}.map{it.toInt()}
fun numsn() : List<List<Int>>  = input.lines().filter{l -> l.isNotBlank()}.map{it.extractInts()}
fun blocks() : List<String> = input.split("\n\n").filter{ b -> b.isNotBlank()}
fun lines() : List<String> = input.lines().filter{ l -> l.isNotBlank()}