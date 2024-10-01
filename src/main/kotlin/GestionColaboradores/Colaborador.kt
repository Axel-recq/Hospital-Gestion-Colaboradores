package GestionColaboradores

open class Colaborador (
    val documento: String,
    val nombres:String,
    val edad: Int,
    val sueldoBase:Double, ){
    open fun calcularSueldoTotal():Double{
        return 0.00
    }

}