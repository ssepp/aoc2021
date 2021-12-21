package advent2021_11

import adventExtensions.extractInts

const val full_input = """8261344656
7773351175
7527856852
1763614673
8674556743
6853382153
4135852388
2846715522
7477425863
4723888888"""
const val test_input = """5483143223
2745854711
5264556173
6141336146
6357385478
4167524645
2176841721
6882881134
4846848554
5283751526"""

const val isTest = false

val input = if (isTest) test_input else full_input

var nrFl = 0


// wrong 3590
// wrong 1719
fun main() {

    val el = lines().map{it.toList().map { it.toString() }.map{it.toInt() }}.map{it.toMutableList()}.toMutableList()

    println(el)

    for (i in 1..10000) {
        for (col in el.indices) {
            for (row in el[0].indices) {
//                print(el[col][row])
            }
            println()
        }
//        println("---")
        nrFl = 0
        step(el)

        el.indices

        if (nrFl == el.indices.toList().size *el[0].indices.toList().size) {
            println(i)
            break
        }
    }



    println(nrFl)
}

fun step(el: MutableList<MutableList<Int>>) {

    var flashLocs = mutableListOf<Pair<Int,Int>>()
    val alreadyFlashed = mutableListOf<Pair<Int,Int>>()

    for (col in el.indices) {
        for (row in el[0].indices) {

            val old = el[row][col]

            if (old < 9) {
                el[row][col] = el[row][col] + 1
            } else {
                el[row][col] = 0
                flashLocs.add(row to col)
            }

        }
    }

    while (flashLocs.isNotEmpty()) {

        nrFl += flashLocs.size

        alreadyFlashed.addAll(flashLocs)

        var newFlashLocs = mutableListOf<Pair<Int,Int>>()

        for (loc in flashLocs) {

//            println("flash at " + loc)
            for (dCol in listOf(-1, 0, 1)) {
                for (dRow in listOf(-1, 0, 1)) {
                    if (dCol == 0 && dRow == 0) {
                        continue
                    }

                    try {

                        val row = loc.first + dRow
                        val col = loc.second + dCol

                        val old = el[row][col]

                        if (el[row][col] == 0) {
                            continue
                        }

                        if (alreadyFlashed.contains(row to col)) {
                            continue
                        }

                        if (old < 9) {
                            el[row][col] = el[row][col] + 1
                        } else {
                            el[row][col] = 0
                            newFlashLocs.add(row to col)
                        }
                    } catch (e: Exception) {

                    }
                }

            }
        }

        flashLocs = newFlashLocs
    }
}


fun nums1() : List<Int> = input.lines().filter{l -> l.isNotBlank()}.map{it.toInt()}
fun numsn() : List<List<Int>>  = input.lines().filter{l -> l.isNotBlank()}.map{it.extractInts()}
fun blocks() : List<String> = input.split("\n\n").filter{ b -> b.isNotBlank()}
fun lines() : List<String> = input.lines().filter{ l -> l.isNotBlank()}