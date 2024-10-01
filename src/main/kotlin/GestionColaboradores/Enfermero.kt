package GestionColaboradores

class Enfermero(documento:String,
                nombres:String,
                edad:Int,
                sueldoBase:Double,
                val comision: Double
        ):Colaborador(documento,nombres,edad, sueldoBase){
    override fun calcularSueldoTotal(): Double {
        val sueldoBase = 1900.0
        return sueldoBase+comision
    }

}