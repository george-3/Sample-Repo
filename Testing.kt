package me.user.application

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the number of colors: ")
    val count = scanner.nextInt()

    val colors = Array(count) { "" }

    for (i in 0 until count) {
        print("Enter color $i: ")
        colors[i] = scanner.next()
    }

    val secretColor = getRandomObject(colors)

    println("Welcome to the Color Guessing Game!")
    println("Guess the secret color from the provided colors.")

    var guess: String?
    do {
        print("Enter your guess: ")
        guess = scanner.next()
        if (guess != null) {
            if (guess.equals(secretColor, ignoreCase = true)) {
                println("Congratulations! You guessed the correct color!")
                break
            }else {
                println("Wrong guess. Try again!")
            }
        }

    }while (guess != null)

    println("The secret color was: $secretColor")
}

fun getRandomObject(objects: Array<String>): String {
    val random = Random()
    val randomIndex = random.nextInt(objects.size)
    return objects[randomIndex]
}