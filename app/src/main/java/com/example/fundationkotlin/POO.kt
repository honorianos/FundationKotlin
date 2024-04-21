package com.example.fundationkotlin

import android.annotation.SuppressLint

//MARK Clases metodos dentro de la clase  mas su instancia con sus inicializacion del parametro
//Mark Herencia
//MARK Override solo se puede overridear solo si la funcion es open añadiendola al final

open class Objects(val parameter: String) {
    open fun callObject() {
        println("llamando a objeto")
    }
    fun showParameter() {
        println(parameter)
    }
}

fun main() {
    val objets = Objects("a")
    objets.callObject()
    println(objets.parameter)
    objets.showParameter()

    var objectHeredado = ObjectsHErencia("B")
    objectHeredado.propiaHeredada()
    println(objectHeredado.parameter)
    objectHeredado.showParameter()
    objectHeredado.callObject()
}

class ObjectsHErencia(parameter: String) : Objects(parameter) {
    fun propiaHeredada(){
        println("funcion eredada")
    }

    override fun callObject() {
        println("llamando a heredado y overridedado")
        //MARK para acceso al padre con super
        //super.callObject()
    }
}