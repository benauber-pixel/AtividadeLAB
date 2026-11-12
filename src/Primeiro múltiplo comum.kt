fun PrimeiroMultiploComum () {
    // Definir variável numero começando com 1
    var numero = 1

    // Laço while(true) para repetir infinitamente até achar a condição de parada
    while (true) {
        // if para verificar se o número é divisível simultaneamente por 7 e por 13
        if (numero % 7 == 0 && numero % 13 == 0) {
            println("Primeiro múltiplo comum encontrado: $numero")
            break // Encerra o laço imediatamente
        }

        // Caso contrário, incremente a variável para testar o próximo número
        numero++
    }
}