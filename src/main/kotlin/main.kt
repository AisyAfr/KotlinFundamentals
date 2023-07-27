import com.sun.tools.javac.Main
fun main() {



//    val isy = "aisy" + 97 + true//untuk gabungin berbagai jenis tipe data
//    println(isy)
//    print(isy.length)

//    val officeIsOpen = 7
//    val officeIsClose = 23
//    val now = 24
//
//    val isOpen = if (now >= officeIsOpen || now <= officeIsClose){
//        println("open")
//    } else {
//        println("close")
//    }
//    println("Office is open : $isOpen")

//    val convertToByte : Byte = bilanganPertama.toByte()
//    val convertToDouble : Double = bilanganPertama.toDouble()
//
//    println(convertToByte)
//    println(convertToDouble)




//        //belajar bikin variabel
//    val name = "Aisy"
//    val umur = 15
//    val hobi = "Bersenang-senang"
//    val alamat = "Jakarta Timur"
//
//    println("Halo! Nama saya ${name}, saya berumur ${umur} tahun ")
//    println("Saya tinggal di ${alamat} dan hobby saya adalah ${hobi}")
//
//    Puisi(name, umur, hobi, alamat)



//    var a = 2
//    var b = 4
//
//    a+=b//a + b
//    println("nilainya adalah $b")

//    var phoneNumber = "12346886688766990"
//    val min = 11
//    val max = 13
//
//    if(phoneNumber.length >= min && phoneNumber.length <=max){
//        println("nomor sudah sesuai")
//    }else if (phoneNumber.length < min) {
//        println("nomor kurang ${min - phoneNumber.length}")
//    }else{
//        println("nomor kelebihan ${phoneNumber.length - max}")
//    }
//
//    var angka = 9
//    println(angka++)

//    val a = 11
//    val b = 10
//    var max = a
//
//    if (a<b) max = b
//    println(max)

//    var data = "aisy"
//
//    var status = if (data != null) "terisi" else "data masih null"
//    println(status)

//    var some : Int
//    var  a = 19
//    var b = a
//
//    if(a > b){
//        some = a
//    }else if(a == b){
//        some = 24
//    }else{
//        some = b
//    }
//
//    println(some)

//    println("hasilnya adalah ${penjumlahan(2,5)}")

//    sumNumbers(3,2,4)
    val angka1 = 7.5
    val angka2 = 2.5
    kalkulator(angka1.toDouble(),angka2.toDouble())
}

//
//val penjumlahan = {
//    nilai1:Int,
//        nilai2:Int
//        ->
//    nilai1 + nilai2
//}

fun kalkulator(num1:Double, num2:Double){
    var result = num1 /num2
    val isDecimalZero = result % 1.0 == 0.0
    val output = if(isDecimalZero){
        println("hasil dari " + num1.toInt() + " dibagi " + num2.toInt() + " adalah "+ result.toInt())
    } else{
        println("hasil dari " + num1.toInt() + " dibagi " + num2.toInt() + " adalah " + result)
    }
}


//data class DataInduk(
//    var name: String,
//    var age: Int,
//    var height: Int,
//    var weight: Int   `
//)


//fun Puisi(name:String, umur:Int, hobi:String, alamat:String) {
//    println("Namanya adalah ${name}")
//    println("Umurnya ${umur}")
//    println("Dia suka ${hobi}")
//    println("Ia bertempat tinggal di ${alamat}")
//}

