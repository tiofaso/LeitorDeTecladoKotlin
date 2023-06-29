import java.util.Scanner

fun main(args: Array<String>) {
    println("Seja bem-vinde!\n")
    println("Selecione uma operação na lista abaixo:")
    println("1 - soma")
    println("2 - subtração")
    println("3 - multiplicação")
    println("4 - divisão")

    var fezEscolha: Int //verifica se a pessoa fez alguma escolha

    fezEscolha = 0 //setando entrada do looping

    val leitor = Scanner(System.`in`)
    var entrada:Int = leitor.nextInt()

   while (fezEscolha == 0){



        if (entrada < 1 || entrada > 4){
            println("> AVISO: É preciso escolher uma das opções\n")
            println("1 - soma")
            println("2 - subtração")
            println("3 - multiplicação")
            println("4 - divisão")

            entrada =  leitor.nextInt() //Entrada do usuário

            fezEscolha = 0
        }else{fezEscolha = 1}
    }

    println("Você escolher a opção: " + entrada)
}