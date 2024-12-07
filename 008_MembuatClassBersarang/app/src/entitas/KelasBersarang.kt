package app.src.entitas

class Utama {
    var massage="Halo"
    fun menyapa() = "$massage , ini adalah fungsi didalam class utama"

    class bersarang {
        fun menyapa() = "dan ini adalah fungsi di kelas bersarang"
    }
}