package advent2021_14

import adventExtensions.extractInts
import adventExtensions.join

const val full_input = """OOBFPNOPBHKCCVHOBCSO

NS -> H
NN -> P
FF -> O
HF -> C
KN -> V
PO -> B
PS -> B
FB -> N
ON -> F
OK -> F
OO -> K
KS -> F
FN -> F
KC -> H
NC -> N
NB -> C
KH -> S
SV -> B
BC -> S
KB -> B
SC -> S
KP -> H
FS -> K
NK -> K
OC -> H
NH -> C
PH -> F
OS -> V
BB -> C
CC -> F
CF -> H
CP -> V
VB -> N
VC -> F
PK -> V
NV -> N
FO -> S
CK -> O
BH -> K
PN -> B
PP -> S
NF -> B
SF -> K
VF -> H
HS -> F
NP -> F
SH -> V
SK -> K
PC -> V
BO -> H
HN -> P
BK -> O
BP -> S
OP -> N
SP -> N
KK -> C
HB -> H
OF -> C
VH -> C
HO -> N
FK -> V
NO -> H
KF -> S
KO -> V
PF -> K
HV -> C
SO -> F
SS -> F
VN -> K
HH -> B
OB -> S
CH -> B
FH -> B
CO -> V
HK -> F
VK -> K
CN -> V
SB -> K
PV -> O
PB -> F
VV -> P
CS -> N
CB -> C
BS -> F
HC -> B
SN -> P
VP -> P
OV -> P
BV -> P
FC -> N
KV -> S
CV -> F
BN -> S
BF -> C
OH -> F
VO -> B
FP -> S
FV -> V
VS -> N
HP -> B"""
const val test_input = """NNCB

CH -> B
HH -> N
CB -> H
NH -> C
HB -> C
HC -> B
HN -> C
NN -> C
BH -> H
NC -> B
NB -> B
BN -> B
BB -> N
BC -> B
CC -> N
CN -> C"""

const val isTest = false

val input = if (isTest) test_input else full_input


fun main() {

    val template = input.split("\n\n")[0]
    val rawRules = input.split("\n\n")[1]

    var elements = template.toList().toMutableList()

    val ruleMap = mutableMapOf<String, Char>()

    for (rule in rawRules.lines()) {

        if (rule.isBlank()) {
            continue
        }

        val first = rule.split(" -> ")[0]
        val second = rule.split(" -> ")[1]

        ruleMap[first] = second.toList()[0]

    }

    for (repeatIndex in 1..40) {

//        println("loop: $repeatIndex")
//        println("elements: ${elements.size}")
//        println(elements.join(separator = ""))

        var newElements = mutableListOf<Char>()

        newElements.add(elements[0])

        for (i in elements.indices) {

            if (i + 1 !in elements.indices) {
                continue
            }

            var el1 = elements[i]
            var el2 = elements[i + 1]
            var combo = el1.toString() + el2.toString()

            var ruleResult = ruleMap[combo]

            if (ruleResult != null)
                newElements.add(ruleResult)
            newElements.add(el2)

        }

        elements = newElements

        var counts = mutableListOf<Int>()

        for (l in elements.toList().distinct()) {
            counts.add(elements.count{it == l})
        }
        println(counts.maxOrNull()!! - counts.minOrNull()!!)

    }




//    val grp = elements.groupBy { el -> elements.count{it == el} }

//    println(grp.keys.maxOrNull()!! - grp.keys.minOrNull()!!)
}


fun nums1() : List<Int> = input.lines().filter{l -> l.isNotBlank()}.map{it.toInt()}
fun numsn() : List<List<Int>>  = input.lines().filter{l -> l.isNotBlank()}.map{it.extractInts()}
fun blocks() : List<String> = input.split("\n\n").filter{ b -> b.isNotBlank()}
fun lines() : List<String> = input.lines().filter{ l -> l.isNotBlank()}