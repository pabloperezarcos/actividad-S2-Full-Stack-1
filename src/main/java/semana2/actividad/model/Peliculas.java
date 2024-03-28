package semana2.actividad.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "peliculas")
public class Peliculas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pelicula")
    private Long id_pelicula;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "director")
    private String director;

    @Column(name = "anio_lanzamiento")
    private int anioLanzamiento;

    @Column(name = "genero")
    private String genero;

    @Column(name = "sinopsis")
    private String sinopsis;

    @Column(name = "duracion")
    private int duracion;

    // Constructor
    public Peliculas() {
    }

    // Getters
    public Long getId() {
        return id_pelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public String getGenero() {
        return genero;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public int getDuracion() {
        return duracion;
    }

    // Setters
    public void setId(Long id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

}

/*
 * package semana2.actividad;
 * 
 * public class Peliculas {
 * private int id;
 * private String titulo;
 * private int anno;
 * private String director;
 * private String genero;
 * private String sinopsis;
 * 
 * //Constructor
 * public Peliculas(int id, String titulo, int anno, String director, String
 * genero, String sinopsis){
 * this.id = id;
 * this.titulo = titulo;
 * this.anno = anno;
 * this.director = director;
 * this.genero = genero;
 * this.sinopsis = sinopsis;
 * }
 * 
 * //Getters and setters
 * public int getId(){
 * return id;
 * }
 * 
 * public String getTitulo(){
 * return titulo;
 * }
 * 
 * public int getAnno(){
 * return anno;
 * }
 * 
 * public String getDirector(){
 * return director;
 * }
 * 
 * public String getGenero(){
 * return genero;
 * }
 * 
 * public String getSinopsis(){
 * return sinopsis;
 * }
 * 
 * }
 */