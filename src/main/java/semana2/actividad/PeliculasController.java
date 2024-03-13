package semana2.actividad;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PeliculasController{
    private List<Peliculas> peliculas = new ArrayList<>();

    public PeliculasController(){
        // Inicializa la lista de películas con sus datos
        peliculas.add(new Peliculas(1, "Star Wars", 2001, "George Lucas", "Ficción", "En una galaxia dividida por la lucha entre el bien y el mal, un joven granjero se embarca en un viaje épico para derrotar a un imperio tiránico y descubrir su destino como un poderoso Jedi."));
        peliculas.add(new Peliculas(2, "El Señor de los Anillos: La Comunidad del Anillo", 2001, "Peter Jackson", "Fantasía", "Un grupo de compañeros emprende un peligroso viaje para destruir un poderoso anillo y derrotar al malvado Señor Oscuro."));
        peliculas.add(new Peliculas(3, "El Padrino", 1972, "Francis Ford Coppola", "Drama", "La historia de la familia mafiosa Corleone y su lucha por el poder en el mundo del crimen organizado."));
        peliculas.add(new Peliculas(4, "Volver al Futuro", 1985, "Robert Zemeckis", "Ciencia ficción", "Un adolescente viaja en el tiempo a bordo de un DeLorean modificado junto a un científico excéntrico para salvar el futuro."));
        peliculas.add(new Peliculas(5, "Titanic", 1997, "James Cameron", "Drama romántico", "El trágico hundimiento del famoso transatlántico y el romance prohibido entre una joven aristócrata y un artista pobre."));
    }

    @GetMapping("/peliculas")
    public List<Peliculas> getPeliculas() {
        return peliculas;
    }

    @GetMapping("/peliculas/{id}")
    public Peliculas getPelicukasById(@PathVariable int id) {
        for (Peliculas peliculas : peliculas) {
            if (peliculas.getId() == id) {
                return peliculas;
            }
        }
        //Si no se encuentra un estudiante con el ID especificado, puedes manejarlo adecuadamente
        //por ejemplo, lanzar una excepcion o devolver null
        return null;
    }


}