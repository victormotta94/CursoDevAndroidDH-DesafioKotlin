fun main() {
    val adm = DigitalHouseManager(mutableListOf(), mutableListOf(), mutableListOf(), mutableListOf())

    adm.registrarProfessorAdjunto("Mark", "Zuckerberg", 1, 10)
    adm.registrarProfessorAdjunto("Eduardo", "Misina", 2, 5)
    adm.registrarProfessorTitular("Bill", "Gates", 3, "Backend")
    adm.registrarProfessorTitular("Cesar", "Rodrigues", 4, "Kotlin")
    adm.registrarCurso("FullStack", 20001, 3)
    adm.registrarCurso("Android", 20002, 2)
    adm.registrarAluno("Pedro", "Bó", 1)
    adm.registrarAluno("Joao", "das Neves", 2)
    adm.registrarAluno("Mané", "Campos", 3)
    adm.registrarAluno("Julia", "Oliveira", 4)
    adm.registrarAluno("Paula", "Silva", 5)

    adm.alocarProfessor(20001,3, 1)
    adm.alocarProfessor(20002, 4, 2)
    adm.matricularAluno(1, 20001)
    adm.matricularAluno(2, 20001)
    adm.matricularAluno(3, 20002)
    adm.matricularAluno(4, 20002)
    adm.matricularAluno(5, 20002)

    adm.imprimirCursos()
    adm.imprimirProfessores()
    adm.imprimirMatriculas()








}