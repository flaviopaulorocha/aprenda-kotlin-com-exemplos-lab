enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario (var nome: String, val id: Int)
var usuario1 = Usuario("Ana", 1)
var usuario2 = Usuario("Flavio", 2)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)
var conteudo1 = ConteudoEducacional(nome = "Lógica de Programação", duracao = 60)
var conteudo2 = ConteudoEducacional("Kotlin Básico", 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional> = emptyList())
var formacao1 = Formacao("Mobile Android Kotlin", listOf(conteudo1, conteudo2))

fun matricular() {
    var inscritos = arrayOf("Ana", "Bruno", "Carla", "Daniel", "Eva", "Flavio")
    var usuario1 = Usuario("Ana", 1)
    var usuario2 = Usuario("Flavio", 2)
    var formacao1 = Formacao("Mobile Android Kotlin", listOf(conteudo1, conteudo2))
    println("Usuário: ${usuario1.nome} Id: 000${usuario1.id}")
    println("Matriculado na Formação: ${formacao1.nome} ")
    println("Conteúdos Educacionais: ${conteudo1.nome} e ${conteudo2.nome}, com duração de ${conteudo1.duracao} horas cada.")
    println("Nível inicial da Formação: ${Nivel.valueOf("BASICO")}")
    println("Nível final da Formação: ${Nivel.valueOf("INTERMEDIARIO")}")
    println("==================================================================================")
    println("Usuário: ${usuario2.nome} Id: 000${usuario2.id}")
    println("Matriculado na Formação: ${formacao1.nome} ")
    println("Conteúdos Educacionais: ${conteudo1.nome} e ${conteudo2.nome}, com duração de ${conteudo1.duracao} horas cada.")
    println("Nível inicial da Formação: ${Nivel.valueOf("BASICO")}")
    println("Nível final da Formação: ${Nivel.valueOf("INTERMEDIARIO")}")
}

fun main() {
    matricular()
}