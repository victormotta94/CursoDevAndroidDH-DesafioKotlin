fun main() {
    var adm = DigitalHouseManager(mutableListOf(), mutableListOf(), mutableListOf(), mutableListOf())

    adm.registrarProfessorAdjunto("Ricardo", "Ramalho", 1, 10)
    adm.registrarProfessorAdjunto("Eduardo", "Ramalho", 2, 5)
    adm.registrarProfessorTitular("Vinicius", "Padovan", 3, "Backend")
    adm.registrarProfessorTitular("Victor", "Motta", 4, "Kotlin")
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






}