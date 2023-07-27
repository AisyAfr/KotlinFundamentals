fun main(){
    //null safety
    var aisy = "aisy"
    println(aisy?.length)

    var kosong : String? = null
    println(kosong)
    kosong = "alter ego"
    for (haha in kosong.reversed()){
        println(haha)
    }
    kosong = "wakwaw"
    if(kosong != null){
        println("datanya null")
    }else {
        println("ada: ${kosong?.length} karaketer")
    }
//    //elvis operator, atau bisa dibilang mempersingkat if else
    println(kosong?.length ?:10)
}