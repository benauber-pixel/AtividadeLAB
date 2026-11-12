fun caixaEletronico() {
    // Declarar um saldo inicial de R$ 1000,00
    var saldo = 1000.0
    val saque = 150.0

    // Criar um laço infinito
    while (true) {
        // Se o saldo for suficiente, deduza o valor
        if (saldo >= saque) {
            saldo -= saque
            println("Saque de R$ $saque realizado. Saldo atual: R$ $saldo")
        } else {
            // Quando o saldo ficar menor que o valor do saque, exiba "Saldo Insuficiente" e encerre
            println("Saldo Insuficiente")
            break
        }
    }
}