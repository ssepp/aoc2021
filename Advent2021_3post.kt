package advent2021_3post

const val input = """
<snip>
"""

fun main() {
    p1()
    p2()
}

fun p2() {

    var words = input.lines().filter { it.isNotBlank() }

    for (i in words[0].indices) {

        val nrZeros = words.count{it[i] == '0'}
        val nrOnes = words.count{it[i] == '1'}

        if (nrZeros < nrOnes) {
            words = words.filter { it[i] == '1' }
        } else if (nrZeros > nrOnes){
            words = words.filter { it[i] == '0' }
        } else {
            words = words.filter { it[i] == '1' }
        }

        if (words.size == 1) {
            break
        }

    }

    val oxy = words[0].toInt(2)

    words = input.lines().filter { it.isNotBlank() }

    for (i in words[0].indices) {

        val nrZeros = words.count{it[i] == '0'}
        val nrOnes = words.count{it[i] == '1'}

        if (nrZeros > nrOnes) {
            words = words.filter { it[i] == '1' }
        } else if (nrOnes > nrZeros){
            words = words.filter { it[i] == '0' }
        } else {
            words = words.filter { it[i] == '0' }
        }

        if (words.size == 1) {
            break
        }

    }

    val co2 = words[0].toInt(2)

    println("p2: " + oxy*co2)

}

fun p1() {

    var epsBits = ""
    var gammaBits = ""

    val words = input.lines().filter { it.isNotBlank() }

    for (i in words[0].indices) {

        val nrZeros = words.count{it[i] == '0'}
        val nrOnes = words.count{it[i] == '1'}

        if (nrZeros < nrOnes) {
            gammaBits += '1'
            epsBits += '0'
        } else {
            gammaBits += '0'
            epsBits += '1'
        }

    }

    val gamma = gammaBits.toInt(2)
    val epsilon = epsBits.toInt(2)

    println("p1: " + gamma*epsilon)

}
