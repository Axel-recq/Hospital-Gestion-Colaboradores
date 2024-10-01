package GestionColaboradores

class Hospital {
    val listaColaboradores = mutableListOf<Colaborador>()
    fun registrarColaborador(colaborador: Colaborador){
        listaColaboradores.add(colaborador)
    }
    fun listarColaboradores(){
        /*listaColaborador.forEach{
            colaborador -> println("Documento: ${colaborador.documento}, " +
                "Nombre: ${colaborador.nombres}," +
                "edad: ${colaborador.edad}, sueldo: ${colaborador.sueldoBase}")
        }*/
        var contador =0
        for (colaborador in listaColaboradores){
            contador++
            println("$contador.- Nombres: ${colaborador.nombres}, Sueldo Total:" +
                    "s/. ${colaborador.calcularSueldoTotal()}")

        }
    }

    fun consultarColaborador(documento:String) {
        val documento ="12345678"
        var flag = false
        println("Consultar de Colaborador por DNI: ")
        for(colaborador in listaColaboradores) {
            if (colaborador.documento == documento) {
                flag = true
                println("Nombres: ${colaborador.nombres}")
            }
        }
        if (!flag){
            println("No se encontro el colaborador con documento: $documento")
        }
    }

    fun calcularSumaSueldos()
    {
        println("Suma de Sueldos de Colaboradores")
        var sumaSueldos = 0.0
        for (colaborador in listaColaboradores){
            sumaSueldos += colaborador.calcularSueldoTotal()
        }
        println("La suma de sueldos es: S.${sumaSueldos}")
    }
    fun medicoMejorPagado(){
        var sueldoMayor=0.0
        var medico:Medico? = null
        for (colaborador in listaColaboradores){
            if (colaborador is Medico){
                if (colaborador.calcularSueldoTotal()>sueldoMayor){
                    sueldoMayor = colaborador.calcularSueldoTotal()
                    medico = colaborador
                }
            }
        }
        if (medico != null){
            println("Nombres: ${medico.nombres}, Especialidad: ${medico.especialidad}, Sueldo: S. ${medico.calcularSueldoTotal()}")
        }else{
            println("No hay medicos en los colaboradores")
        }
    }
    fun enfermeroSueldoMasBajo(){
        var sueldoMenor= listaColaboradores[0].calcularSueldoTotal()
        var enfermero:Enfermero? = null
        for (colaborador in listaColaboradores){
            if (colaborador is Enfermero){
                if (colaborador.calcularSueldoTotal()<sueldoMenor){
                    sueldoMenor = colaborador.calcularSueldoTotal()
                    enfermero = colaborador
                }
            }
        }/*
        listaColaboradores.forEach{
            colaborador -> if(colaborador is Enfermero && colaborador
                .calcularSueldoTotal() < sueldoMenor){
                sueldoMenor= colaborador.calcularSueldoTotal()
            enfermero = colaborador
        }
        }*/
        if (enfermero != null){
            println("Nombres: ${enfermero.nombres}, Sueldo: S. ${enfermero.calcularSueldoTotal()}")
        }else{
            println("No hay medicos en los colaboradores")
        }
    }


}