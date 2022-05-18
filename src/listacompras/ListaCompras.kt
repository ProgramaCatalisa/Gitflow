package listacompras

/*Aqui chamamos de lista de compras apenas para ter as funções específicas da lista de compras que o sistema exige,
afinal é um sistema de lista de compras. Não confundir com o conceito de List do Kotlin*/
class ListaCompras {
    companion object {
        fun informarQuantidadeVerduraGrao(alimento: String): Int {
            println("Informe a quantidade de $alimento em gramas: ")
            val input = readln()

            if (input.isEmpty() || input.isBlank()) {
                throw UnsupportedOperationException("Não é permitido inserir valor vazio")
            }

            var gramas = 0
            try {
                gramas = input.toInt()
                if (gramas < 0) {
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

        fun informarQuantidadeLegumeOutros(alimento: String) {
            //TODO:implementar lógica (3/3) - teste
        }

    }
}