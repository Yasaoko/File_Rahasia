package app.src.entitas

class Utama {
    var massage="Hallo"
    fun menyapa() ="$massage , ini adalah fungsi class utama"

    inner class Dalam {
        fun menyapa() = "$massage , ini adalah fungsi class di dalam class"
        //inner class dapat memanggil atribut class utama/class luar
    }
}