package ru.netology

fun main(){
    println("Введите число лайков, потом нажмите Enter")
    val likes = readLine()!!.toInt()
    val beginning = "Понравилось "

    val lastNumber = likes % 10
    val lastTwoNumbers = likes % 100

    if (lastNumber != 1 || lastTwoNumbers == 11 ){
        println("$beginning $likes людям")
    } else {
        println("$beginning $likes человеку")
    }
}