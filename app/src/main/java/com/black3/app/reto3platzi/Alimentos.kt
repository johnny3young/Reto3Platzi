package com.black3.app.reto3platzi

import java.lang.NumberFormatException

fun main (){
    val Verduras = arrayListOf("Verduras", "Verduras", "Verduras", "Verduras", "Verduras", "Verduras", "Verduras")
    val Frutas = arrayListOf("Fresa", "Plátano", "Uvas", "Manzana", "Naranja", "Pera", "Cereza")
    val Lacteos  = arrayListOf("Lacteos", "Lacteos", "Lacteos", "Lacteos", "Lacteos", "Lacteos", "Lacteos")
    val Carnes  = arrayListOf("Carnes", "Carnes", "Carnes", "Carnes", "Carnes", "Carnes", "Carnes")
    val Granos = arrayListOf("Granos", "Granos", "Granos", "Granos", "Granos", "Granos", "Granos")
    val Aceites = arrayListOf("Aceites", "Aceites", "Aceites", "Aceites", "Aceites", "Aceites", "Aceites")

    print("Por favor digite el tipo de receta que desea: \n\n")
    print("1. Verduras: \n")
    print("2. Frutas: \n")
    print("3. Lácteos: \n")
    print("4  Carnes, Legumbres o Huevos: \n")
    print("5. Granos: \n")
    print("6. Aceites: \n")

    var dateInput : Int = try {

        readLine()?.toInt() as Int

    } catch (_:NumberFormatException) {
        0
    }

    when (dateInput){
        1 -> print(Verduras)
        2 -> print(Frutas)
        3 -> print(Lacteos)
        4 -> print(Carnes)
        5 -> print(Granos)
        6 -> print(Aceites)
        else -> {print("!!! Digite una receta válida !!!\n\n")
            return main()
        }

    }
    var recetaSeleccionada = dateInput
    println("\nLa receta seleccionada fue: $recetaSeleccionada\n\n")
        //return main()

    var resultado = calculadora(1,2,3, :: sumar)
    println("El resultado de la suma fué $resultado")
    println("El resultado de la resta fué ${calculadora(4,5,6,::restar)}")
    println("El resultado de la multipiclación fué ${calculadora(4,5,6,::multiplicar)}")

}

fun calculadora (a: Int, b: Int, c: Int, operacion:(Int,Int,Int) -> Int): Int {
    return operacion(a,b,c)
}

fun sumar(a:Int, b:Int, c:Int) = a+b+c
fun restar(a:Int, b:Int, c:Int) = a-b-c
fun multiplicar(a:Int, b:Int, c:Int) = a*b*c



