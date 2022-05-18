package menu

import listacompras.ListaCompras.Companion.informarNomeAlimento
import listacompras.ListaCompras.Companion.informarQuantidadeVerduraGrao
import kotlin.system.exitProcess

class Menu {
    companion object {
        private var listaAlimentos: HashMap<String, Number> = HashMap()


        fun menu() {
            println("Digite o tipo de alimento que deseja incluir na lista")
            println("Verdura")
            println("Legume")
            println("Grão")
            println("Outros")
            println("Ver lista")
            println("Sair")
            var alimento = verificarValidacao()
            while ((alimento != "verdura") && (alimento != "legume") && (alimento != "grão") && (alimento != "grao") && (alimento != "outros") && (alimento != "ver lista") && (alimento != "sair")) {
                println("Tipo de alimento inválido")
                alimento = verificarValidacao()
            }

            when (alimento) {
                "verdura", "grão", "grao" -> {
                    /*Não é para mexer aqui*/
                    val quantidade = informarQuantidadeVerduraGrao(alimento)
                    val nome = informarNomeAlimento(alimento)

                    listaAlimentos[nome] = quantidade
                    menu()
                }
                "legume", "outros" -> {
                    //TODO: terminar de implementar lógica (1/3)
                }
                "ver lista" -> {
                    //TODO: terminar de implementar lógica (2/3)
                    /*listaAlimentos.forEach { alimento, quantidade ->  }*/
                }
                "sair" -> {
                    println("Até breve!")
                    exitProcess(0)
                }
            }
        }

        fun verificarValidacao(): String{
            return try {
                val imput = readln().lowercase()
                imput
            } catch (exception: Exception) {
                println("Opção inválida, tente novamente")
                verificarValidacao()
            }
        }

        fun validarNumeroDigitado(): Int {
            return try {
                var numero = readln().toInt()
                while (numero <= 0) {
                    println("Inválido, tente digitar um número inteiro positivo")
                    numero = readln().toInt()
                }
                numero
            } catch (exception: UnsupportedOperationException){
                println("Não é permitido inserir valor vazio")
                validarNumeroDigitado()
            } catch (exception: NumberFormatException) {
                println("Não é permitido texto, somente número")
                validarNumeroDigitado()
            }
        }
    }
}