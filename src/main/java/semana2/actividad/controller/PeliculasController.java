package semana2.actividad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import semana2.actividad.model.Peliculas;
import semana2.actividad.service.PeliculasService;

import java.util.List;
import java.util.Optional;
//Pablo
@RestController
@RequestMapping("/peliculas")
public class PeliculasController {
    @Autowired
    private PeliculasService peliculasService;

    @GetMapping
    public List<Peliculas> getPeliculas() {
        return peliculasService.getPeliculas();
    }

    @GetMapping("/{id_pelicula}")
    public Optional<Peliculas> getPeliculasById(@PathVariable Long id_pelicula) {
        return peliculasService.getPeliculasById(id_pelicula);
    }

}

/*
 * @RestController
 * public class PeliculasController {
 * private List<Peliculas> peliculas = new ArrayList<>();
 * 
 * public PeliculasController() {
 * 
 * }
 * 
 * @GetMapping("/peliculas")
 * public List<Peliculas> getPeliculas() {
 * return peliculas;
 * }
 * 
 * @GetMapping("/peliculas/{id}")
 * public Peliculas getPeliculasById(@PathVariable int id) {
 * for (Peliculas peliculas : peliculas) {
 * if (peliculas.getId() == id) {
 * return peliculas;
 * }
 * }
 * // Si no se encuentra un estudiante con el ID especificado, puedes manejarlo
 * // adecuadamente
 * // por ejemplo, lanzar una excepcion o devolver null
 * return null;
 * }
 * 
 * }
 */