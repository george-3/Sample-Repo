package me.user.application

import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
data class DataBase(
    val name: String,
    val age: Int,
    val email: String
)

fun main() {
    val json1 = """
        {
            "name": "George Kariuki",
            "age": 20,
            "email": "george@example.com"
        }
    """.trimIndent()

    println("Enter your name:")
    val name: String? = readlnOrNull()

    println("Enter your age:")
    val ageString: String? = readlnOrNull()
    val age: Int? = ageString?.toIntOrNull()

    println("Enter your email:")
    val email = readlnOrNull()

    if (name != null && age != null && email != null) {
        val json2 = """{
            "name": "$name",
            "age": "$age",
            "email": "$email"
            }"""


        val data1 = Json.decodeFromString<DataBase>(json1)
        val user = Json.decodeFromString<DataBase>(json2)

        val areEqual = data1 == user

        if(areEqual) {
            println("Details are correct.")
        }
        else {
            println("Information is incorrect.")
        }
    }
}
