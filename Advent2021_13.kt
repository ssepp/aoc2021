package advent2021_13

import adventExtensions.extractInts

const val full_input = """17,52
740,52
559,424
820,415
880,718
867,814
1136,658
420,170
492,530
300,686
1201,233
1161,116
247,584
43,754
231,857
980,388
80,173
560,478
1148,4
1121,187
492,219
649,492
599,788
624,456
455,584
52,277
903,310
177,598
654,891
277,623
180,80
68,702
751,555
55,788
175,16
288,236
17,842
1215,122
1309,131
475,639
1148,113
475,670
140,763
251,767
261,191
177,84
1068,724
179,639
671,444
569,148
1051,297
1076,495
763,452
1,152
475,224
80,423
837,128
1033,399
649,402
234,443
1309,579
599,206
1245,703
0,787
1258,277
283,306
1120,877
611,140
703,386
377,175
825,439
32,651
653,47
1158,886
1300,348
243,770
913,206
1146,479
508,94
242,593
289,674
54,350
693,668
527,448
569,779
833,477
898,593
321,308
248,40
1295,544
1093,9
529,82
559,409
919,812
653,656
343,884
83,124
793,610
385,625
904,264
1145,686
229,32
326,107
425,862
1131,389
1143,487
1,579
1009,620
900,222
174,658
167,39
653,686
383,35
493,735
190,465
1255,572
334,371
652,612
1265,242
95,409
1101,507
363,611
1010,765
939,306
1022,236
189,129
146,94
575,91
726,61
837,724
310,128
1255,788
666,472
823,855
1309,847
1007,162
1033,271
480,207
371,812
1051,81
979,779
654,79
119,894
1131,488
1068,469
211,890
199,184
831,878
430,718
902,688
1183,486
412,301
865,535
639,444
887,788
616,672
43,140
617,2
1300,472
915,873
1227,322
802,352
641,779
1131,290
248,264
701,724
62,686
661,315
1125,609
1295,131
1233,689
723,365
579,767
1121,765
1148,227
907,799
1066,240
545,233
395,201
751,872
1062,630
985,231
5,315
735,91
70,833
899,91
584,514
492,675
701,242
559,609
127,486
1051,675
1148,245
1009,274
987,429
1287,605
134,505
830,616
1156,819
411,500
950,532
269,269
1285,123
408,672
180,814
672,318
498,187
321,627
1293,842
1255,635
711,788
162,677
1193,835
835,224
480,616
782,628
671,59
830,680
691,611
55,572
1300,239
976,371
360,532
656,891
80,672
885,837
117,390
721,191
62,208
741,148
343,668
549,872
1183,446
95,563
1076,451
905,205
574,49
385,717
162,331
1226,817
477,296
252,371
492,306
35,611
758,400
273,661
899,418
989,332
77,205
239,704
902,423
474,80
411,770
80,128
500,371
446,688
529,530
885,862
1068,21
294,532
783,408
381,233
321,332
751,424
1133,84
390,432
43,252
1149,208
1019,310
947,845
890,219
164,722
70,61
796,259
333,267
242,469
863,530
1163,672
219,348
830,687
411,842
545,728
325,628
1101,836
386,82
234,399
325,686
480,724
321,315
544,837
1247,530
169,738
1309,42
885,57
989,315
585,318
1146,172
925,424
933,271
1031,732
1079,509
149,88
771,277
1136,687
1,47
395,469
329,238
1230,672
741,779
321,267
1079,253
902,672
795,177
1300,546
261,390
165,208
899,124
1101,354
169,215
693,226
475,672
0,891
482,75
661,220
345,766
385,126
208,766
549,501
358,456
495,71
957,317
425,57
283,222
1227,646
1066,761
939,812
1103,364
793,60
1185,450
967,884
617,668
479,878
445,59
885,725
1007,610
1183,51
373,876
885,505
802,94
416,483
657,686
52,366
1265,283
1243,609
301,620
1237,861
763,227
469,509
308,712
724,590
1158,8
798,638
705,175
619,446
406,630
820,781
739,131
701,838
1310,161
890,675
433,424
477,127
982,693
372,654
1141,604
574,173
208,206
656,79
356,505
693,2
972,395
639,450
773,835
1041,269
433,798
1275,611
375,485
907,319
447,364
825,674
831,430
1062,854
395,597
686,456
887,485
682,462
877,52
237,677
282,464
0,61
1183,856
915,675
830,170
1273,892
82,0
691,688
537,838
505,88
855,584
288,894
248,33
435,763
363,38
689,226
115,452
403,799
291,67
493,159
1027,306
190,17
161,511
492,364
435,131
1041,177
996,304
902,670
863,364
137,362
1156,371
599,654
17,82
1010,96
907,767
411,124
828,523
354,768
1275,464
701,163
887,253
291,283
343,660
1067,355
189,219
1198,214
661,579
1149,383
616,222
1164,68
517,577
1064,397
1009,129
505,806
1021,450
326,215
217,233
725,318
353,129
1079,385
95,161
669,424
693,674
243,131
823,375
398,654
1173,362
581,481
949,124
652,58
731,543
420,219
514,635
156,707
473,724
750,674
890,3
371,306
817,686
252,747
1227,763
1195,617
300,14
475,66
658,58
773,282
1049,703
1084,728
377,719
142,232
35,136
508,68
408,240
174,207
649,233
666,348
1223,704
1016,810
1148,863
935,485
823,410
157,138
673,52
326,679
482,523
325,215
1300,870
189,577
311,355
1230,497
559,733
1141,290
661,851
1077,766
638,318
329,47
410,654
965,530
1156,75
537,835
867,528
1129,766
1017,322
517,274
984,215
485,439
74,75
1007,732
1174,488
611,588
209,354
658,612
701,51
997,351
817,208
855,184
957,129
808,886
433,52
179,389
1215,409
37,892
966,80
828,819
867,890
465,129
885,389
699,140
987,779
954,366
410,581
1215,787
423,485
1164,800
149,116
1193,56
102,494
1310,79
146,352
1185,444
766,837
492,639
639,59
303,610
771,452
288,0
981,266
915,597
1309,852
1183,448
73,413
637,52
219,546
835,828
475,57
1028,240
1275,894
1294,80
408,670
443,80
70,285
885,32
557,712
403,319
1121,577
912,667
587,694
420,675
935,409
739,842
17,394
269,177
154,75
326,665
818,255
1136,655
277,719
426,234
192,757
887,288
609,242
468,635
1133,296
985,14
1141,455
310,576
520,192
52,416
1305,579
1164,352
835,884
338,499
818,675
628,541
656,893
1300,655
32,203
597,717
77,689
865,506
743,586
303,732
221,22
1072,175
877,872
391,840
174,168
30,438
669,779
1297,305
572,654
989,627
1159,878
657,656
395,373
823,36
1089,394
836,80
490,173
570,537
954,528
559,161
691,448
836,542
1309,91
1243,382
977,267
1067,131
641,95
719,54
739,124
935,284
325,490
354,686
989,674
1079,857
927,411
967,668
1243,64
1010,129
1067,763
474,352
572,805
490,339
517,620
1174,406
547,452
487,823
1213,182
475,854
970,590
162,479
83,696
279,732
1260,232
761,501
330,388
321,698
325,355
551,273
1096,774
172,371
443,53
493,208
343,234
1062,40
231,409
793,577
269,470
298,57
845,35
45,724
154,523
602,80
480,278
947,283
924,82
221,394
1277,668
591,54
965,766
259,373
179,255
175,878
966,814
246,497
679,605
50,214
1022,894
1310,563
1067,539
385,768
217,661
509,842
1223,756
1078,30
0,115
656,331
238,175
915,81
231,606
1150,170
1154,187
979,151
587,107
162,890
1243,691
146,542
1146,343
169,604
192,416
1277,124
402,523
95,122
1064,654
740,537
492,667
109,681
750,416
180,542
1243,830
821,873
333,579
323,779
750,220
1258,416
316,395
1267,140
657,152
773,838
251,319
30,456
654,563
965,364
475,619
167,858
825,455
482,371
406,264
1010,686
1051,736
311,884
179,505
391,812
945,444
628,577
411,476
300,129
1066,285
818,639
234,495
221,842
490,113
914,366
361,674
127,448
413,107
919,82
93,576
87,704
740,817
1041,470
708,277
637,842
889,576
1136,726
474,814
721,154
1293,82
85,746
982,439
259,693
1054,206
469,385
751,409
83,322
1089,22
947,856
473,170
1077,318
1131,639
959,386
1000,318
1148,754
639,660
1258,366
67,243
1,742
1019,283
1051,61
1141,220
423,470
845,274
897,787
1198,662
383,483
243,539
403,457
619,448
602,478
256,688
443,890
1205,88
1145,208
820,115
489,873
1243,200
354,577
411,91
999,350
765,728
1309,763
219,628
1,91
311,226
691,136
161,208
1081,389
1021,140
149,477
408,423
897,107
514,315
47,60
311,579
956,126
380,864
890,654
233,576
52,478
751,733
1131,406
1275,731
902,240
528,628

fold along x=655
fold along y=447
fold along x=327
fold along y=223
fold along x=163
fold along y=111
fold along x=81
fold along y=55
fold along x=40
fold along y=27
fold along y=13
fold along y=6"""
const val test_input = """6,10
0,14
9,10
0,3
10,4
4,11
6,0
6,12
4,1
0,13
10,12
3,4
3,0
8,4
1,10
2,14
8,10
9,0

fold along y=7
fold along x=5"""

const val isTest = false

val input = if (isTest) test_input else full_input

fun main() {
    
    val dotsRaw = input.split("\n\n")[0]
    val foldRaw = input.split("\n\n")[1]
    
    var dots = mutableSetOf<Pair<Int,Int>>()
    
    for (line in dotsRaw.lines()) {
        if (line.isBlank()) {
            continue
        }
        val x = line.extractInts()[0]
        val y = line.extractInts()[1]
        dots.add(x to y)
    }
    
    for (instr in foldRaw.lines()) {

        val maxX = dots.maxOf { it.first }
        val maxY = dots.maxOf { it.second }
        
        if (instr.isBlank()) {
            continue
        }

//        println(dots.maxOf { it.first })
        
        val foldX = instr.contains('x')
        val foldNr = instr.extractInts()[0]
        
        val newDots = mutableSetOf<Pair<Int,Int>>()
        
        for (dot in dots) {
            
            if (foldX) {
                
                val oldX = dot.first
                
                val newX =
                if (oldX > foldNr) {
                    foldNr - (oldX - foldNr)
                } else {
                    oldX
                }
                
                newDots.add(newX to dot.second)
                
            } else {

                val oldY = dot.second

                val newY =
                    if (oldY > foldNr) {
                        foldNr - (oldY - foldNr)
                    } else {
                        oldY
                    }

                newDots.add(dot.first to newY)
                
            }
            
        }

        dots = newDots.toMutableSet()
        println(dots.size)
        
    }

    val maxX = dots.maxOf { it.first }
    val maxY = dots.maxOf { it.second }

    for (y in 0..maxY) {
        for(x in 0..maxX) {

            if (dots.contains(x to y)) {
                print('#')
            } else {
                print('.')
            }

        }
        println()
    }


}


fun nums1() : List<Int> = input.lines().filter{l -> l.isNotBlank()}.map{it.toInt()}
fun numsn() : List<List<Int>>  = input.lines().filter{l -> l.isNotBlank()}.map{it.extractInts()}
fun blocks() : List<String> = input.split("\n\n").filter{ b -> b.isNotBlank()}
fun lines() : List<String> = input.lines().filter{ l -> l.isNotBlank()}