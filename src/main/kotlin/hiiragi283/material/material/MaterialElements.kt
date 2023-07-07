package hiiragi283.material.material

import hiiragi283.material.config.RMConfig
import hiiragi283.material.util.ColorUtil
import hiiragi283.material.util.RagiColor

/**
 * @author MrKono
 * @author turtton
 */
object MaterialElements {

    //    1st Period    //

    @JvmField
    val HYDROGEN = materialOf("hydrogen", 1) {
        color = RagiColor.BLUE.rgb
        formula = "H"
        molar = 1.0
        tempBoil = 20
        tempMelt = 14
    }

    @JvmField
    val HELIUM = materialOf("helium", 2) {
        color = RagiColor.YELLOW.rgb
        formula = "He"
        molar = 4.0
        tempBoil = 3
        tempMelt = 1
    }

    //    2nd Period    //

    @JvmField
    val LITHIUM = materialOf("lithium", 3) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Li"
        molar = 6.9
        tempBoil = 1560
        tempMelt = 454
    }

    @JvmField
    val BERYLLIUM = materialOf("beryllium", 4) {
        color = RagiColor.DARK_GREEN.rgb
        crystalType = CrystalType.METAL
        formula = "Be"
        molar = 9.0
        tempBoil = 2742
        tempMelt = 1560
    }

    @JvmField
    val BORON = materialOf("boron", 5) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "B"
        molar = 10.8
        tempBoil = 4200
        tempMelt = 2349
    }

    @JvmField
    val CARBON = materialOf("carbon", 6) {
        color = ColorUtil.mixColor(RagiColor.BLACK, RagiColor.DARK_GRAY).rgb
        formula = "C"
        molar = 12.0
        //tempBoil = 4300
        //tempMelt = 4000
        tempSubl = 3915
    }

    @JvmField
    val NITROGEN = materialOf("nitrogen", 7) {
        color = RagiColor.AQUA.rgb
        formula = "N"
        molar = 14.0
        tempBoil = 77
        tempMelt = 63
    }

    @JvmField
    val OXYGEN = materialOf("oxygen", 8) {
        formula = "O"
        molar = 16.0
        tempBoil = 90
        tempMelt = 54
    }

    @JvmField
    val FLUORINE = materialOf("fluorine", 9) {
        color = RagiColor.GREEN.rgb
        formula = "F"
        molar = 19.0
        tempBoil = 85
        tempMelt = 54
    }

    @JvmField
    val NEON = materialOf("neon", 10) {
        color = RagiColor.LIGHT_PURPLE.rgb
        formula = "Ne"
        molar = 20.2
        tempBoil = 27
        tempMelt = 25
    }

    //    3rd Period    //

    @JvmField
    val SODIUM = materialOf("sodium", 11) {
        color = ColorUtil.mixColor(RagiColor.DARK_BLUE to 1, RagiColor.BLUE to 4).rgb
        crystalType = CrystalType.METAL
        formula = "Na"
        molar = 23.0
        tempBoil = 1156
        tempMelt = 371
    }

    @JvmField
    val MAGNESIUM = materialOf("magnesium", 12) {
        color = ColorUtil.mixColor(RagiColor.LIGHT_PURPLE, RagiColor.WHITE).rgb
        crystalType = CrystalType.METAL
        formula = "Mg"
        molar = 24.3
        tempBoil = 1363
        tempMelt = 923
    }

    @JvmField
    val ALUMINIUM = materialOf("aluminium", 13) {
        color = ColorUtil.mixColor(RagiColor.BLUE to 1, RagiColor.WHITE to 5).rgb
        crystalType = CrystalType.METAL
        formula = "Al"
        molar = 27.0
        tempBoil = 2792
        tempMelt = 933
    }

    @JvmField
    @Deprecated("Alumin\"i\"um distortions.")
    val ALUMINUM = materialOf("aluminum", 13) {
        color = ColorUtil.mixColor(RagiColor.BLUE to 1, RagiColor.WHITE to 5).rgb
        crystalType = CrystalType.METAL
        formula = "Al"
        molar = 27.0
        tempBoil = 2792
        tempMelt = 933
    }

    @JvmField
    val SILICON = materialOf("silicon", 14) {
        color = ColorUtil.mixColor(RagiColor.BLACK to 2, RagiColor.GRAY to 1, RagiColor.BLUE to 1).rgb
        crystalType = CrystalType.METAL
        formula = "Si"
        molar = 28.1
        tempBoil = 3538
        tempMelt = 1687
    }

    @JvmField
    val PHOSPHORUS = materialOf("phosphorus", 15) {
        color = RagiColor.YELLOW.rgb
        formula = "P"
        molar = 31.0
        tempBoil = 550
        tempMelt = 317
    }

    @JvmField
    val SULFUR = materialOf("sulfur", 16) {
        color = ColorUtil.mixColor(RagiColor.GOLD, RagiColor.YELLOW).rgb
        formula = "S"
        molar = 32.1
        tempBoil = 718
        tempMelt = 388
    }

    @JvmField
    val CHLORINE = materialOf("chlorine", 17) {
        color = RagiColor.YELLOW.rgb
        formula = "Cl"
        molar = 35.5
        tempBoil = 239
        tempMelt = 171
    }

    @JvmField
    val ARGON = materialOf("argon", 18) {
        color = RagiColor.LIGHT_PURPLE.rgb
        formula = "Ar"
        molar = 40.0
        tempBoil = 87
        tempMelt = 84
    }

    //    4th Period    //

    @JvmField
    val POTASSIUM = materialOf("potassium", 19) {
        color = ColorUtil.mixColor(RagiColor.DARK_BLUE to 2, RagiColor.BLUE to 3).rgb
        crystalType = CrystalType.METAL
        formula = "K"
        molar = 39.1
        tempBoil = 1032
        tempMelt = 337
    }

    @JvmField
    val CALCIUM = materialOf("calcium", 20) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Ca"
        molar = 40.1
        tempBoil = 1757
        tempMelt = 1115
    }

    @JvmField
    val SCANDIUM = materialOf("scandium", 21) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Sc"
        molar = 45.0
        tempBoil = 3109
        tempMelt = 1814
    }

    @JvmField
    val TITANIUM = materialOf("titanium", 22) {
        color = ColorUtil.mixColor(RagiColor.GOLD to 1, RagiColor.WHITE to 2).rgb
        crystalType = CrystalType.METAL
        formula = "Ti"
        molar = 47.9
        tempBoil = 3560
        tempMelt = 1941
    }

    @JvmField
    val VANADIUM = materialOf("vanadium", 23) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "V"
        molar = 50.9
        tempBoil = 3680
        tempMelt = 2183
    }

    @JvmField
    val CHROMIUM = materialOf("chromium", 24) {
        color = RagiColor.GREEN.rgb
        crystalType = CrystalType.METAL
        formula = "Cr"
        molar = 52.0
        tempBoil = 2944
        tempMelt = 2180
    }

    @JvmField
    @Deprecated("CHROMIUM distortions.")
    val CHROME = materialOf("chrome", 24) {
        color = RagiColor.GREEN.rgb
        crystalType = CrystalType.METAL
        formula = "Cr"
        molar = 52.0
        tempBoil = 2944
        tempMelt = 2180
    }

    @JvmField
    val MANGANESE = materialOf("manganese", 25) {
        color = ColorUtil.mixColor(RagiColor.RED, RagiColor.WHITE).rgb
        crystalType = CrystalType.METAL
        formula = "Mn"
        molar = 54.9
        tempBoil = 2334
        tempMelt = 1519
    }

    @JvmField
    val IRON = materialOf("iron", 26) {
        color = ColorUtil.mixColor(RagiColor.GRAY to 1, RagiColor.WHITE to 2).rgb
        crystalType = CrystalType.METAL
        formula = "Fe"
        molar = 55.8
        tempBoil = 3134
        tempMelt = 1811
    }

    @JvmField
    val COBALT = materialOf("cobalt", 27) {
        color = RagiColor.BLUE.rgb
        crystalType = CrystalType.METAL
        formula = "Co"
        molar = 58.9
        tempBoil = 3200
        tempMelt = 1768
    }

    @JvmField
    val NICKEL = materialOf("nickel", 28) {
        color = ColorUtil.mixColor(RagiColor.GOLD, RagiColor.WHITE).rgb
        crystalType = CrystalType.METAL
        formula = "Ni"
        molar = 58.7
        tempBoil = 3186
        tempMelt = 1728
    }

    @JvmField
    val COPPER = materialOf("copper", 29) {
        color = ColorUtil.mixColor(RagiColor.GOLD, RagiColor.RED).rgb
        crystalType = CrystalType.METAL
        formula = "Cu"
        molar = 63.5
        tempBoil = 2835
        tempMelt = 1358
    }

    @JvmField
    val ZINC = materialOf("zinc", 30) {
        color = ColorUtil.mixColor(RagiColor.GREEN to 1, RagiColor.WHITE to 2).rgb
        crystalType = CrystalType.METAL
        formula = "Zn"
        molar = 65.4
        tempBoil = 1180
        tempMelt = 693
    }

    @JvmField
    val GALLIUM = materialOf("gallium", 31) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Ga"
        molar = 69.7
        tempBoil = 2673
        tempMelt = 303
    }

    @JvmField
    val GERMANIUM = materialOf("germanium", 32) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Ge"
        molar = 72.6
        tempBoil = 3106
        tempMelt = 1211
    }

    @JvmField
    val ARSENIC = materialOf("arsenic", 33) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "As"
        molar = 74.9
        //tempBoil = 887
        //tempMelt = 1090
        tempSubl = 887
    }

    @JvmField
    val SELENIUM = materialOf("selenium", 34) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Se"
        molar = 74.9
        tempBoil = 958
        tempMelt = 453
    }

    @JvmField
    val BROMINE = materialOf("bromine", 35) {
        color = RagiColor.GOLD.rgb
        formula = "Br"
        molar = 79.9
        tempBoil = 332
        tempMelt = 267
    }

    @JvmField
    val KRYPTON = materialOf("krypton", 36) {
        color = RagiColor.LIGHT_PURPLE.rgb
        formula = "Kr"
        molar = 83.8
        tempBoil = 120
        tempMelt = 116
    }

    //    5th Period    //

    @JvmField
    val RUBIDIUM = materialOf("rubidium", 37) {
        color = ColorUtil.mixColor(RagiColor.DARK_BLUE to 3, RagiColor.BLUE to 2).rgb
        crystalType = CrystalType.METAL
        formula = "Rb"
        molar = 85.5
        tempBoil = 961
        tempMelt = 312
    }

    @JvmField
    val STRONTIUM = materialOf("strontium", 38) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Sr"
        molar = 87.6
        tempBoil = 1655
        tempMelt = 1050
    }

    @JvmField
    val YTTRIUM = materialOf("yttrium", 39) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Y"
        molar = 88.9
        tempBoil = 3609
        tempMelt = 1799
    }

    @JvmField
    val ZIRCONIUM = materialOf("zirconium", 40) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Zr"
        molar = 91.2
        tempBoil = 4682
        tempMelt = 2128
    }

    @JvmField
    val NIOBIUM = materialOf("niobium", 41) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Nb"
        molar = 92.9
        tempBoil = 5017
        tempMelt = 2750
    }

    @JvmField
    val MOLYBDENUM = materialOf("molybdenum", 42) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Mo"
        molar = 96.0
        tempBoil = 4912
        tempMelt = 2896
    }

    @JvmField
    val TECHNETIUM = materialOf("technetium", 43) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Tc"
        //molar = 97.0/98.0/99.0
        tempBoil = 4538
        tempMelt = 2430
    }

    @JvmField
    val RUTHENIUM = materialOf("ruthenium", 44) {
        color = ColorUtil.mixColor(RagiColor.BLUE to 1, RagiColor.LIGHT_PURPLE to 3).rgb
        crystalType = CrystalType.METAL
        formula = "Ru"
        molar = 101.1
        tempBoil = 4423
        tempMelt = 2607
    }

    @JvmField
    val RHODIUM = materialOf("rhodium", 45) {
        color = ColorUtil.mixColor(RagiColor.BLUE to 1, RagiColor.RED to 3).rgb
        crystalType = CrystalType.METAL
        formula = "Rh"
        molar = 102.9
        tempBoil = 3968
        tempMelt = 2237
    }

    @JvmField
    val PALLADIUM = materialOf("palladium", 46) {
        color = ColorUtil.mixColor(RagiColor.BLUE to 1, RagiColor.YELLOW to 3).rgb
        crystalType = CrystalType.METAL
        formula = "Pd"
        molar = 106.4
        tempBoil = 3236
        tempMelt = 1828
    }

    @JvmField
    val SILVER = materialOf("silver", 47) {
        color = ColorUtil.mixColor(RagiColor.AQUA to 1, RagiColor.WHITE to 3).rgb
        crystalType = CrystalType.METAL
        formula = "Ag"
        molar = 107.9
        tempBoil = 2435
        tempMelt = 1235
    }

    @JvmField
    val CADMIUM = materialOf("cadmium", 48) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Cd"
        molar = 112.4
        tempBoil = 1040
        tempMelt = 594
    }

    @JvmField
    val INDIUM = materialOf("indium", 49) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "In"
        molar = 114.8
        tempBoil = 2345
        tempMelt = 430
    }

    @JvmField
    val TIN = materialOf("tin", 50) {
        color = ColorUtil.mixColor(RagiColor.BLUE to 1, RagiColor.AQUA to 1, RagiColor.WHITE to 3).rgb
        crystalType = CrystalType.METAL
        formula = "Sn"
        molar = 118.7
        tempBoil = 2875
        tempMelt = 505
    }

    @JvmField
    val ANTIMONY = materialOf("antimony", 51) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Sb"
        molar = 121.8
        tempBoil = 1860
        tempMelt = 904
    }

    @JvmField
    val TELLURIUM = materialOf("tellurium", 52) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Te"
        molar = 127.6
        tempBoil = 1261
        tempMelt = 723
    }

    @JvmField
    val IODINE = materialOf("iodine", 53) {
        color = RagiColor.DARK_PURPLE.rgb
        formula = "I"
        molar = 126.9
        tempBoil = 457
        tempMelt = 387
    }

    @JvmField
    val XENON = materialOf("xenon", 54) {
        color = RagiColor.LIGHT_PURPLE.rgb
        formula = "Xe"
        molar = 131.3
        tempBoil = 165
        tempMelt = 161
    }

    //    6th Period    //

    @JvmField
    val CAESIUM = materialOf("caesium", 55) {
        color = ColorUtil.mixColor(RagiColor.DARK_BLUE to 4, RagiColor.BLUE to 1).rgb
        crystalType = CrystalType.METAL
        formula = "Cs"
        molar = 132.9
        tempBoil = 944
        tempMelt = 302
    }

    @JvmField
    val BARIUM = materialOf("barium", 56) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Ba"
        molar = 137.3
        tempBoil = 2170
        tempMelt = 1000
    }

    //    Lanthanides Start    //

    @JvmField
    val LANTHANUM = materialOf("lanthanum", 57) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "La"
        molar = 138.9
        tempBoil = 3737
        tempMelt = 1193
    }

    @JvmField
    val CERIUM = materialOf("cerium", 58) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Ce"
        molar = 140.1
        tempBoil = 3716
        tempMelt = 1068
    }

    @JvmField
    val PRASEODYMIUM = materialOf("praseodymium", 59) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Pr"
        molar = 140.9
        tempBoil = 3793
        tempMelt = 1208
    }

    @JvmField
    val NEODYMIUM = materialOf("neodymium", 60) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Nd"
        molar = 144.2
        tempBoil = 3347
        tempMelt = 1297
    }

    @JvmField
    val PROMETHIUM = materialOf("promethium", 61) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Pm"
        //molar = 145.0
        tempBoil = 3237
        tempMelt = 1315
    }

    @JvmField
    val SAMARIUM = materialOf("samarium", 62) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Sm"
        molar = 150.4
        tempBoil = 2067
        tempMelt = 1345
    }

    @JvmField
    val EUROPIUM = materialOf("europium", 63) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Eu"
        molar = 152.0
        tempBoil = 1802
        tempMelt = 1099
    }

    @JvmField
    val GADOLINIUM = materialOf("gadolinium", 64) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Gd"
        molar = 157.3
        tempBoil = 3546
        tempMelt = 1585
    }

    @JvmField
    val TERBIUM = materialOf("terbium", 65) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Tb"
        molar = 158.9
        tempBoil = 3503
        tempMelt = 1629
    }

    @JvmField
    val DYSPROSIUM = materialOf("dysprosium", 66) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Dy"
        molar = 157.3
        tempBoil = 2840
        tempMelt = 1680
    }

    @JvmField
    val HOLMIUM = materialOf("holmium", 67) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Ho"
        molar = 164.9
        tempBoil = 2993
        tempMelt = 1734
    }

    @JvmField
    val ERBIUM = materialOf("erbium", 68) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Er"
        molar = 167.3
        tempBoil = 3141
        tempMelt = 1802
    }

    @JvmField
    val THULIUM = materialOf("thulium", 69) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Tm"
        molar = 168.9
        tempBoil = 2223
        tempMelt = 1818
    }

    @JvmField
    val YTTERBIUM = materialOf("ytterbium", 70) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Yb"
        molar = 173.0
        tempBoil = 1469
        tempMelt = 1097
    }

    @JvmField
    val LUTETIUM = materialOf("lutetium", 71) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Lu"
        molar = 175.0
        tempBoil = 3675
        tempMelt = 1925
    }

    //    Lanthanides End    //

    @JvmField
    val HAFNIUM = materialOf("hafnium", 72) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Hf"
        molar = 178.5
        tempBoil = 4876
        tempMelt = 2506
    }

    @JvmField
    val TANTALUM = materialOf("tantalum", 73) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Ta"
        molar = 180.9
        tempBoil = 5731
        tempMelt = 3290
    }

    @JvmField
    val TUNGSTEN = materialOf("tungsten", 74) {
        color = ColorUtil.mixColor(RagiColor.BLACK to 2, RagiColor.DARK_GRAY to 1).rgb
        crystalType = CrystalType.METAL
        formula = "W"
        molar = 183.8
        tempBoil = 5828
        tempMelt = 3695
    }

    @JvmField
    val RHENIUM = materialOf("rhenium", 75) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Re"
        molar = 186.2
        tempBoil = 5869
        tempMelt = 3459
    }

    @JvmField
    val OSMIUM = materialOf("osmium", 76) {
        color = ColorUtil.mixColor(RagiColor.BLUE to 1, RagiColor.WHITE to 3).rgb
        crystalType = CrystalType.METAL
        formula = "Os"
        molar = 190.2
        tempBoil = 5285
        tempMelt = 3306
    }

    @JvmField
    val IRIDIUM = materialOf("iridium", 77) {
        color = ColorUtil.mixColor(RagiColor.AQUA to 1, RagiColor.WHITE to 3).rgb
        crystalType = CrystalType.METAL
        formula = "Ir"
        molar = 192.2
        tempBoil = 4701
        tempMelt = 2719
    }

    @JvmField
    val PLATINUM = materialOf("platinum", 78) {
        color = ColorUtil.mixColor(RagiColor.GREEN to 1, RagiColor.WHITE to 3).rgb
        crystalType = CrystalType.METAL
        formula = "Pt"
        molar = 195.1
        tempBoil = 4098
        tempMelt = 2041
    }

    @JvmField
    val GOLD = materialOf("gold", 79) {
        color = ColorUtil.mixColor(RagiColor.GOLD, RagiColor.YELLOW).rgb
        crystalType = CrystalType.METAL
        formula = "Au"
        molar = 197.0
        tempBoil = 3129
        tempMelt = 1337
    }

    @JvmField
    val MERCURY = materialOf("mercury", 80) {
        formula = "Hg"
        molar = 200.6
        tempBoil = 670
        tempMelt = 234
    }

    @JvmField
    val THALLIUM = materialOf("thallium", 81) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Tl"
        molar = 204.4
        tempBoil = 1749
        tempMelt = 577
    }

    @JvmField
    val LEAD = materialOf("lead", 82) {
        color = ColorUtil.mixColor(RagiColor.DARK_BLUE, RagiColor.DARK_GRAY, RagiColor.WHITE).rgb
        crystalType = CrystalType.METAL
        formula = "Pb"
        molar = 207.2
        tempBoil = 2022
        tempMelt = 601
    }

    @JvmField
    val BISMUTH = materialOf("bismuth", 83) {
        color = RagiColor.AQUA.rgb
        crystalType = CrystalType.METAL
        formula = "Bi"
        molar = 209.0
        tempBoil = 1837
        tempMelt = 545
    }

    @JvmField
    val POLONIUM = materialOf("polonium", 84) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Po"
        //molar = 209.0/210.0
        tempBoil = 1235
        tempMelt = 527
    }

    @JvmField
    val ASTATINE = materialOf("astatine", 85) {
        color = RagiColor.BLACK.rgb
        formula = "At"
        //molar = 210.0
        tempBoil = 610
        tempMelt = 575
    }

    @JvmField
    val RADON = materialOf("radon", 86) {
        color = RagiColor.LIGHT_PURPLE.rgb
        formula = "Rn"
        //molar = 222.0
        tempBoil = 211
        tempMelt = 202
    }

    //    7th Period    //

    @JvmField
    val FRANCIUM = materialOf("francium", 87) {
        color = RagiColor.DARK_BLUE.rgb
        formula = "Fr"
        //molar = 223.0
        tempBoil = 890
        tempMelt = 281
    }

    @JvmField
    val RADIUM = materialOf("radium", 88) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Ra"
        //molar = 226.0
        tempBoil = 2010
        tempMelt = 973
    }

    //    Actinides Start    //

    @JvmField
    val ACTINIUM = materialOf("actinium", 89) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Ac"
        //molar = 227.0
        tempBoil = 3471
        tempMelt = 1323
    }

    @JvmField
    val THORIUM = materialOf("thorium", 90) {
        color = ColorUtil.mixColor(RagiColor.BLACK to 2, RagiColor.DARK_GREEN to 1, RagiColor.GRAY to 1).rgb
        crystalType = CrystalType.METAL
        formula = "Th"
        molar = 232.0
        tempBoil = 5061
        tempMelt = 2115
    }

    @JvmField
    val PROTACTINIUM = materialOf("protactinium", 91) {
        color = RagiColor.GRAY.rgb
        crystalType = CrystalType.METAL
        formula = "Pa"
        molar = 231.0
        tempBoil = 4300
        tempMelt = 1841
    }

    @JvmField
    val URANIUM = materialOf("uranium", 92) {
        color = RagiColor.GREEN.rgb
        crystalType = CrystalType.METAL
        formula = "U"
        molar = 238.0
        tempBoil = 4404
        tempMelt = 1405
    }

    @JvmField
    @Deprecated("URANIUM distortions.")
    val URANIUM238 = materialOf("uranium238", 92) {
        color = RagiColor.GREEN.rgb
        crystalType = CrystalType.METAL
        formula = "U"
        molar = 238.0
        tempBoil = 4404
        tempMelt = 1405
    }

    @JvmField
    val NEPTUNIUM = materialOf("neptunium", 93) {
        color = RagiColor.BLUE.rgb
        crystalType = CrystalType.METAL
        formula = "Np"
        //molar = 237.0
        tempBoil = 4273
        tempMelt = 917
    }

    @JvmField
    val PLUTONIUM244 = materialOf("plutonium244", 94) {
        color = RagiColor.RED.rgb
        crystalType = CrystalType.METAL
        formula = "Pu244"
        molar = 244.1
        tempBoil = 3501
        tempMelt = 913
    }

    @JvmField
    val AMERICIUM = materialOf("americium", 95) {
        crystalType = CrystalType.METAL
        formula = "Am"
        //molar = 243.0
        tempBoil = 1880
        tempMelt = 1449
    }

    @JvmField
    val CURIUM = materialOf("curium", 96) {
        crystalType = CrystalType.METAL
        formula = "Cm"
        //molar = 247.0
        tempBoil = 3383
        tempMelt = 1613
    }

    @JvmField
    val BERKELIUM = materialOf("berkelium", 97) {
        crystalType = CrystalType.METAL
        formula = "Bk"
        //molar = 247.0
        tempBoil = 2900
        tempMelt = 1259
    }

    @JvmField
    val CALIFORNIUM = materialOf("californium", 98) {
        crystalType = CrystalType.METAL
        formula = "Cf"
        //molar = 251.0/252.0
        tempBoil = 1743
        tempMelt = 1173
    }

    @JvmField
    val EINSTEINIUM = materialOf("einsteinium", 99) {
        crystalType = CrystalType.METAL
        formula = "Es"
        //molar = 252.0
        tempBoil = 1269
        tempMelt = 1133
    }

    @JvmField
    val FERMIUM = materialOf("fermium", 100) {
        crystalType = CrystalType.METAL
        formula = "Fm"
        //molar = 257.0
        //tempBoil =
        //tempMelt = 1125/1800
    }

    @JvmField
    val MENDELEVIUM = materialOf("mendelevium", 101) {
        crystalType = CrystalType.METAL
        formula = "Md"
        //molar = 258.0
        //tempBoil =
        //tempMelt = 1100
    }

    @JvmField
    val NOBELIUM = materialOf("nobelium", 102) {
        crystalType = CrystalType.METAL
        formula = "No"
        //molar = 259.0
        //tempBoil =
        //tempMelt = 1100
    }

    @JvmField
    val LAWRENCIUM = materialOf("lawrencium", 103) {
        crystalType = CrystalType.METAL
        formula = "Lr"
        //molar = 262.0/266.0
        //tempBoil =
        //tempMelt = 1900
    }

    //    Actinides End    //

    @JvmField
    val RUTHERFORDIUM = materialOf("rutherfordium", 104) {
        crystalType = CrystalType.METAL
        formula = "Lr"
        //molar = 261.1/267.0
        //tempBoil = 5800
        //tempMelt = 2400
    }

    @JvmField
    val DUBNIUM = materialOf("dubnium", 105) {
        crystalType = CrystalType.METAL
        formula = "Db"
        //molar = 265.0/268.0
        //tempBoil =
        //tempMelt =
    }

    @JvmField
    val SEABORGIUM = materialOf("seaborgium", 106) {
        crystalType = CrystalType.METAL
        formula = "Sg"
        //molar = 269.0/271.0
        //tempBoil =
        //tempMelt =
    }

    @JvmField
    val BOHRIUM = materialOf("bohrium", 107) {
        crystalType = CrystalType.METAL
        formula = "Bh"
        //molar = 270.0/272.0
        //tempBoil =
        //tempMelt =
    }

    @JvmField
    val HASSIUM = materialOf("hassium", 108) {
        crystalType = CrystalType.METAL
        formula = "Hs"
        //molar = 269.0/277.0
        //tempBoil =
        //tempMelt =
    }

    @JvmField
    val MEITNERIUM = materialOf("meitnerium", 109) {
        crystalType = CrystalType.METAL
        formula = "Mt"
        //molar = 276.0/278.0
        //tempBoil =
        //tempMelt =
    }

    @JvmField
    val DARMSTADTIUM = materialOf("darmstadtium", 110) {
        crystalType = CrystalType.METAL
        formula = "Ds"
        //molar = 281.0
        //tempBoil =
        //tempMelt =
    }

    @JvmField
    val ROENTGENIUM = materialOf("roentgenium", 111) {
        crystalType = CrystalType.METAL
        formula = "Rg"
        //molar = 280.0/281.0/282.0
        //tempBoil =
        //tempMelt =
    }

    @JvmField
    val COPERNICIUM = materialOf("copernicium", 112) {
        crystalType = CrystalType.METAL
        formula = "Cn"
        //molar = 285.0
        //tempBoil = 340
        //tempMelt = 283
    }

    @JvmField
    val NIHONIUM = materialOf("nihonium", 113) {
        crystalType = CrystalType.METAL
        formula = "Nh"
        //molar = 278.0/286.0
        //tempBoil = 1400
        //tempMelt = 700
    }

    @JvmField
    val FLEROVIUM = materialOf("flerovium", 114) {
        crystalType = CrystalType.METAL
        formula = "Fl"
        //molar = 289.0
        //tempBoil =
        //tempMelt = 284
    }

    @JvmField
    val MOSCOVIUM = materialOf("moscovium", 115) {
        crystalType = CrystalType.METAL
        formula = "Mc"
        //molar = 289.0/290.0
        //tempBoil = 1400
        //tempMelt = 700
    }

    @JvmField
    val LIVERMORIUM = materialOf("livermorium", 116) {
        crystalType = CrystalType.METAL
        formula = "Lv"
        //molar = 293.0
        //tempBoil = 1100
        //tempMelt = 700
    }

    @JvmField
    val TENNESSINE = materialOf("tennessine", 117) {
        crystalType = CrystalType.METAL
        formula = "Ts"
        //molar = 293.0/294.0
        //tempBoil = 883
        //tempMelt = 700
    }

    @JvmField
    val OGANESSON = materialOf("oganesson", 118) {
        crystalType = CrystalType.METAL
        formula = "Og"
        //molar = 294.0
        //tempBoil = 450
        //tempMelt = 352
    }

    //    Isotope    //

    @JvmField
    val DEUTERIUM = materialOf("deuterium", 120) {
        color = HYDROGEN.color
        formula = "D"
        molar = 2.0
        tempBoil = HYDROGEN.tempBoil
        tempMelt = HYDROGEN.tempMelt
    }

    @JvmField
    val TRITIUM = materialOf("tritium", 121) {
        color = HYDROGEN.color
        formula = "T"
        molar = 3.0
        tempBoil = HYDROGEN.tempBoil
        tempMelt = HYDROGEN.tempMelt
    }

    @JvmField
    val URANIUM235 = materialOf("uranium235", 122) {
        color = URANIUM238.color
        crystalType = URANIUM238.crystalType
        formula = "U235"
        molar = 235.0
        tempBoil = URANIUM238.tempBoil
        tempMelt = URANIUM238.tempMelt
    }

    fun init() {
        // --1st Period--
        MaterialRegistry.registerMaterial(HYDROGEN)
        MaterialRegistry.registerMaterial(HELIUM)
        // --2nd Period--
        MaterialRegistry.registerMaterial(LITHIUM)
        MaterialRegistry.registerMaterial(BERYLLIUM)
        MaterialRegistry.registerMaterial(BORON)
        MaterialRegistry.registerMaterial(CARBON)
        MaterialRegistry.registerMaterial(NITROGEN)
        MaterialRegistry.registerMaterial(OXYGEN)
        MaterialRegistry.registerMaterial(FLUORINE)
        MaterialRegistry.registerMaterial(NEON)
        // --3rd Period--
        MaterialRegistry.registerMaterial(SODIUM)
        MaterialRegistry.registerMaterial(MAGNESIUM)
        MaterialRegistry.registerMaterial(ALUMINIUM)
        MaterialRegistry.registerMaterial(ALUMINUM)
        MaterialRegistry.registerMaterial(SILICON)
        MaterialRegistry.registerMaterial(PHOSPHORUS)
        MaterialRegistry.registerMaterial(SULFUR)
        MaterialRegistry.registerMaterial(CHLORINE)
        MaterialRegistry.registerMaterial(ARGON)
        // --4th Period--
        MaterialRegistry.registerMaterial(POTASSIUM)
        MaterialRegistry.registerMaterial(CALCIUM)
        MaterialRegistry.registerMaterial(SCANDIUM)
        MaterialRegistry.registerMaterial(TITANIUM)
        MaterialRegistry.registerMaterial(VANADIUM)
        MaterialRegistry.registerMaterial(CHROMIUM)
        MaterialRegistry.registerMaterial(CHROME)
        MaterialRegistry.registerMaterial(MANGANESE)
        MaterialRegistry.registerMaterial(IRON)
        MaterialRegistry.registerMaterial(COBALT)
        MaterialRegistry.registerMaterial(NICKEL)
        MaterialRegistry.registerMaterial(COPPER)
        MaterialRegistry.registerMaterial(ZINC)
        MaterialRegistry.registerMaterial(GALLIUM)
        MaterialRegistry.registerMaterial(GERMANIUM)
        MaterialRegistry.registerMaterial(ARSENIC)
        MaterialRegistry.registerMaterial(SELENIUM)
        MaterialRegistry.registerMaterial(BROMINE)
        MaterialRegistry.registerMaterial(KRYPTON)
        // --5th Period--
        MaterialRegistry.registerMaterial(RUBIDIUM)
        MaterialRegistry.registerMaterial(STRONTIUM)
        MaterialRegistry.registerMaterial(YTTRIUM)
        MaterialRegistry.registerMaterial(ZIRCONIUM)
        MaterialRegistry.registerMaterial(NIOBIUM)
        MaterialRegistry.registerMaterial(MOLYBDENUM)
        MaterialRegistry.registerMaterial(TECHNETIUM)
        MaterialRegistry.registerMaterial(RUTHENIUM)
        MaterialRegistry.registerMaterial(RHODIUM)
        MaterialRegistry.registerMaterial(PALLADIUM)
        MaterialRegistry.registerMaterial(SILVER)
        MaterialRegistry.registerMaterial(CADMIUM)
        MaterialRegistry.registerMaterial(INDIUM)
        MaterialRegistry.registerMaterial(TIN)
        MaterialRegistry.registerMaterial(ANTIMONY)
        MaterialRegistry.registerMaterial(TELLURIUM)
        MaterialRegistry.registerMaterial(IODINE)
        MaterialRegistry.registerMaterial(XENON)
        // --6th Period--
        MaterialRegistry.registerMaterial(CAESIUM)
        MaterialRegistry.registerMaterial(BARIUM)
        // --Lanthanides--
        if (RMConfig.enableLanthanides) {
            MaterialRegistry.registerMaterial(LANTHANUM)
            MaterialRegistry.registerMaterial(CERIUM)
            MaterialRegistry.registerMaterial(PRASEODYMIUM)
            MaterialRegistry.registerMaterial(NEODYMIUM)
            MaterialRegistry.registerMaterial(PROMETHIUM)
            MaterialRegistry.registerMaterial(SAMARIUM)
            MaterialRegistry.registerMaterial(EUROPIUM)
            MaterialRegistry.registerMaterial(GADOLINIUM)
            MaterialRegistry.registerMaterial(TERBIUM)
            MaterialRegistry.registerMaterial(DYSPROSIUM)
            MaterialRegistry.registerMaterial(HOLMIUM)
            MaterialRegistry.registerMaterial(ERBIUM)
            MaterialRegistry.registerMaterial(THULIUM)
            MaterialRegistry.registerMaterial(YTTERBIUM)
            MaterialRegistry.registerMaterial(LUTETIUM)
        }
        MaterialRegistry.registerMaterial(HAFNIUM)
        MaterialRegistry.registerMaterial(TANTALUM)
        MaterialRegistry.registerMaterial(TUNGSTEN)
        MaterialRegistry.registerMaterial(RHENIUM)
        MaterialRegistry.registerMaterial(OSMIUM)
        MaterialRegistry.registerMaterial(IRIDIUM)
        MaterialRegistry.registerMaterial(PLATINUM)
        MaterialRegistry.registerMaterial(GOLD)
        MaterialRegistry.registerMaterial(MERCURY)
        MaterialRegistry.registerMaterial(THALLIUM)
        MaterialRegistry.registerMaterial(LEAD)
        MaterialRegistry.registerMaterial(BISMUTH)
        MaterialRegistry.registerMaterial(POLONIUM)
        MaterialRegistry.registerMaterial(ASTATINE)
        MaterialRegistry.registerMaterial(RADON)
        // --7th Period--
        MaterialRegistry.registerMaterial(FRANCIUM)
        MaterialRegistry.registerMaterial(RADIUM)
        // --Actinides Start--
        MaterialRegistry.registerMaterial(ACTINIUM)
        MaterialRegistry.registerMaterial(THORIUM)
        MaterialRegistry.registerMaterial(PROTACTINIUM)
        MaterialRegistry.registerMaterial(URANIUM)
        MaterialRegistry.registerMaterial(URANIUM238)
        MaterialRegistry.registerMaterial(NEPTUNIUM)
        MaterialRegistry.registerMaterial(PLUTONIUM244)
        if (RMConfig.enableTransuraniumElement) {
            MaterialRegistry.registerMaterial(AMERICIUM)
            MaterialRegistry.registerMaterial(CURIUM)
            MaterialRegistry.registerMaterial(BERKELIUM)
            MaterialRegistry.registerMaterial(CALIFORNIUM)
            MaterialRegistry.registerMaterial(EINSTEINIUM)
            MaterialRegistry.registerMaterial(FERMIUM)
            MaterialRegistry.registerMaterial(MENDELEVIUM)
            MaterialRegistry.registerMaterial(NOBELIUM)
            MaterialRegistry.registerMaterial(LAWRENCIUM)
            // --Actinides End--
            MaterialRegistry.registerMaterial(RUTHERFORDIUM)
            MaterialRegistry.registerMaterial(DUBNIUM)
            MaterialRegistry.registerMaterial(SEABORGIUM)
            MaterialRegistry.registerMaterial(BOHRIUM)
            MaterialRegistry.registerMaterial(HASSIUM)
            MaterialRegistry.registerMaterial(MEITNERIUM)
            MaterialRegistry.registerMaterial(DARMSTADTIUM)
            MaterialRegistry.registerMaterial(ROENTGENIUM)
            MaterialRegistry.registerMaterial(COPERNICIUM)
            MaterialRegistry.registerMaterial(NIHONIUM)
            MaterialRegistry.registerMaterial(FLEROVIUM)
            MaterialRegistry.registerMaterial(MOSCOVIUM)
            MaterialRegistry.registerMaterial(LIVERMORIUM)
            MaterialRegistry.registerMaterial(TENNESSINE)
            MaterialRegistry.registerMaterial(OGANESSON)
        }
        // --Isotope--
        MaterialRegistry.registerMaterial(DEUTERIUM)
        MaterialRegistry.registerMaterial(TRITIUM)
        MaterialRegistry.registerMaterial(URANIUM235)
    }
}