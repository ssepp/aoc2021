package advent2021_20

import adventExtensions.extractInts

const val full_input = """#.#...######..#####...#.####.#####.#.#.#.#..###.#.###...#.#..#.#.#......#.##...#.#.###....#.####.#.####.#..###...#####..####.##..####..##.##.....#..##...#.#..###.###.##..###.##.##....#....#.##..###....#.#...#..#.#.#.##.#.####..#....#..######..#####.##.#.#.##.##...##.#.#..##.#######.#..##..#...#...###..####.....#.#.#.###..###.##.....#####.#..##..####..#.##..#.#.....###.#.###.#.#....#.#.#..#.#..#.##..######.#.........##...##...##.#...##..##....###...##..##......#.#.#.###.##.#.#...#..##...#..........#...###...

###.#.....###.#.....##.##..#.#..#.##....#..#..#.##..#..#.###.....#.##...#.#.####.##....##.#..#...#..
#..#...######.#....#.#.#.#.##.#..#####.###.####....#.##..##...#..###..##.##.#.#.##.#.#.#.#...#......
..#..##.#.##.#..#...##.######.###...#..####..#.#.#.##.##.#...####....####.#.#..#.#.##..###..##..##.#
.##..##..#.#...####.#..#.###....##.####....##.#.#..#...##.#.....####.#.#.#.#####..#..####.#.#...#..#
..#.#.##..######.##.#..##..####.#.##.....#..###..#......######......##..##.#...#.##..#..#.##..#.###.
..###..#####...####.#.#....#####....#..#.##.##.#..#########..##..#.#.#..#..#..#..#.###.#.....######.
#...#......#.##.#.#...##...####...#.##...#........###...##.....#.##..#######.###.##....#..##.#..####
##..#......#..#..##..####.##.#....###..#.####.#.####...###.###.##....#.#.###.#.#...###.#.....#.#...#
.#.###.##.......#.#..###......##.####.##.......##..##..##.....##.......###.#.#..##..#.#####.#.#.#.#.
#..##.#.......###..###..#..#.#.#..##...#.##.......#.#.#...###.#...#.#.#.#..###.#.#..#..####...###...
..#.##.#...##.#.#.##...####.#.#.###...#..##..###....#.#..#.#.###...#..###.#.##.###......#.#.#.#.###.
..###.#.###.#.#########...###...#.###.#..##..#######..###.#.#####.####...#.###...#.##..###.#.##....#
..#....#..#.###.##..###....#.##.###.##.........##.#..####.##.###..###.##.####.####..##..##...##.#...
..###..#...#...#.###.#..##.....#.#.##..####...##.#######.##.#.##...#.###......#.#..#.###.####.##..#.
###..#.#.#.......####.#...#.#.#.###...#.###.###..#......##..#......#.#.##.###..#...#.##...#..#..####
..###....#..##.##...#.#.#..#.##.####.##.#..#######.##.#...#.###.#..#.########.#.##.#.##.#...#..###..
...#.#.#.#.....###...#..#.#....#####........###........#.#..#.#.#...####.##.#..##..###.#########...#
..#...##..###.#.#.#.##....#..##..##.....#.##..#.##.#..#.........##.##..######.#.#..#...#....###...##
#.##..##.##.##.###...#.#..#.#.##...##...##..#..#....#.###..####..##.#....###.......#.###...#.....##.
#.#..###..#..##...#.#.########.##.#.###.############.##....#..####.###...#...#..#.###.#..#...#..#...
.#..#.##.##.#..##..#...#######.##.#...#.#.#..#.#.#.#....##.####.###..##.#.#..#.#......###.#..#####.#
.#....#.##.###..#....#..#..##......#.#.#..#.##..##...#.#.#.##...##.#..#.###....#...#.###..#.####..##
.###....#..#.###.#.#.#....######....#.###.####..####.######.##..###..#...##..#.##.#..######.#.#...#.
.#.#....####..#...###..###.##..#####.#...#.#.#.#.#..###..#..###..#.##.#.#.#.##...#.##.####.#..#.#...
#....#...##.#...####...##.#....#.#...#..######.###...#.##.####.##....##.#.####.###....#.##.##.####.#
.#.#####..##.....##.#..#.#..#..#####.....##....####.#####..#.#....#..###.##...#...###.#........##...
###.####.#.##...#####.#.#####...#.####..#....####..###.###..#.#...####.#....#..##...##.##..##.#####.
..##.##..#..#.##..#.##.#...#......##.#.##....##...#########.##...####.######.#.#.###.###.##.#.##..#.
...#.#####..#.#..#.#.#.####.###....#.#.####.###.......###.##.#.....#############.###..####..#.##.#..
...########.#..#..##.##..#.##.#..#...#.#####..###....#..#......#..##....#.#...#...#..##.####.##.#.#.
#.####.#.#..#...###.###....#..##...#....##..#..#.#####.#..####...#...#...#.#.####.#.###....#.#.....#
#..##.##.#..#####...##..#.....#..#.#.....####........####..##.##...##..#####...#..#.##...#..#....#.#
...##.###..#.###..###.#####..##.#.....##.##.#....##.#.#.#........#.##.##.#.#..#.##.#..##...#..##..##
##..#...###.#.#.####....#.#.##..#...#..###..#.###.#..#.##.....#..#..#########..#.##..##.##.#.....#..
#..###...#...####..#..#.....##.#.#....###..#.###...######..##..#.##...#....#.##.###.#..##...#.#..#.#
.#.....##.#.##.#.#####..#.#.##..###..##.##.##.#..######..######.##.#.###.#.#.##.#...##.#.#...####...
###..#.#.####.#...####..#.#.#..###.#######.##.#...####.#####.##.#...#...#...#..##..#######.#.#.#.#..
####.####..#####.#.#.....#...###..######.#..#.#.##.##.##..##...#..####....##..#.##...##..#.##.#...##
##....#...#.###.###.###.......#.#.......#..##.##.#.#.#.####.......###.#.#....######.#.....##....#...
#...#.######.##..#..##.##...#.##.##.##...#.#.####......#..##.##..#..#......###.#.##.#.#..##.##..#..#
.....#.#...###...#.....##.#.#.#.###....#..#..#.##.###.#......#.......#.#.##..###.###.###..#.##.#.#.#
..##..#.##.#####.#.##..#.###..#..##..##..##.##.#.#.#.#..#...#...####.##.##.#..#.#.#.##.#####....###.
#.#..####.####..##.#...#.#.#.#.###...#####.....##...###..#####.#.#..####.#...#.###.##..###..##...#..
###.####..#...#.#####...#...####.#.#....####.#.........#..###.#....######.######.###.#..#.....#..##.
#.##..#...##.###.#..###.#.#..#.#.###...#####.#.#..###...#.##...#...###..##..##....#..##.####..#....#
.#.##..####.########.##..#..##.#.#.####....###.#####...#.###..#...##..#.#####.#####...######.#.###..
.#..#.###..#.#.#.....###.#..#..###...###.#.##.#.##..##.##..##.#.#.##....##.##.##.##..#.#....##..#..#
.#.#.##.##..#..######.##...#######.#..#.#.#####.#..#....##.....##.##...####.......#.##.#.#.#..#####.
#####...#.##.##.###.#.#.#.#.##.###.#...#.#...#......###.#.#.###..#.#....#.....#...#.#..#.#.#.##...#.
##.#........#..#.###.#.#.#.......##..###.##...##....##.##..#.###..###...##...####.########.#..#####.
##.#..#.###.#.#.#.##.##.###..###.##....######...####.#.#.#...####....####.###...##..#.#.#..#..#...#.
##..#####.#####.#.##..###.#....####.#.#.#.#..##.#.####.###....####..#.##..#...##.##.#.#.####.##..#..
...#..##..#####..##.##.##.#..#...#.#.###.....#...###.#....#.#.####...#..####....#...###.#....##..###
##.#..#..#.#.####...#.#..##.###..###...#...#...#...#.#....##...#..##..####.....###.##...#..###..#...
#...########.....###....###.####..##.##.#.##.##..#..##..##...##....##.#..#..##..#.##..#..##..##.###.
..#..#.##.#..#...##.......#...#.##..#..####..##.##..##..#..##.###.#....#..#.#....#.###.###.......###
###.##.##.######........##..#.#####...###....##..#.#####..##..##...#.###.#.###.###.######.##..#.##.#
..#..##.....#.#.#...#...###.#..##...####...####.#.#..#####.##...##...#.#.#.###..#.#...#...####.##...
.####..#..##......#.#.#....###......###.########.#..#.##...##..##.##..######.#.####...##.##.##..###.
..#.#####..##.#..##....####.###..##.#.##.####..###..##.#.#.###...##..####.##.#.....#...####.#.#..###
####....#.##....#.#.##...######.#.#...#.#...#.#..####.#..#.#..###...#.#....#####.###...#....####..#.
..####...###..##..#..#..###..#.#...##.#.###...##....#.###..#...#####.#...##...####..#.#..#...##.###.
#####.##....#.#.##....#.#.#.#.#....##...#.##.#.#.##...#.###.....####..#.#....#.#.#.######..#.##..#..
####.#.##.##...###....##...##..#..#....##..#.#.#.#..#..###.......###.#.####..#.####.....#.#.##.#..##
..#.#.###..###########.#...#..###.###.#....#...##....#.#.#..##....#..#.#.##...#.###.....##.#.#...#..
.#..#.#..#.##...#####.##.....##.#.#.#..#.#.#....###.###.#..###.#....##..##..######......##.###.#..##
#.###..##.##...##.##.....#.#.#..##.#...#.##...#..#.#...###..#.......##...##...###.#.....###..##.#.##
..##.####..###.#.##..##.#....##.#####.#....#.#.#.#.##.##..#.#..#...###.#..#..#.....#....#..#.#...###
#.##...######..###.#.#.#...##.####.###..#.##.##.###.#..#.#.###..#..##.#..#..#..##..##.#.#.#..#..#...
##.##...###.##.#.#.......#..##..#..###..#...#.#..##########..#......#...#.##..#..##.###...###.######
#.#..#.###......#...###.###..#.........#.##.#.##.###....#.######..##..#.###.......#..##...###......#
....##.#.......##.#.#.###.###.####.#.#..##.#..##.#...####.#..#...#...#..##.###.#.#.####..##......##.
.#...######..##.##...#.####..#...#.....##.#####.##....###....#......#.#.##..#.#......#.#.#..###..##.
#.##..##...#####.#.####..#..##.###.####.#.#.###.##..####..###.####..#..##.#.###.....#####.##..#..###
.###.###.#.##..#...##.#..#.#..#######...#....#.#.....#..#.#....###.#..###....#.#.#.####....#.#.##..#
####..###..#....##....#.#.....#.##.#.##..##.###..#....##..######.##.##.#.#...##..###.###.#######.###
##.#.##..#########.#.##.###.#...#######.###.#.#.#######.##...#.#..##.#.##..##.#.#....####.#..######.
....#..#.####.#........#.#.#.#.##.....###.####..##....#.###...#...####.....###...#.###...###.##.####
#.....#..##..##.######.#...######..#.....#..##..#..###.#.###.###.#.##.....##.###..#......##......###
.#..#.......#..#...#...##.####..##...#.#.#.................#.##...##..##.#..##....#.....#...##..#.#.
#...###......#......#.######.#####..#....##..##....#.#..##.##.#....###.#.....###.#.#.#.......##.#...
#######.##..#.#.##.##...#...##..#.##.##.###..##.####.###.#.##.#..#.########.....######......#.#.#.##
#...##..#.#.........##.#...#...#..###.####.####.#.##.#..#.#..##..##.##.#..##..##...#...###.##.#.....
#.##.##....#....##.##...#####.....#.###...####.##.##..#.#.##.############...#..########.###..#.####.
##..#..#.###....##.###.##..#.#..#.##..#..#.#####.#....####.#..##...#########.###...#.#..#..##.#.###.
..#..........##...###......#..#.#..#.##.#####.....###.#.##....#..###.#.##.##..#.##.#.....#.#.#...##.
..#.#..#...#####.#.#.#.##.#..#.#.#####..##.......#.#..#.########..##.#..#.#..#...######...##...#..#.
..#..#......#..###..#...#....#.#.#..####...###.#..#.........#.#.######.#.##.#.#..##..#.####......#..
##.#.###.#...#.###..#.######.#...####.#.#####..#.#.##.....#..##.##.##...#####.....####.#.########..#
..###.###.##..####..#.....#.#..#...######.#.##.##..#.##.......#.##.###....##.##.####....####...#.#..
###.#.#.##.....#.######.#...#####.##.#..##..#.#.....##....####..#..#.##.#.#.##.###.#..###.###.#.....
..##.#.#.#.#...###.####.#.##.#..#.#.#..#..#..#######.####..#.#...##....#..#....###...##..####....###
..#..#..##.#####.#.....#...#.##......#...##...##..##.##.....##.#....##.#.#.#.#.#.#...##.#.#..###.#.#
.##.#.#....#..#..##.#.#..##.###.##.#######..####.##.####..#.#.#.....#.#..##...##..##.##.####...#.##.
#......##.....#.#..#..##.###.##.#..###.##..#.....#...##.##.##.#.##..#.###.#..#..#.#.......##...#...#
#.#.###..#.#####.......#....#....#...#..#.......#.####.#..#.....#....##..#####.##....##..##.##......
###...#.#....###.###...#..#.#.#....##..##.#..###.#..##...#..#..#.#.....#.####.#.##......##..#.####..
####.##...###.....##.##.....#.#.#....#.###.######.......#.###.#.........###.#...##.###..##..#.#..##.
.#..##.##.##...###.#.#..##...#.###...###.#...#....#...###....#...#.#..#.#.#.#....#.....####...#....#
.#.####.##.##..#...##.#.#.#...##.##.#######.#.##...#.#.#...##....#####.#..#.#..#...####.##.##...###."""

const val test_input = """..#.#..#####.#.#.#.###.##.....###.##.#..###.####..#####..#....#..#..##..###..######.###...####..#..#####..##..#.#####...##.#.#..#.##..#.#......#.###.######.###.####...#.##.##..#..#..#####.....#.#....###..#.##......#.....#..#..#..##..#...##.######.####.####.#.#...#.......#..#.#.#...####.##.#......#..#...##.#.##..#...##.#.##..###.#......#.#.......#.#.#.####.###.##...#.....####.#..#..#.##.#....##..#.####....##...##..#...#......#.#.......#.......##..####..#...#.#.#...##..#.#..###..#####........#..####......#..#

#..#.
#....
##..#
..#..
..###"""

const val isTest = false

val input = if (isTest) test_input else full_input

val lines = lines()

var pixelMap = mutableMapOf<Pair<Int,Int>, Boolean>()

var isOutsideDark = true

val algoString = blocks()[0]
val mapString = blocks()[1]

fun main() {

    for (rowWithIndex in mapString.lines().filter { it.isNotBlank() } .withIndex()) {

        val row = rowWithIndex.value
        val rowIndex = rowWithIndex.index

        for (colWithIndex in row.toList().withIndex()) {

            val char = colWithIndex.value
            val colIndex = colWithIndex.index

            pixelMap[Pair(rowIndex, colIndex)] = (char == '#')

        }
    }

    if (!isTest) {
        repeat(50) {
            enhance()
        }
        println("p2: " + pixelMap.values.count { it })
    } else {

        draw()
        println()
        enhance()
        draw()
    }

}

fun draw() {
    val minRow = pixelMap.keys.map{it.first}.minOrNull()!!
    val maxRow = pixelMap.keys.map{it.first}.maxOrNull()!!
    val minCol = pixelMap.keys.map{it.second}.minOrNull()!!
    val maxCol = pixelMap.keys.map{it.second}.maxOrNull()!!

    for (row in minRow..maxRow) {
        for (col in minCol..maxCol) {

            if (pixelMap[Pair(row,col)]!!) {
                print('#')
            } else {
                print('.')
            }

        }

        println()
    }
}

fun enhance() {

    val minRow = pixelMap.keys.map{it.first}.minOrNull()!! - 1
    val maxRow = pixelMap.keys.map{it.first}.maxOrNull()!! + 1
    val minCol = pixelMap.keys.map{it.second}.minOrNull()!! - 1
    val maxCol = pixelMap.keys.map{it.second}.maxOrNull()!! + 1

    val deltas = mutableListOf(-1 to -1, -1 to 0, -1 to 1, 0 to -1, 0 to 0, 0 to 1, 1 to -1, 1 to 0, 1 to 1)

    val newPixelMap = mutableMapOf<Pair<Int,Int>, Boolean>()

    for (row in minRow..maxRow) {
        for (col in minCol..maxCol) {

            var bitString = StringBuilder()

            for (delta in deltas) {

                val checkRow = row + delta.first
                val checkCol = col + delta.second
                val checkPair = Pair(checkRow, checkCol)

                if (pixelMap.containsKey(checkPair)) {
                    if (pixelMap[checkPair]!!) {
                        bitString.append('1')
                    } else {
                        bitString.append('0')
                    }
                } else {
                    if (isOutsideDark) {
                        bitString.append('0')
                    } else {
                        bitString.append('1')
                    }
                }

            }

            val num = bitString.toString().toInt(2)
            val result = algoString[num] == '#'
            newPixelMap[Pair(row,col)] = result
        }
    }

    isOutsideDark = !isOutsideDark
    pixelMap = newPixelMap

}


fun nums1() : List<Int> = input.lines().filter{l -> l.isNotBlank()}.map{it.toInt()}
fun numsn() : List<List<Int>>  = input.lines().filter{l -> l.isNotBlank()}.map{it.extractInts()}
fun blocks() : List<String> = input.split("\n\n").filter{ b -> b.isNotBlank()}
fun lines() : List<String> = input.lines().filter{ l -> l.isNotBlank()}