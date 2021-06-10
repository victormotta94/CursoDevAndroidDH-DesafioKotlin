import java.time.LocalDateTime

open class DigitalHouseManager(
    var listaAlunos: MutableList<Aluno> = mutableListOf(),
    var listaProfessores: MutableList<Professor> = mutableListOf(),
    var listaCursos: MutableList<Curso> = mutableListOf(),
    var listaMatriculas: MutableList<Matricula> = mutableListOf()
) {

    /////* FUNÇÕES DE CURSO */////
    open fun registrarCurso(nome: String, codigoDeCurso: Int, qtdAlunos: Int) {

        var curso = Curso(nome, codigoDeCurso, null, null, qtdAlunos, mutableListOf())
        listaCursos.add(curso)
        println("ADICIONADO $curso")

    }

    open fun excluirCurso(codigoCurso: Int) {
        var curso: Curso? = listaCursos.find { it.codigoDeCurso == codigoCurso }
        listaCursos.remove(curso)
        println("REMOVIDO $curso")

    }

    open fun imprimirCursos() {
        println(listaCursos)
    }
    /////* FUNÇÕES DE PROFESSORES */////

    open fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigo: Int, horasMonitoria: Int) {
        var professorAdjunto = ProfessorAdjunto(nome, sobrenome, 0, codigo, horasMonitoria)
        listaProfessores.add(professorAdjunto)
        println("ADICIONADO $professorAdjunto")
    }

    open fun registrarProfessorTitular(nome: String, sobrenome: String, codigo: Int, especialidade: String) {
        var professorTitular = ProfessorTitular(nome, sobrenome, 0, codigo, especialidade)
        listaProfessores.add(professorTitular)
        println("ADICIONADO $professorTitular")
    }

    open fun excluirProfessor(codigoProfessor: Int) {
        var professor: Professor? = listaProfessores.find { it.codigoDeProfessor == codigoProfessor }
        listaProfessores.remove(professor)
        println("REMOVIDO $professor")
    }

    open fun imprimirProfessores() {
        println(listaProfessores)
    }

    /////* FUNÇÕES DE ALUNOS */////

    open fun registrarAluno(nome: String, sobrenome: String, codigo: Int) {
        var aluno = Aluno(nome, sobrenome, codigo)
        listaAlunos.add(aluno)
        println("ADICIONADO $aluno")
    }

    open fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        var aluno: Aluno? = listaAlunos.find { it.codigoDeAluno == codigoAluno }
        var curso: Curso? = listaCursos.find { it.codigoDeCurso == codigoCurso }
        var matricula = Matricula(aluno, curso, LocalDateTime.now())


        if (curso?.qtdAlunos != null && curso.qtdAlunos > curso.listaAlunos.size) {
            matricula.matricular(aluno, curso, LocalDateTime.now())
            listaMatriculas.add(matricula)
            println("Matrícula realizada")
        } else {
            println("Infelizmente não há vagas no curso selecionado")
        }
    }

    open fun alocarProfessor (codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {
        var professorTitular: Professor? = listaProfessores.find { it.codigoDeProfessor == codigoProfessorTitular }
        var professorAdjunto: Professor? = listaProfessores.find { it.codigoDeProfessor == codigoProfessorAdjunto }
        var curso: Curso? = listaCursos.find { it.codigoDeCurso == codigoCurso }

        curso?.professorAdjunto = professorAdjunto as? ProfessorAdjunto
        curso?.professorTitular = professorTitular as? ProfessorTitular
    }
}




