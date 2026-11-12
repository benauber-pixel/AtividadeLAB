fun cofreBloqueio() {
    val senhaCorreta = "1234"
    // Simulando entradas do usuário nas tentativas
    val tentativasSimuladas = listOf("0000", "1111", "9999", "1234")

    // O usuário tem 5 chances máximas (um for de 1 a 5)
    for (tentativa in 1..5) {
        val senhaDigitada = tentativasSimuladas[tentativa - 1]

        // Se errar a terceira vez, bloqueie antes de testar
        if (tentativa == 3) {
            println("Cofre travado administrativamente")
            break
        }

        // Se a senha simulada for correta, conceda acesso e use break
        if (senhaDigitada == senhaCorreta) {
            println("Acesso concedido!")
            break
        } else {
            println("Senha incorreta. Tentativa $tentativa.")
        }
    }
}