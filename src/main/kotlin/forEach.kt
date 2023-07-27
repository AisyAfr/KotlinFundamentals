fun main(){
//    val range = 1..9
//    range.forEach{index ->
//        println(index)
//    }
    val base = 2
    val power = 6
    var result = 1
    val range = 1..power
        range.forEach {
        result *= base
    }
    println("hasil ${base} pangkat ${power} adalah = $result")

    //gunanya forEachIndexed adalah untuk mengetahui index dari sebuah data
    range.forEachIndexed { index, i ->
        println("ini adalah index ke $index dan valuenya $i")
    }
}