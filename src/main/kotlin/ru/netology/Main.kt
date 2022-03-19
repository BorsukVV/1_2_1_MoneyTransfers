package ru.netology
fun main() {
    val amount = 100_50
    val minComission = 35_00
    val comissionPercent = 75
    val comissionByPercent = amount * comissionPercent / 1000
    val result = if (comissionByPercent <= minComission) amount + minComission else amount + comissionByPercent
    val originalValueRub = amount / 100
    val originalValueCop = amount % 100
    val originalValueCopFormatted: String = String.format("%02d", originalValueCop)
    val resultValueRub = result / 100
    val resultValueCop = result % 100
    val resultValueCopFormatted: String = String.format("%02d", resultValueCop)
    println("Вы переводите $originalValueRub руб. $originalValueCopFormatted коп." )
    println("Сумма перевода с учетом комиссии составляет $resultValueRub руб. $resultValueCopFormatted коп." )
}