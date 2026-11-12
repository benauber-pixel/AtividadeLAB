fun deteccaoPrimo() {
    val alvo = 29
    var Primo = true

    // Laço que vai de 2 até alvo - 1
    for (i in 2..alvo) {
        // Se o alvo for divisível por qualquer um desses números, resto zero
        if (alvo % i == 0) {
            Primo = false
            break // Acione um break para não desperdiçar processamento
        }
    }

    if (Primo) {
        println("O número $alvo é primo.")
    } else {
        println("O número $alvo não é primo.")
    }
}