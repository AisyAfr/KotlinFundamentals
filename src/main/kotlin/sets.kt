fun main(){
    //jadi set itu akan menghitung satu data, jika data ada yang sama
    //maka data yang sama tersebut tidak akan dihitung
    var sets = setOf(1, 2, 3, 4, 3, 2, 1)
    println("number of elements ${sets.size}")
    if (sets.contains(5))//contains itu untuk mengecek data
        println("1 ada di variabel sets")
    var sets2 = setOf(3, 4, 2, 1)
    println("sets dan sets2 hasilnya ${sets == sets2}")

   var  mutableSet = mutableSetOf(5, 4, 2, 3, 1) //kalo setOf gabisa diganti walaupun mutable
    mutableSet.add(3)
//    println(mutableSet.indexOf(5))//indexOf untuk nyari index...jadi kek index 5 ada dimana

    var dataSets = setOf(1, 2, 3)
    var mutableSets = mutableSetOf(1, 2, 3, 4, 5, 6)
    val union = dataSets.union(mutableSets)
    println("Union of dataSets to mutableSets is ${union}")//gabungan data..tapi masih tetep make hukum set
    val intersect = dataSets.intersect(mutableSets)
//    println("intersect of dataSets to mutableSets is ${intersect} ")//kalo intersect itu ngambil yang sama

}