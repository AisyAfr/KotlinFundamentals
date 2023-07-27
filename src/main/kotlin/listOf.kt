fun main(){
    //listOf itu kumpulan yang bisa langsung di print, gak kayak array
    var listKita = listOf("one", "two", "three", "four")
    println("panjang data adalah ${listKita.size}")
    println("data pada index ke 2 ${listKita[2]}")
    println("data pada index ke 3 ${listKita[3]}")
    println("nomor index untuk \"two\" adalah ${listKita.indexOf("two")}")

    var mix =  listOf("tes",123,'r',true, 3.9)
    var mixArray = arrayOf("tes",123,'r',true, 3.9)

    println(mixArray.toList())//cara untuk ngeprintln array tanpa looping

    for (n in mixArray){
        println(n)
    }

    var mixMutable = mutableListOf("tes",123,'r',true, 3.9)
    mixMutable.add("tb")
    mixMutable.removeAt(1)
    mixMutable[2] = false
    mixMutable.shuffle()
    println(mixMutable)

    var regno = Person("Regno", 16)
    var people = mutableListOf(Person("Adam", 31), regno, regno)
    people[2] = Person("dzikra",17)
    println(people)
}
data class
        Person(
    var name:String,
    var age: Int,
        )