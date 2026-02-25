import main.controller.crearPersonatges
import main.controller.mostrarPersonatges
import main.model.*

fun main(){
    var llistaPersonatges: MutableList<CharacterMarioKart> = mutableListOf()
    llistaPersonatges = crearPersonatges()

    mostrarPersonatges(llistaPersonatges)

    // TODO: Importar i exportar MutableList de perconatges a fitxer binari
    // TODO: Completar CRUD personatges
}