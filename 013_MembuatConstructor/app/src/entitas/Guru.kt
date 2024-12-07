package app.src.entitas

//class dengan constructor utama
class Guru constructor(val nama:String, val mapel:String, val email:String){
    //method
    fun infoGuru(){
        println("~ Info Guru ~")
        println("Nama : "+nama)
        println("Mapel :"+mapel)
        println("E-mail :"+email)
    }
}