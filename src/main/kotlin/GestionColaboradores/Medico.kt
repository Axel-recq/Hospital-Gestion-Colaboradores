package GestionColaboradores

class Medico (
    documento:String,
    nombres:String,
    edad:Int,
    sueldoBase: Double,
    val especialidad:String,
    val horasExtras:Int,
    ):Colaborador(documento, nombres,edad,sueldoBase){
    fun calcularMontoAdicional():Double{
        return when (especialidad){
            "Medicina General"-> 3500.0
            "Neumologia" -> 4500.0
            "Dermatologia" -> 5000.0
            "Hematologia" -> 6500.0
            "Cardiologia"-> 6900.0
            else -> 0.0
        }
    }

    override fun calcularSueldoTotal(): Double {
        val sueldoBase = 1500.00
        val montoAdicional = calcularMontoAdicional()

        return sueldoBase+montoAdicional+horasExtras*60
    }
}