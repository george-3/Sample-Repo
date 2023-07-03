package me.user.application

fun weekDays(){
    val dayOfTheWeek = readLine()

    when (dayOfTheWeek){
        "1" -> println("Monday")
        "2" -> println("Tuesday")
        "3" -> println("Wednesday")
        "4" -> println("Thursday")
        "5" -> println("Friday")
        "6" -> println("Saturday")
        "7" -> println("Sunday")
        else -> println("Invalid input.")
        }

}

fun main() {
    println("Enter a number between 1 and 7:")
    weekDays()
}