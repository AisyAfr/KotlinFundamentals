fun main(){
    val bilanganPertama = 10
    val bilanganKedua = 2

    Tambah(bilanganPertama,bilanganKedua)
    Kurang(bilanganPertama,bilanganKedua)
    Kali(bilanganPertama,bilanganKedua)
    Bagi(bilanganPertama,bilanganKedua)
}
fun Tambah(bilanganPertama:Int, bilanganKedua:Int){
    val jumlah = bilanganPertama + bilanganKedua
    println("Hasil penjumlahan dari ${bilanganPertama} dan ${bilanganKedua} adalah ${jumlah}" )
}

fun Kurang(bilanganPertama:Int, bilanganKedua:Int){
    val kurang = bilanganPertama - bilanganKedua
    println("Hasil pengurangan dari ${bilanganPertama} dan ${bilanganKedua} adalah ${kurang}" )
}

fun Kali(bilanganPertama:Int, bilanganKedua:Int){
    val kali = bilanganPertama * bilanganKedua
    println("Hasil perkalian dari ${bilanganPertama} dan ${bilanganKedua} adalah ${kali}" )
}

fun Bagi(bilanganPertama:Int, bilanganKedua:Int){
    val bagi = bilanganPertama. toDouble() / bilanganKedua
    println("Hasil pembagian dari ${bilanganPertama} dan ${bilanganKedua} adalah ${bagi}" )
}