package app.src.entitas

class Kucing(val _nama: String, val _usia: Int, val _ras:String) {
    //Member Variables
    var nama: String; var usia:Int; var ras:String

    //Initializer block
    //Block ini akan dipanggil  otomoatis ketika objek dari class dibuat
    init {
        this.nama = _nama
        this.usia = _usia
        this.ras = _ras
        println("$nama : $nama")
        println("$usia : $usia")
        println("$ras : $ras\n")
    }
    //method
    fun suara (suara:String)= println(suara)
}