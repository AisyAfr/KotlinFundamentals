fun main(){
    //array

    val contohArray = arrayOf("aisy", 16, true)
    val arrayint = intArrayOf(17,18,19,20)


    val asc = Array(9) {i -> (i * 4). toString()}

    //untuk ngerpint array biar keliatan
    contohArray.forEach { println(it) }


    //untuk ngeprint hurufnya satu-satu
    val basmalah = "Bismillah"
    for(index in basmalah){
        println(index)
    }
    println(basmalah.count())//untuk ngitung
    println(basmalah.first())//ngambil angka pertama
    println(basmalah[3])//ngambil index ketiga
    println("data berjumlah : " + basmalah.count())//untuk nyampur sama string

}