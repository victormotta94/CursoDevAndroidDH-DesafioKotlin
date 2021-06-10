class ProfessorAdjunto(
    nome: String,
    sobrenome: String,
    tempoDeCasa: Int,
    codigoDeProfessor: Int,
    val horasDeMonitoria: Int
): Professor(nome, sobrenome, tempoDeCasa, codigoDeProfessor) {

}