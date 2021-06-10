class Aluno
    (
    val nome: String,
    val sobrenome: String,
    val codigoDeAluno: Int
) {
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



