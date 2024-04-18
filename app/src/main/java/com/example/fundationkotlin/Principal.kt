package com.example.fundationkotlin



fun main() {
    print(suma(1,2))
    showValue()
}

//MARK: funciones con dos argumentos y un return del tipo Entero con return opcional de Int
fun suma(a: Int, b: Int): Int? {
    return a + b
}
//MARK: Variables var Constantes Val
//Mark: also solo hace acciones sin modificaciones dentro de su ambito
//Mark: aply solo hace acciones con modificaciones dentro de su ambito
fun showValue(saludo: String = "Hola") {
    print(saludo)
    var itsVar: String = ("b").also {
        print(it + 1)
    }
    itsVar.apply {
        print(this)
    }
    print(itsVar)
    val itsConstant = "b"
    //Fixme cant change value constant itsConstant = "c"
    print(itsConstant)
}
