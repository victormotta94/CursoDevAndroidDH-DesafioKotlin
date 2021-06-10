open class Curso
    (
    var nome: String,
    var codigoDeCurso: Int,
    var professorTitular: ProfessorTitular?,
    var professorAdjunto: ProfessorAdjunto?,
    var qtdAlunos: Int,
    var listaAlunos: MutableList<Aluno?> = mutableListOf()
) {

    open fun adicionarAluno(aluno: Aluno?): Boolean {

        var qtd = qtdAlunos

        return if (qtd > listaAlunos.size) {
            listaAlunos.add(aluno)
        } else
            return false
    }

    open fun excluirAluno(aluno: Aluno?){
        listaAlunos.remove(aluno)
    }

    override fun equals(other: Any?): Boolean {
        val outroCurso = other as? Curso
        return when (other) {
            is Curso -> {
                this.codigoDeCurso == outroCurso?.codigoDeCurso
            }
            else -> {
                super.equals(other)


            }
        }
    }
    override fun hashCode(): Int {
        return codigoDeCurso
    }

    override fun toString(): String {
        return "Curso: $nome / " +
                "Código: $codigoDeCurso / " +
                "Máximo de Alunos: $qtdAlunos / Professor Titular: $professorTitular / " +
                "Professor Adjunto: $professorAdjunto"
            }
}
