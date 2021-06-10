import java.time.LocalDateTime

class Matricula(
    val aluno: Aluno?,
    val curso: Curso?,
    val data: LocalDateTime
) {
    fun matricular(aluno: Aluno?, curso: Curso?, data: LocalDateTime) {
        curso?.adicionarAluno(aluno)
    }

    override fun toString(): String {
        return ("$aluno matriculado no curso $curso na data $data")
    }
}