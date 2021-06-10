class Aluno
    (
    val nome: String,
    val sobrenome: String,
    val codigoDeAluno: Int
) {

    fun consultarMatricula (codigoAluno: Int, adm: DigitalHouseManager) {
        val adm = adm
        val matricula: Matricula? = adm.listaMatriculas.find { it.aluno?.codigoDeAluno == codigoAluno}
        val curso = matricula?.curso


        if (matricula != null){
            println("Você está matriculado no curso $curso")
        } else {
            println("Você não está matriculado em nenhum curso")
        }


    }
    override fun equals(other: Any?): Boolean {
        val outroAluno = other as? Aluno
        return when (other) {
            is Aluno -> {
                this.codigoDeAluno == outroAluno?.codigoDeAluno
            }
            else -> {
                super.equals(other)
            }
        }
    }

    override fun hashCode(): Int {
        return codigoDeAluno
    }

    override fun toString(): String {
        return "Aluno: $nome $sobrenome / " +
                "Código: $codigoDeAluno"
    }
}



