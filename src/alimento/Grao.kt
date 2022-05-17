package alimento

class Grao(override val nome: String, override val quantidade: Int, override val tipo: String = "grão") : Alimento {
}