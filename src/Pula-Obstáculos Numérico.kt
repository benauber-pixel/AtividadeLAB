fun pulaObstaculos() {
    // Itere os números de 1 a 50
    for (numero in 1..50) {
        // Use uma condicional verificando se numero % 10 == 7 para acionar um continue
        if (numero % 10 == 7) {
            continue
        }
        println(numero)
    }
}