package advent2021_12

const val input = """by-TW
start-TW
fw-end
QZ-end
JH-by
ka-start
ka-by
end-JH
QZ-cv
vg-TI
by-fw
QZ-by
JH-ka
JH-vg
vg-fw
TW-cv
QZ-vg
ka-TW
ka-QZ
JH-fw
vg-hu
cv-start
by-cv
ka-cv"""

val paths = mutableMapOf<String, MutableList<String>>()

fun main() {

    for (line in lines()) {

        val a = line.split("-")[0]
        val b = line.split("-")[1]

        if (!paths.containsKey(a)) {
            paths[a] = mutableListOf()
        }

        paths[a]!!.add(b)

    }

    for (line in lines()) {

        val a = line.split("-")[1]
        val b = line.split("-")[0]

        if (!paths.containsKey(a)) {
            paths[a] = mutableListOf()
        }

        paths[a]!!.add(b)

    }

    val tries = mutableListOf<MutableList<String>>()

    tries.add(mutableListOf("start"))

    var ans = 0

    while (tries.isNotEmpty()) {

        val t = tries[0]

        var twice = false

        for (smallCave in t.filter { it == it.toLowerCase() }) {
            if (t.count { it  == smallCave} == 2) {
                twice = true
            }
        }

        val options = paths[t.last()]!!

        for (opt in options) {

            var skip = (opt == "start")
            skip = skip || (twice && t.contains(opt) && (opt == opt.toLowerCase()))

            if (opt == "end") {
                ans++
            } else if(!skip) {
                val newT = t.toMutableList()
                newT.add(opt)
                tries.add(newT)
            }

        }

        tries.removeFirst()

    }

    println(ans)

}

fun lines() : List<String> = input.lines().filter{ l -> l.isNotBlank()}