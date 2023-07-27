fun main(){
    var numberMap = mapOf(
        "key1" to 1,
        "key2" to 2,
        "key3" to 3
    )//array map di php tapi versi tulisan

    println("all keys: ${numberMap.keys}")
    println("all values: ${numberMap.values}")
    println("all values: ${numberMap["key1"]}")

    var dataDiri = mutableMapOf(
        "nama" to "aisy",
        "kelas" to "XI RPL",
        "alamat" to "Jakarta Timur",
        "hobi" to mutableMapOf(
            "liburan" to "main game",
            "sekolah" to "desain"
        )
    )
    println(
        """
            Halo nama saya ${dataDiri["nama"]}
            Saya kelas ${dataDiri["kelas"]}
            Saya tinggal di ${dataDiri["alamat"]}
            Hobi saya ${dataDiri["hobi"]}
        """.trimIndent()
    )

    if("ais" in dataDiri.values)
        println("nama aisy ada")
    else
        println("nama yang kamu cari gak ada")

    println("total data ada : ${dataDiri.values}")

    var mutableMap = mutableMapOf(1 to 1, 2 to 2, 3 to 3)
    mutableMap.put(4, 4)//kalo nambahin map pake put
    mutableMap.remove(2)//masukin key nya aja
    mutableMap.replace(1, 9)//buat ganti
    mutableMap.replace(2, 2, 5)//bisa juga gini
    dataDiri.replace("hobi", "main game","main game online")
    println(dataDiri)
    println(mutableMap)

}