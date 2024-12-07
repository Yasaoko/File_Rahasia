package app.src
import app.src.entitas.Siswa

fun main(){
    println("-------------------------------------------")
    println("Lat. Membuat Anonymous Inner Class : Ruella")
    println("-------------------------------------------")

    var Eunha :Siswa = object:Siswa { //anonymous class
    override fun quote(){//overriding the quote meth
    println("Eunha: Stay Halal Brother")

    }
    }
    
    var Beth :Siswa = object:Siswa { //anonymous class
    override fun quote(){//overriding the quote meth
    println("Beth: Yes Brother")
    }

}
Eunha.quote()
Beth.quote()
}