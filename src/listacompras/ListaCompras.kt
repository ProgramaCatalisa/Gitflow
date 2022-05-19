package listacompras

class ListaCompras {
    companion object {
        fun informarQuantidadeVerduraGrao(alimento: String):Double{
            println("Informe a quantidade de $alimento em gramas: ")
            val input = readln()

            if (input.isEmpty() || input.isBlank()) {
                throw UnsupportedOperationException("Não é permitido inserir valor vazio")
            }
            var gramas = 0.0
            try {
                gramas = input.toDouble()
                if (gramas < 0.0) {
                    println("Não é permitido números negativos, tente novamente")
                    informarQuantidadeVerduraGrao(alimento)
                }
            } catch (exception: NumberFormatException) {
                println("Não é permitido texto, somente número")
            }
            return gramas
        }

        fun informarNomeAlimento(alimento: String): String {
            println("Informe o tipo $alimento a ser adicionado na lista: ")
            val nome = readln()

            if (nome.isEmpty() || nome.isBlank()) {
                throw UnsupportedOperationException("Não é permitido inserir valor vazio")
            }
            return nome
        }
        fun informarQuantidadeLegumeOutros(alimento: String):Int{
            println("Informe a quantidade de $alimento em unidades: ")
            val input = readln()

            if (input.isEmpty() || input.isBlank()) {
                throw UnsupportedOperationException("Não é permitido inserir valor vazio")
            }
            var unidades = 0
            try {
                unidades = input.toInt()
                if (unidades < 0) {
                    println("Não é permitido números negativos, tente novamente")
                    informarQuantidadeVerduraGrao(alimento)
                }
            } catch (exception: NumberFormatException) {
                println("Não é permitido texto, somente número")
            }
            return unidades
        }
    }
}