package main.controller
import main.model.CharacterMarioKart
import main.view.SwingImageView

fun crearPersonatges(): MutableList<CharacterMarioKart> {
    val llistaPersonatges: MutableList<CharacterMarioKart> = mutableListOf()

    llistaPersonatges.add(CharacterMarioKart("Mario", "main/resources/pictures/mario.png", 4.5f, 3.0f, 3.5f, 2.8f, 3.2f))
    llistaPersonatges.add(CharacterMarioKart("Luigi", "pictures/luigi.png", 4.2f, 3.2f, 3.6f, 2.9f, 3.1f))
    llistaPersonatges.add(CharacterMarioKart("Peach", "main.resources.pictures/peach.png", 4.8f, 3.5f, 2.8f, 3.5f, 3.0f))
    llistaPersonatges.add(CharacterMarioKart("Bowser", "main.resources.pictures/bowser.png", 5.5f, 2.5f, 4.5f, 2.0f, 2.5f))
    llistaPersonatges.add(CharacterMarioKart("Yoshi", "main.resources.pictures/yoshi.png", 4.7f, 3.8f, 3.0f, 3.6f, 3.2f))
    llistaPersonatges.add(CharacterMarioKart("Toad", "main.resources.pictures/toad.png", 4.9f, 4.0f, 2.5f, 3.8f, 3.3f))
    llistaPersonatges.add(CharacterMarioKart("Donkey Kong", "main.resources.pictures/donkey_kong.png", 5.3f, 2.7f, 4.2f, 2.3f, 2.8f))
    llistaPersonatges.add(CharacterMarioKart("Wario", "main.resources.pictures/wario.png", 5.2f, 2.9f, 4.3f, 2.2f, 2.7f))
    llistaPersonatges.add(CharacterMarioKart("Rosalina", "main.resources.pictures/rosalina.png", 4.6f, 3.4f, 3.7f, 3.1f, 3.0f))
    llistaPersonatges.add(CharacterMarioKart("Koopa Troopa", "main.resources.pictures/koopa_troopa.png", 4.4f, 3.9f, 2.7f, 3.7f, 3.4f))

    return llistaPersonatges
}

fun mostrarPersonatges(llistaPersonatges: MutableList<CharacterMarioKart>) {
    for (personatge in llistaPersonatges) {
        println(personatge)
        SwingImageView.mostrar(personatge)
    }
}

fun afegirPersonatge(llistaPersonatges: MutableList<CharacterMarioKart>): MutableList<CharacterMarioKart>{
    val character: CharacterMarioKart
    // TODO
    return llistaPersonatges
}

fun editarPersonatge(llistaPersonatges: MutableList<CharacterMarioKart>): MutableList<CharacterMarioKart>{
    // TODO
    return llistaPersonatges
}

fun importarPersonatges(){
    // TODO: Usarem la ruta relativa ./files/personatges.bin
}

fun exportarPersonatges(){
    // TODO: Usarem la ruta relativa ./files/personatges.bin
}

fun esborrarPersonatges(){
    // TODO: Usarem la ruta relativa ./files/personatges.bin
}