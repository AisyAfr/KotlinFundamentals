fun main(){
    sumNumbers(3,2,4)
}

fun sumNumbers(
    vararg
    number: Int
) {
    var total = number[1] * number[2]
    println(total)
}//vararg itu gunanya agar mempersingkat parameter
