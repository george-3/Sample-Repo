package me.user.application


import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    val newArray = arrayOf(6, 9, 5, 4, 2)
    val oldArray = arrayOf(25, 8, 4, 49, 97)
    val userArray = mutableListOf<Int>()

    println("Enter 5 numbers: ")
    for (i in 1..5) {
        userArray.add(reader.nextInt())
    }

    fun sampleSort(arrayNumber: List<Int>) {
        val finalList = mutableListOf<Int>()
        val copyList = arrayNumber.toMutableList()

        for (i in 1..5) {
            val max = copyList.maxOrNull()
            finalList.add(max!!)
            copyList[copyList.indexOf(max)] = 0
        }

        println(finalList)
    }

    sampleSort(oldArray.toList())
    sampleSort(newArray.toList())
    sampleSort(userArray)
}
