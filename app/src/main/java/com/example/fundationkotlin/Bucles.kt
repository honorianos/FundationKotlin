package com.example.fundationkotlin
//MARK Funcion con parametros de arreglo
//Mark ciclos for
//MARK opciones When  con caso

//MARK composicion de constantes en enum case con asociacion a any o con el tipo que se necesite  se accede con el comando value


enum class MyEnum(val value: Any) {
    CONSTANT1("1"),
    CONSTANT2(2),
    CONSTANT3(3)
}

fun main() {
    showPersons("angel","david", "jose")
    showPersonsArray("a","b","c")
    showWhenOptions("aa")
    val myConstant: MyEnum = MyEnum.CONSTANT2
    val myConstant2: MyEnum = MyEnum.CONSTANT1
    val a: String = myConstant2.value as String
    val b = myConstant.value
    println(a)
    println(b)
}

fun showPersons(personA:String, personB:String, personC:String) {
    println("$personA")
    println("$personB")
    println("$personC")
}

fun showPersonsArray(vararg persons: String) {
    for (person in persons) {
        println(person)
    }
}

fun showWhenOptions(value: String) {
    when (value) {
        "a" -> println("premium")
        "b" -> println("fremium")
        else -> {
            println("opciones no validas")
        }
    }
}