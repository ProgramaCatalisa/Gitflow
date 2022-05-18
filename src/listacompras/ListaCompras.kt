package listacompras

import menu.Menu.Companion.validarNumeroDigitado

/*Aqui chamamos de lista de compras apenas para ter as funções específicas da lista de compras que o sistema exige,
afinal é um sistema de lista de compras. Não confundir com o conceito de List do Kotlin*/
class ListaCompras {
    companion object {
        fun informarQuantidadeVerduraGrao(alimento: String): Int {
            println("Informe a quantidade de $alimento em gramas: ")
            return validarNumeroDigitado()
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
            //TODO:implementar lógica (3/3)
        }

    }
}