fun main(){
    var aisy = dataDiri("Aisy", 20, 157, 59)
    var ahmad = dataDiri("Ahmad", 20, 157, 59)
    var ahmad2 = ahmad.copy(age = 80, weight = 50)
    println(aisy)
    println(ahmad2)
    println(ahmad.equals(ahmad2))//equals itu buat ngecek ada yang sama apa engga
    println("""
        perkenalkan nama saya ${aisy.name}, saya berumur ${aisy.component2()}
        tinggi saya ${aisy.height} dan berat badan saya ${ahmad.component4()} """.trimIndent())
}
data class dataDiri(
    var name: String,
    var age: Int,
    var height: Int,
    var weight: Int
    )