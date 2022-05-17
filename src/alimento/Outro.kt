package alimento

class Outro(override val nome: String, override val quantidade: Int, override val tipo: String = "outros") : Alimento {
}