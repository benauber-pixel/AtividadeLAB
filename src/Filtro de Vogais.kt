fun vogais () {
    val palavra = "universidade" //Definir variavél com universidade

    //for para repetir universidade que já sabemos quantas vezes vai ser repetida 12 vezes
    for (i in palavra) {
        //if para determinar as vogais e pular elas para a próxima letra
        if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
            //println avisando que a letra que é vogal vai ser pulada.
            println("Pulando Vogal: $i")
            //continue para passar pra próxima etapa
            continue
        }
        //println de universidade
        println(i)
    }
}