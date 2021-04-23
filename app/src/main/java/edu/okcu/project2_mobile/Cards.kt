package edu.okcu.project2_mobile

data class Cards(var Number: Int) {
    var CardImage: String
    var CardName: String
    var Found: Boolean

    init{
        this.CardImage = "_${Number}"
        this.CardName  = getName(Number)
        this.Found = false
    }

    private fun getName(name: Int): String{
        when(name){
            1 -> return "Alabama   Audemus jura nostra defendere"
            2 -> return "Alaska   North to the Future"
            3 -> return "Arizona   Ditat Deus"
            4 -> return "Arkansas   Regnat populus"
            5 -> return "California   Eureka"
            6 -> return "Colorado   Nil sine numine"
            7 -> return "Connecticut   Qui transtulit sustinet"
            8 -> return "Delaware   Liberty and Independence"
            9 -> return "Florida   In God We Trust"
            10 -> return "Georgia   Wisdom, Justice, and Moderation"
            11 -> return "Hawaii   Ua Mau ke Ea o ka Aina i ka Pono"
            12 -> return "Idaho   Esto perpetua"
            13 -> return "Illinois   State Sovereignty, National Union"
            14 -> return "Indiana   The Crossroads of America"
            15 -> return "Iowa   Our liberties we prize and our rights we will maintain"
            16 -> return "Kansas   Per aspera ad astra"
            17 -> return "Kentucky   United we stand, divided we fall"
            18 -> return "Louisiana   Union, Justice, and Confidence"
            19 -> return "Maine   Dirigo"
            20 -> return "Maryland  Fatti maschii, parole femine"
            21 -> return "Massachusetts   Ense petit placidam sub libertate quietem"
            22 -> return "Michigan   Si quaeris peninsulam amoenam circumspice"
            23 -> return "Minnesota   L'Etoile du Nord"
            24 -> return "Mississippi   Virtute et armis"
            25 -> return "Missouri   Salus populi suprema lex esto"
            26 -> return "Montana   Oro y plata"
            27 -> return "Nebraska   Equality before the law"
            28 -> return "Nevada   All for our country"
            29 -> return "New Hampshire   Audemus jura nostra defendere"
            30 -> return "New Jersey   Live Free or Die"
            31 -> return "New mexico   Crescit eundo"
            32 -> return "New York   Excelsior"
            33 -> return "North Carolina   Esse quam videri"
            34 -> return "North Dakota   Liberty and union, now and forever, one and inseparable"
            35 -> return "Ohio   With God, all things are possible\""
            36 -> return "Oklahoma   Labor omnia vincit"
            37 -> return "Oregon   Alis Volat Propriis"
            38 -> return "Pennsylvania   Virtue, Liberty, and Independence"
            39 -> return "Rhodeis land   Hope"
            40 -> return "South Carolina   Dum spiro spero / Animis opibusque parati"
            41 -> return "South Dakota   Under God the people rule"
            42 -> return "Tennessee   Agriculture and Commerce\""
            43 -> return "Texas   Friendship"
            44 -> return "Utah   Industry"
            45 -> return "Vermont   Freedom and Unity"
            46 -> return "Virginia   Sic semper tyrannis"
            47 -> return "Washington   Al-ki"
            48 -> return "West Virginia   Montani semper liberi"
            49 -> return "Wisconsin   Forward"
            50 -> return "Wyoming   Equal rights"
        }
        return "Hello"
    }
}