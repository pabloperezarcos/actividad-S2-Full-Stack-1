package semana2.actividad.service;

import java.util.List;
import java.util.Optional;

import semana2.actividad.model.Peliculas;

public interface PeliculasService {
    List<Peliculas> getPeliculas();
    Optional<Peliculas> getPeliculasById(Long id_pelicula);

}