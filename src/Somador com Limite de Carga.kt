fun somadorComLimite() {
    // Variável total para acumular a soma
    var total = 0

    // Iterar de 1 a 100
    for (i in 1..100) {
        // Se o número atual for múltiplo de 10, utilize continue para ignorá-lo
        if (i % 10 == 0) {
            continue
        }
        // Adicionando o valor atual à soma
        total += i
        // Se a variável total ultrapassar o valor de 500, aborte o laço com break
        if (total > 500) {
            println("Limite ultrapassado! Total parcial: $total")
            break
        }
    }
    println("Valor final da soma: $total")
}