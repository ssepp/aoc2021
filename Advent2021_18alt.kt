package advent2021_18alt

import adventExtensions.extractInts


const val full_input = """[[8,8],5]
[[[[9,0],1],4],[[3,6],[0,5]]]
[[9,[0,[4,5]]],[1,[[6,8],4]]]
[[8,7],[[[8,5],[2,0]],[[6,3],[5,0]]]]
[[[1,8],2],[[[9,1],[2,0]],[1,[9,4]]]]
[[[6,[8,8]],[6,4]],[[8,2],[[0,8],9]]]
[[[6,3],[9,[9,1]]],[[0,0],1]]
[[[[2,7],[8,2]],[[9,6],[5,1]]],[[[7,6],[6,0]],[4,2]]]
[[[8,[9,1]],[9,3]],[[[5,4],[8,0]],[[3,5],[9,5]]]]
[[[3,[4,9]],2],[[7,9],7]]
[[[7,[9,0]],5],[[[3,4],[2,6]],[[3,5],[7,2]]]]
[[8,[8,9]],[[[3,2],[6,2]],4]]
[[[[8,0],3],[3,8]],[[[5,0],[7,3]],[5,[3,0]]]]
[4,[[3,[0,9]],[[5,0],[2,0]]]]
[[[[0,1],5],[3,[9,6]]],[[[4,4],5],[[3,8],[5,1]]]]
[[[[4,8],8],0],[5,[[1,7],[4,3]]]]
[[3,[[1,1],[5,6]]],[7,[[4,0],[0,7]]]]
[9,[4,[[1,3],2]]]
[[[1,[2,7]],[[4,7],3]],[2,1]]
[[[9,5],[2,5]],[[[8,9],[4,5]],2]]
[[2,[[7,4],6]],[[1,[0,7]],[[4,8],8]]]
[[[[0,5],3],[7,0]],9]
[[[[1,4],[4,3]],7],[[9,4],[6,[8,6]]]]
[[[7,2],[[3,3],1]],[5,9]]
[[[9,[6,2]],2],[[6,5],6]]
[[5,[3,2]],[[[2,4],[1,5]],[6,3]]]
[6,3]
[[9,6],[[[8,2],[5,6]],[[3,5],[3,3]]]]
[[[[2,5],7],4],[8,3]]
[[[[6,1],9],[0,6]],[6,2]]
[[[[8,4],2],[[0,1],[5,8]]],9]
[[[7,0],[4,9]],[[[9,9],[4,4]],[6,6]]]
[[[9,8],[2,0]],[[9,[6,2]],[6,[5,6]]]]
[[[9,8],[[0,6],[3,5]]],[[[4,7],[7,5]],[7,[8,5]]]]
[[[[9,0],[1,6]],[2,[5,3]]],[[[2,0],[0,3]],[[9,1],[7,7]]]]
[[[5,[2,2]],[2,[1,0]]],[1,1]]
[[[9,[7,2]],[[2,7],1]],[[5,7],[[8,7],7]]]
[[[9,[9,4]],[[0,8],2]],[0,[[2,2],[4,1]]]]
[[[5,5],[9,[2,0]]],[[[9,0],6],1]]
[[[1,9],[[9,5],[5,6]]],[6,[5,[9,4]]]]
[[[[8,6],9],9],[[7,2],[7,[2,6]]]]
[[[[6,4],7],7],[[2,[9,7]],7]]
[[7,[[5,6],9]],[[[9,8],8],[[8,9],[1,0]]]]
[[[0,[7,6]],0],[[[2,5],1],9]]
[[[3,[4,1]],[4,2]],[0,[[6,0],[1,6]]]]
[[9,[0,0]],[[[3,0],[9,9]],[1,[1,5]]]]
[[[[9,9],1],6],[5,6]]
[3,4]
[[[[5,4],9],6],2]
[[5,4],[[6,[7,4]],[[0,3],0]]]
[[[3,[9,6]],4],[[[9,8],6],3]]
[[5,[1,[5,5]]],[[[3,8],[0,1]],[[9,3],[6,2]]]]
[[4,[0,3]],1]
[[[7,[2,9]],[[5,8],2]],[[[4,4],[2,0]],8]]
[[[[4,0],0],8],7]
[[[[3,0],0],[[6,0],3]],[[[1,5],1],[3,[0,0]]]]
[[[[8,1],5],0],[[[3,9],[8,3]],[[6,9],[5,1]]]]
[[7,7],[[[8,5],2],[9,2]]]
[[[[4,9],9],[6,[5,3]]],[[[7,1],[7,1]],[[9,5],[7,0]]]]
[[7,[0,5]],[7,[2,[1,6]]]]
[[9,[0,[0,2]]],[[1,1],[[6,6],[5,3]]]]
[[[2,9],[[6,9],9]],[[[4,2],7],[1,[2,3]]]]
[[[0,1],[3,3]],[3,[[2,7],2]]]
[[[5,6],8],[[[4,9],[3,3]],[6,[5,2]]]]
[[4,[4,[2,5]]],[[2,[4,8]],[3,[7,7]]]]
[[2,5],[[[9,6],[9,3]],[[4,5],[2,3]]]]
[[5,[0,5]],[[[2,1],[0,5]],3]]
[[[[2,0],5],[[7,9],[4,5]]],[0,[[1,4],9]]]
[[[[1,3],2],[[3,9],[9,5]]],[[[4,1],[3,8]],0]]
[[[[1,8],[8,3]],[3,0]],[[5,1],[4,8]]]
[[1,6],[3,2]]
[[4,5],[[[9,3],[8,6]],[2,[8,6]]]]
[[[[4,4],1],[[7,3],2]],[[9,[2,1]],[8,2]]]
[0,[[2,[3,8]],9]]
[[1,[5,0]],[0,[[2,6],[8,5]]]]
[[6,[6,1]],[[2,[7,9]],[[8,3],1]]]
[[[2,[5,9]],[[8,9],1]],[[[5,2],2],4]]
[[[4,3],5],[[6,[3,6]],5]]
[1,[6,[6,2]]]
[[[[4,9],3],9],[[3,9],[8,[4,9]]]]
[[[[7,1],[1,6]],[[7,8],[3,7]]],[[[5,3],7],[9,[3,1]]]]
[[[[0,8],[8,9]],2],7]
[[[[3,7],[9,8]],[[7,1],8]],[[4,[4,6]],8]]
[3,[3,[[4,4],5]]]
[[3,[[2,3],7]],[[7,9],2]]
[[[[0,6],[5,1]],[[7,2],5]],[9,8]]
[[4,0],[[4,3],[7,2]]]
[[[8,[1,1]],[7,[9,1]]],[9,[9,[0,8]]]]
[9,[[[4,5],8],[[3,4],9]]]
[[[6,[4,7]],[8,7]],[[[3,8],5],[[2,1],[3,5]]]]
[[[[5,5],[6,8]],[[2,3],6]],[8,[5,7]]]
[[5,[[6,1],[3,6]]],[[[0,6],[7,1]],[9,[8,4]]]]
[[[[0,1],[4,9]],[[1,7],[3,3]]],[6,[3,[6,1]]]]
[[[[3,8],5],[[4,7],2]],2]
[[6,[[4,4],0]],[[2,[4,5]],[8,2]]]
[[6,[9,[7,0]]],[[9,[1,6]],[[6,1],1]]]
[[[[2,1],[5,7]],[5,[9,3]]],[[[7,9],[4,2]],4]]
[[3,1],[[7,8],[[8,8],9]]]
[[[[9,4],[1,8]],[9,[3,7]]],[[6,9],[[7,2],1]]]
[[[9,3],2],9]"""
const val test_input = """[[[0,[4,5]],[0,0]],[[[4,5],[2,6]],[9,5]]]
[7,[[[3,7],[4,3]],[[6,3],[8,8]]]]
[[2,[[0,8],[3,4]]],[[[6,7],1],[7,[1,6]]]]
[[[[2,4],7],[6,[0,5]]],[[[6,8],[2,8]],[[2,1],[4,5]]]]
[7,[5,[[3,8],[1,4]]]]
[[2,[2,2]],[8,[8,1]]]
[2,9]
[1,[[[9,3],9],[[9,0],[0,7]]]]
[[[5,[7,4]],7],1]
[[[[4,2],2],6],[8,7]]"""

const val isTest = false

val input = if (isTest) test_input else full_input

val lines = lines()

fun main() {

    runTests()

    // p1
//    var sum = lines[0]
//
//    for (i in 1..lines.lastIndex) {
//        println(sum)
//        sum = addition(sum, lines[i])
//        sum = reduce(sum)
//    }
//
//    println(sum)

    var max = 0

    for (line1 in lines) {
        for (line2 in lines) {

            if (line1 == line2)
                continue

            val sum = reduce(addition(line1,line2))
            val mag = magnitude(sum)

            max = max.coerceAtLeast(mag)
            println(max)

        }
    }



}

fun runTests() {

    val summand1 = "[1,2]"
    val summand2 = "[[3,4],5]"
    val sum = "[[1,2],[[3,4],5]]"

    if (addition(summand1, summand2) != sum)
        throw Exception("sum test failed")

    val beforeExplode1 = "[[6,[5,[4,[3,2]]]],1]"
    val afterExplode1 = "[[6,[5,[7,0]]],3]"

    if (reduce(beforeExplode1) != afterExplode1)
        throw Exception("explode test failed")

    val beforeExplode2 = "[[[[[9,8],1],2],3],4]"
    val afterExplode2 = "[[[[0,9],2],3],4]"

    if (reduce(beforeExplode2) != afterExplode2)
        throw Exception("explode test failed")

    val beforeExplode3 = "[7,[6,[5,[4,[3,2]]]]]"
    val afterExplode3 = "[7,[6,[5,[7,0]]]]"

    if (reduce(beforeExplode3) != afterExplode3)
        throw Exception("explode test failed")

    val beforeExplode4 = "[[3,[2,[8,0]]],[9,[5,[4,[3,2]]]]]"
    val afterExplode4 = "[[3,[2,[8,0]]],[9,[5,[7,0]]]]"

    if (reduce(beforeExplode4) != afterExplode4)
        throw Exception("explode test failed")

    val beforeSplit1 = "10"
    val afterSplit1 = "[5,5]"

    if (reduce(beforeSplit1) != afterSplit1)
        throw Exception("split test failed")

    val addLeft1 = "[[[[4,3],4],4],[7,[[8,4],9]]]"
    val addRight1 = "[1,1]"
    val add1 = addition(addLeft1, addRight1)
    val reduceResult1 = "[[[[0,7],4],[[7,8],[6,0]]],[8,1]]"

    if (reduce(add1) != reduceResult1)
        throw Exception("reduce test failed")

    val addLeft2 = "[[[0,[4,5]],[0,0]],[[[4,5],[2,6]],[9,5]]]"
    val addRight2 = "[7,[[[3,7],[4,3]],[[6,3],[8,8]]]]"
    val add2 = addition(addLeft2, addRight2)
    val reduceResult2 = "[[[[4,0],[5,4]],[[7,7],[6,0]]],[[8,[7,7]],[[7,9],[5,0]]]]"

    if (reduce(add2) != reduceResult2)
        throw Exception("reduce test failed")

    if (magnitude("[[[[7,7],[7,7]],[[7,7],[7,8]]],[[[0,8],[8,8]],[9,[5,5]]]]") != 3725)
        throw Exception("magnitude test failed")

}

fun magnitude(val1: String) : Int {

    var red = val1

    while(true) {

//        println(red)

        if (red.extractInts().size == 1) {
            return red.extractInts()[0]
        }

        val regex = "\\[\\d+,\\d+\\]".toRegex()

        val match = regex.find(red)!!.value

//        println(match)

        val replacement = (match.extractInts()[0]*3 + match.extractInts()[1]*2).toString()

//        println(replacement)

        red = red.replace(match, replacement)

    }
}

fun addition(val1: String, val2: String) = "[$val1,$val2]"

fun reduce(val1: String): String {

    var red = val1

    reduceStep@while(true) {

//        println(red)

        var nrLeftBrackets = 0

        var isExplosion =  false
        var explosionStartIndex = -1
        var explosionEndIndex = -1
        var explosionLeftNum = -1
        var explosionRightNum = -1

        explosionSearch@for (i in red.indices) {

            if (red[i] == '[')
                nrLeftBrackets++

            if (red[i] == ']')
                nrLeftBrackets--

            if (nrLeftBrackets == 5) {
                isExplosion = true
                explosionStartIndex = i
                explosionLeftNum = red.substring(explosionStartIndex).extractInts()[0]
                explosionRightNum = red.substring(explosionStartIndex).extractInts()[1]

                explosionEndIndex = explosionStartIndex +3 // two brackets and a comma
                explosionEndIndex += explosionLeftNum.toString().length
                explosionEndIndex += explosionRightNum.toString().length

                break@explosionSearch
            }

        }

        if (isExplosion) {

//            println("exploding")

            var beforeExpl = red.substring(0, explosionStartIndex)
            var afterExpl = red.substring(explosionEndIndex)

            var numberBefore = beforeExpl.extractInts().lastOrNull()

            if (numberBefore != null) {

                val newNumber = numberBefore + explosionLeftNum

                val stringBuilder: StringBuilder = StringBuilder(beforeExpl)
                val index = stringBuilder.lastIndexOf(numberBefore.toString())
                stringBuilder.replace(index, numberBefore.toString().length + index, newNumber.toString())
                beforeExpl = stringBuilder.toString()
            }

            var numberAfter = afterExpl.extractInts().firstOrNull()

            if (numberAfter != null) {

                val newNumber = numberAfter + explosionRightNum

                val stringBuilder: StringBuilder = StringBuilder(afterExpl)
                val index = stringBuilder.indexOf(numberAfter.toString())
                stringBuilder.replace(index, numberAfter.toString().length + index, newNumber.toString())
                afterExpl = stringBuilder.toString()
            }

            red = beforeExpl + "0" + afterExpl

            continue@reduceStep

        }

        // Search for split
        val allNums = red.extractInts()

        if (allNums.any { it >= 10 }) {

//            println("splitting")

            val numToSplit = allNums.first{it >= 10}

            val splitIndex = red.indexOf(numToSplit.toString())

            val leftAfterSplit = numToSplit/2
            val rightAfterSplit = numToSplit - leftAfterSplit

            val newMidSection = "[$leftAfterSplit,$rightAfterSplit]"

            val beforeSplit = red.substring(0, splitIndex)
            val afterSplit = red.substring(splitIndex + numToSplit.toString().length)

            red = beforeSplit + newMidSection + afterSplit

            continue@reduceStep
        }

        break;
    }


    return red
}

fun nums1() : List<Int> = input.lines().filter{l -> l.isNotBlank()}.map{it.toInt()}
fun numsn() : List<List<Int>>  = input.lines().filter{l -> l.isNotBlank()}.map{it.extractInts()}
fun blocks() : List<String> = input.split("\n\n").filter{ b -> b.isNotBlank()}
fun lines() : List<String> = input.lines().filter{ l -> l.isNotBlank()}