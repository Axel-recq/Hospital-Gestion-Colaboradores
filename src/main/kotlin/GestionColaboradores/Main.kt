package GestionColaboradores

fun main(){
    val hospital = Hospital()
    //Registrar 4 medicos

    val medico = Medico("12345678","Dr.Matasanos", 40, 1500.0,"cardiologia",40)
    val medico2 = Medico("12859673","Dr.aguja", 40, 1500.0,"cardiologia",40)

    hospital.registrarColaborador(medico)
    hospital.registrarColaborador(medico2)

    //Registrar 2 Enfermeros

    val enfermero1 = Enfermero("12345687","Rodriguez",30,1900.0,500.0)
    val enfermero2 = Enfermero("12625482","Maltasan",30,1900.0,500.0)

    hospital.registrarColaborador(enfermero1)
    hospital.registrarColaborador(enfermero2)

    hospital.listarColaboradores()
    //C
    val colaborador = hospital.consultarColaborador("12859673")
    hospital.consultarColaborador(colaborador.toString())

    hospital.calcularSumaSueldos()
    hospital.medicoMejorPagado()
    hospital.enfermeroSueldoMasBajo()
}