fun main(){
    var kehadiran = arrayOf("aisy","rehan","fahmi")
    for (name in kehadiran) {
        println ("Atas nama $name")
    }

    var name = "santoso"
    for (n in name){
        println("\"$n\"")
    }

    for (i in 1.rangeTo(5)){
        println(i)
    }

    for (index in (20.downTo(9) step 3)){
        println(index)
    }

    val power = 6
    val base = 2
    var result = 1
    for (count in 1..power){
        result *= base
    }
    println("hasil ${base} pangkat ${power} adalah = $result")

}