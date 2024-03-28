package semana2.actividad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import semana2.actividad.model.Peliculas;
import semana2.actividad.repository.PeliculasRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PeliculasServiceImpl implements PeliculasService {
    @Autowired
    private PeliculasRepository peliculasRepository;

    @Override
    public List<Peliculas> getPeliculas() {
        return peliculasRepository.findAll();
    }

    //@SuppressWarnings("null")
    @Override
    public Optional<Peliculas> getPeliculasById(Long id_pelicula) {
        return peliculasRepository.findById(id_pelicula);
    }
}