open class Professor
    (
    val nome: String,
    val sobrenome: String,
    val tempoDeCasa: Int,
    val codigoDeProfessor: Int
) {
    override fun equals(other: Any?): Boolean {
        val outroProfessor = other as? Professor
        return when (other) {
            is Professor -> {
                this.codigoDeProfessor == outroProfessor?.codigoDeProfessor
            }
            else -> {
                super.equals(other)
            }
        }
    }
    override fun hashCode(): Int {
        return codigoDeProfessor
    }

    override fun toString(): String {
        return "$nome $sobrenome"
    }
}


