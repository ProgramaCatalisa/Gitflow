package alimento

class Legume(override val nome: String, override val quantidade: Int, override val tipo: String = "legume") : Alimento {
}