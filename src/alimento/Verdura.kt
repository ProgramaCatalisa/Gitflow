package alimento

class Verdura(override val nome: String, override val quantidade: Int, override val tipo: String = "verdura") :
    Alimento {
}