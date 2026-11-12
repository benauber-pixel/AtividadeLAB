fun menuTeimoso() {
    // Simulando opções para teste (você pode trocar por readln().toInt() para interagir)
    val simulacaoOpcoes = listOf(1, 3, 2, 0)
    var indice = 0

    // Construa um menu dentro de um laço infinito
    while (true) {
        val opcao = simulacaoOpcoes[indice]
        println("Opção escolhida: $opcao")

        when (opcao) {
            1, 2 -> println("Processando...")
            3 -> {
                println("Módulo em manutenção")
                indice++
                continue // Use continue para voltar ao início instantaneamente
            }
            0 -> {
                println("Encerrando o programa...")
                break // Encerre o programa com break
            }
            else -> println("Opção inválida")
        }
        indice++
    }
}