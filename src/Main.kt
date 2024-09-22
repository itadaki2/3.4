fun main() {
    val chislo1 = 45  // константы
    val chislo2 = 5
    val chislo3 = 12
    val chislo4 = 4

    // проверка делится ли chislo1 нацело на chislo2
    if (chislo1 % chislo2 == 0) {
        println("$chislo1 кратно $chislo2") // вывод если кратно
    } else {
        // если не кратно вычисляем остаток
        val ostatok = chislo1 % chislo2
        println("$chislo1 не кратно $chislo2 остаток от деления $ostatok") // вывод результата
    }

    // проверка делится ли chislo3 нацело на chislo4
    if (chislo3 % chislo4 == 0) {
        println("$chislo3 кратно $chislo4") // вывод если кратно
    } else {
        // если не кратно вычисляем остаток
        val ostatok = chislo3 % chislo4
        println("$chislo3 не кратно $chislo4 остаток от деления $ostatok") // вывод результата
    }
}
