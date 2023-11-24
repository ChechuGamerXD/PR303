package pr303
import kotlin.math.sqrt
import kotlin.system.exitProcess
fun main(args: Array<String>) {
    println("Introduce el primer lado del rectángulo")
    val lado1 = readln()!!.toDouble()
    println("Introduce el segundo lado")
    val lado2 = readln()!!.toDouble()
    if (lado1 <= 0 || lado2 <= 0) exitProcess(-33)
    var opcion:Int
    do {
        println("1. Perímetro\n2. Área\n3. Diagonal\n4. Área del triángulo de la diagonal\n5. Salir")
        opcion = readln()!!.toInt()
        when(opcion) {
            1 -> println("Perímetro: ${lado1 * 2 + lado2 * 2} cm")
            2 -> println("Área: ${lado1 * lado2} cm2")
            3 -> println("Diagonal: ${sqrt(lado1 * lado1 + lado2 * lado2)} cm")
            4 -> println("Área del triángulo de la diagonal: ${(lado1 * lado2) / 2} cm2")
            5 -> println("Adiós")
        }
    } while (opcion != 5)
}
