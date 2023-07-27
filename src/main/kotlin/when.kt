fun main(){
    //when
var command : String
    var start = 5
    command = when(start){
        1 -> {
            "ready"
        }
        2 -> {
            "set"
        }
        3 -> {
            "go"
        }
        else -> {
            "you're done!"
        }
    }
    println(command)
    var nilaiSiswa = 69
    var ket : Char

    if (nilaiSiswa < 70) {
        ket = 'B'
    } else {
        ket = 'A'
    }

    var kata :String

    kata = when(ket) {
        'A' -> {
            "Sangat Baik"
        }
        'B' -> {
            "Cukup Baik"
        }
        else -> "Kurang Baik"
    }

    println(kata)
    var nilai = 6

    kata =  when(nilai) {
        in 1..6 -> "nilainya 1 - 6"
        !in 1..6 -> "nilainya bukan 1 - 6"
        else->"nilai tidak valid"
    }
}