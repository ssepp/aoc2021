package advent2021_14b

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

    val ruleMap1 = mutableMapOf<Pair<Char,Char>, Pair<Char,Char>>()
    val ruleMap2 = mutableMapOf<Pair<Char,Char>, Pair<Char,Char>>()

    for (rule in rawRules.lines()) {

        if (rule.isBlank()) {
            continue
        }

        val first = rule.split(" -> ")[0]
        val middle = rule.split(" -> ")[1][0]

        val orig1 = first.toList()[0]
        val orig2 = first.toList()[1]

        ruleMap1[orig1 to orig2] = orig1 to middle
        ruleMap2[orig1 to orig2] = middle to orig2

    }

    var pairCountMap = mutableMapOf<Pair<Char,Char>, Long>()

    for (x in elements.windowed(2)) {

        val p = x[0] to x[1]

        if (!pairCountMap.containsKey(p)) {
            pairCountMap[p] = 0
        }

        pairCountMap[p] = pairCountMap[p]!! + 1

    }

    for (repeatIndex in 1..40) {

        println("index: " + repeatIndex)
        println("pairs: " + pairCountMap)

        var newPairCountMap = mutableMapOf<Pair<Char,Char>, Long>()

        for (el in pairCountMap) {

            val new1 = ruleMap1[el.key]!!
            val new2 = ruleMap2[el.key]!!

            if (!newPairCountMap.containsKey(new1)) {
                newPairCountMap[new1] = 0
            }

            if (!newPairCountMap.containsKey(new2)) {
                newPairCountMap[new2] = 0
            }

            newPairCountMap[new1] = newPairCountMap[new1]!! + el.value
            newPairCountMap[new2] = newPairCountMap[new2]!! + el.value

        }

        pairCountMap = newPairCountMap

        val elemCountMap = mutableMapOf<Char, Long>()
        for (p in pairCountMap) {

            if (!elemCountMap.containsKey(p.key.first)) {
                elemCountMap[p.key.first] = 0
            }

            if (!elemCountMap.containsKey(p.key.second)) {
                elemCountMap[p.key.second] = 0
            }

            elemCountMap[p.key.first] = elemCountMap[p.key.first]!! + p.value
            elemCountMap[p.key.second] = elemCountMap[p.key.second]!! + p.value
        }

        elemCountMap[template[0]] = elemCountMap[template[0]]!! + 1
        elemCountMap[template.last()] = elemCountMap[template.last()]!! + 1

        println(elemCountMap)
        println((elemCountMap.values.maxOrNull()!! - elemCountMap.values.minOrNull()!!)/2)

    }





}


fun nums1() : List<Int> = input.lines().filter{l -> l.isNotBlank()}.map{it.toInt()}
fun numsn() : List<List<Int>>  = input.lines().filter{l -> l.isNotBlank()}.map{it.extractInts()}
fun blocks() : List<String> = input.split("\n\n").filter{ b -> b.isNotBlank()}
fun lines() : List<String> = input.lines().filter{ l -> l.isNotBlank()}