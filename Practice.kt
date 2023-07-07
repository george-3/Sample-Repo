package me.user.application

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Serializable
data class Person(
    @SerialName("name")
    val name: String,
    @SerialName("age")
    val age: Int,
    @SerialName("email")
    val email: String
)

fun parseJson(json: String): Person {
    return Json.decodeFromString(json)
}

fun main() {
    val json = """{
        "name": "George Kariuki",
        "age": 20,
        "email": "george@example.com"
        }"""

    val person = parseJson(json)
    println("My name is ${person.name}.")
    println("I am ${person.age} years old.")
    println("My email is ${person.email}.")
}