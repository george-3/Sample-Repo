package me.user.application

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    val newArray = arrayOf(5, 3, 1, 4, 7)
    val oldArray = arrayOf(25, 68, 81, 94, 907)
    val userArray = mutableListOf<Int>()

    println("Enter 5 numbers: ")
    val n1:Int = reader.nextInt()
    val n2:Int = reader.nextInt()
    val n3:Int = reader.nextInt()
    val n4:Int = reader.nextInt()
    val n5:Int = reader.nextInt()

    userArray.add(n1)
    userArray.add(n2)
    userArray.add(n3)
    userArray.add(n4)
    userArray.add(n5)


     fun sampleSort(arryNumber:List<Int>) {

        val finalList = mutableListOf<Int>()

        val copyList = arryNumber.toMutableList()
        val first = copyList.maxOrNull()
        copyList[copyList.indexOf(first)] = 0

        val second = copyList.maxOrNull()
        copyList[copyList.indexOf(second)] = 0

        val third = copyList.maxOrNull()
        copyList[copyList.indexOf(third)] = 0

        val forth = copyList.maxOrNull()
        copyList[copyList.indexOf(forth)] = 0

        val fifth = copyList.maxOrNull()
        copyList[copyList.indexOf(fifth)] = 0

        finalList.add(first!!)
        finalList.add(second!!)
        finalList.add(third!!)
        finalList.add(forth!!)
        finalList.add(fifth!!)
        println(finalList)
    }

    sampleSort(oldArray.toList())
    sampleSort(newArray.toList())
    sampleSort(userArray)


}