package com.example.fundationkotlin

import kotlin.math.abs


fun main() {
    val a = 1
    val b = 1
    print(suma(1,2))
    showValue()
    showValueNulleables()
    funcionVacia()
    print(funcionRestoOptimizada(1,2))
    print(funcionRestoOptimizada(1,2).changueValue(false))
    print("{$a-$b} = ${funcionRestoOptimizada(a,b)}")

    showProduc("soda", "10")
    showProduc("leche")

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

//Mark: aply solo hace acciones con modificaciones dentro de su ambito
//Mark: any es para cualquier tipo de varible hacerlo opcional es con ?
fun showValueNulleables() {
    val itsNull: String?
    itsNull = null
    //MARK: las lineas  de guardlet como iflet se manejaran como el flujo de comparativa
    if (itsNull != null) {
        //Validacion
    }
}
 //Mark: marcar el retorno vacio con Unit es equivalente a vacio

fun funcionVacia(): Unit {
   print("esta funcion unit")
}

//MARK uso de infix para cambiar de positivo o negativo para el ejemplo se puede extender un valor el infix solo tolera un paranetro
//Mark la funcion Resta optimizada con un = sin necesidad de un retorno :

fun funcionRestoOptimizada(a: Int, b: Int) = a - b
infix fun Int.changueValue(flag: Boolean) = if (flag) abs(this) else this

//MARK SOBRECARGA DE METODOS dandole un valor por default podemos reusar metodos sin llamar a todos tus parametros
fun showProduc(name:String, promo: String = "sin promocion") {
    println("$name = $promo")
}

