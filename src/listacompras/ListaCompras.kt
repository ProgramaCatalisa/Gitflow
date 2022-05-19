package listacompras

import menu.Menu.Companion.listaAlimentos
import menu.Menu.Companion.menu

import menu.Menu.Companion.validarNumeroDigitado
import menu.Menu.Companion.verificarValidacao

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
            var nome = readln()

            while (nome.isEmpty() || nome.isBlank()) {
                println("Inválido, digite novamente")
                nome = verificarValidacao()
            }
            return nome
        }

        fun informarQuantidadeLegumeOutros(alimento: String): Int {
            var unidades = 0
            println("Informe quantas unidades de $alimento deseja: ")
            val input = readln()

            if (input.isEmpty() || input.isBlank()) {
                println("Não é permitido inserir valor vazio")
                informarQuantidadeLegumeOutros(alimento)
            } else {
                try {
                    unidades = input.toInt()
                    if (unidades < 0) {
                        println("Não é permitido números negativos, tente novamente")
                        informarQuantidadeLegumeOutros(alimento)
                    }

                } catch (exception: NumberFormatException) {
                    println("Não é permitido texto, somente número")
                    informarQuantidadeLegumeOutros(alimento)
                }
            }
            return unidades
        }


        fun exibirLista() {
            if (listaAlimentos.isEmpty()) {
                println("Não contém nenhum item na lista")
                menu()
            } else {
                listaAlimentos.forEach { alimento, quantidade ->
                    println("Nome: $alimento - quantidade: $quantidade ")
                }
                println("\nA quantidade de itens a ser comprada é : ${listaAlimentos.size}\n")
                menu()
            }
        }

        fun limparLista(listaAlimentos: HashMap<String, Number>) {
            listaAlimentos.clear()
            exibirLista()
        }
    }
}