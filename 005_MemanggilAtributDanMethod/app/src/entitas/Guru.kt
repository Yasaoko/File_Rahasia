package app.src.entitas

class Guru{
    //atribute
    var nama:String = "Ruella"
    var mapel:String = "B Jepang"
    var alamat:String = "Baleendah"
    //method
    fun perkenalan(){
        println("Halo Kodomotachi!, Watashi  no namae wa"+ nama)
        println("Saya dari," + alamat)
        println("Saya Mengampu Mapel"+ mapel)
    }
    fun quots( quots:String){
        println("sebuah quots Dari Saya\n"+ quots)
    }
}