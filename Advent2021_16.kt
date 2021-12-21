package advent2021_16

import adventExtensions.extractInts

const val full_input = """220D790065B2745FF004672D99A34E5B33439D96CEC80373C0068663101A98C406A5E7395DC1804678BF25A4093BFBDB886CA6E11FDE6D93D16A100325E5597A118F6640600ACF7274E6A5829B00526C167F9C089F15973C4002AA4B22E800FDCFD72B9351359601300424B8C9A00BCBC8EE069802D2D0B945002AB2D7D583E3F00016B05E0E9802BA00B4F29CD4E961491CCB44C6008E80273C393C333F92020134B003530004221347F83A200D47F89913A66FB6620016E24A007853BE5E944297AB64E66D6669FCEA0112AE06009CAA57006A0200EC258FB0440010A8A716A321009DE200D44C8E31F00010887B146188803317A3FC5F30056C0150004321244E88C000874468A91D2291802B25EB875802B28D13550030056C0169FB5B7ECE2C6B2EF3296D6FD5F54858015B8D730BB24E32569049009BF801980803B05A3B41F1007625C1C821256D7C848025DE0040E5016717247E18001BAC37930E9FA6AE3B358B5D4A7A6EA200D4E463EA364EDE9F852FF1B9C8731869300BE684649F6446E584E61DE61CD4021998DB4C334E72B78BA49C126722B4E009C6295F879002093EF32A64C018ECDFAF605989D4BA7B396D9B0C200C9F0017C98C72FD2C8932B7EE0EA6ADB0F1006C8010E89B15A2A90021713610C202004263E46D82AC06498017C6E007901542C04F9A0128880449A8014403AA38014C030B08012C0269A8018E007A801620058003C64009810010722EC8010ECFFF9AAC32373F6583007A48CA587E55367227A40118C2AC004AE79FE77E28C007F4E42500D10096779D728EB1066B57F698C802139708B004A5C5E5C44C01698D490E800B584F09C8049593A6C66C017100721647E8E0200CC6985F11E634EA6008CB207002593785497652008065992443E7872714"""
const val test_input = """todo"""

const val isTest = false

val input = if (isTest) test_input else full_input

val lines = lines()

data class Packet(val rawBits: String = "", var bitsUnused: String = "", var version: Int = 0, var typeId: Int = 0, var literal: Long = 0) {

    val subPackets = mutableListOf<Packet>()

    private val typeIdLiteral = 4

    fun sumVersions() : Int {

        var sum = version

        for (sub in subPackets) {
            sum += sub.sumVersions()
        }

        return sum

    }

    fun calculateValue() : Long {

        when(typeId) {

            0 -> return subPackets.sumOf { it.calculateValue() }
            1 -> {
                var product = 1L
                for (sub in subPackets)
                    product *= sub.calculateValue()
                return product
            }
            2 -> return subPackets.minOf { it.calculateValue() }
            3 -> return subPackets.maxOf { it.calculateValue() }
            4 -> return literal
            5 -> {
                assert(subPackets.size == 2)
                return boolToNum(subPackets[0].calculateValue() > subPackets[1].calculateValue())
            }
            6 -> {
                assert(subPackets.size == 2)
                return boolToNum(subPackets[0].calculateValue() < subPackets[1].calculateValue())
            }
            7 -> {
                assert(subPackets.size == 2)
                return boolToNum(subPackets[0].calculateValue() == subPackets[1].calculateValue())
            }
            else -> throw Exception("unexcepted type: $typeId")

        }

    }

    private fun boolToNum(boolean: Boolean) : Long {
        return if (boolean) {
            1L
        } else {
            0L
        }

    }

    fun parse() {
        var bits = rawBits
        version = bits.take(3).toInt(2)
        bits = bits.drop(3)
        typeId = bits.take(3).toInt(2)
        bits = bits.drop(3)

        if (typeId != typeIdLiteral) {
            val lengthTypeId = bits.take(1)
            bits = bits.drop(1)

            if (lengthTypeId == "0") {
                // If the length type ID is 0, then the next 15 bits are a number that represents
                // the total length in bits of the sub-packets contained by this packet.

                val totalLengthSub = bits.take(15).toInt(2)
                bits = bits.drop(15)

                var subBits = bits.take(totalLengthSub)
                bits = bits.drop(totalLengthSub)

                do {
                    val subPacket = Packet(subBits)
                    subPackets.add(subPacket)
                    subPacket.parse()
                    subBits = subPacket.bitsUnused

                } while (
                    subBits.isNotBlank()
                )

            } else {
                // If the length type ID is 1, then the next 11 bits are a number that represents
                // the number of sub-packets immediately contained by this packet.

                val nrSub = bits.take(11).toInt(2)
                bits = bits.drop(11)

                for (subPacketNr in 0 until nrSub) {
                    val subPacket = Packet(bits)
                    subPackets.add(subPacket)
                    subPacket.parse()
                    bits = subPacket.bitsUnused
                }


            }

        } else {

            var literal = ""

            do {
                val nibbleType = bits.take(1)
                bits = bits.drop(1)

                val nibbleContent = bits.take(4)
                bits = bits.drop(4)

                literal += nibbleContent
            } while (nibbleType[0] == '1')

            this.literal = literal.toLong(2)
        }

        bitsUnused = bits
    }


}

fun main () {

//    runTest("C200B40A82")

    val packet = Packet(hexToBits(input))
    packet.parse()

    println(packet.calculateValue())

}

fun p1() {

    runTest("D2FE28")
    runTest("38006F45291200")
    runTest("EE00D40C823060")

    val packet = Packet(hexToBits(input))
    packet.parse()

    println(packet.sumVersions())

}

fun runTest(raw: String) {
    println("Running test for $raw:")
    val test = Packet(hexToBits(raw))
    test.parse()
    println(test)
    for (p in test.subPackets) {
        println(p)
    }
    println(test.calculateValue())
    println()
}


fun hexToBits(hex: String): String  {

    val hexMap = mutableMapOf<Char, String>()

    hexMap['0'] = "0000"
    hexMap['1'] = "0001"
    hexMap['2'] = "0010"
    hexMap['3'] = "0011"
    hexMap['4'] = "0100"
    hexMap['5'] = "0101"
    hexMap['6'] = "0110"
    hexMap['7'] = "0111"
    hexMap['8'] = "1000"
    hexMap['9'] = "1001"
    hexMap['A'] = "1010"
    hexMap['B'] = "1011"
    hexMap['C'] = "1100"
    hexMap['D'] = "1101"
    hexMap['E'] = "1110"
    hexMap['F'] = "1111"

    val bitString = StringBuilder("")

    for (c in hex) {
        bitString.append(hexMap[c])
    }

    return bitString.toString()

}


fun nums1() : List<Int> = input.lines().filter{l -> l.isNotBlank()}.map{it.toInt()}
fun numsn() : List<List<Int>>  = input.lines().filter{l -> l.isNotBlank()}.map{it.extractInts()}
fun blocks() : List<String> = input.split("\n\n").filter{ b -> b.isNotBlank()}
fun lines() : List<String> = input.lines().filter{ l -> l.isNotBlank()}