package semana2.actividad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import semana2.actividad.model.Peliculas;

public interface PeliculasRepository extends JpaRepository<Peliculas, Long>{

    
}
