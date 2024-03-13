package semana2.actividad;

public class Peliculas {
    private int id;
    private String titulo;
    private int anno;
    private String director;
    private String genero;
    private String sinopsis;

    //Constructor
    public Peliculas(int id, String titulo, int anno, String director, String genero, String sinopsis){
        this.id = id;
        this.titulo = titulo;
        this.anno = anno;
        this.director = director;
        this.genero = genero;
        this.sinopsis = sinopsis;
    }

    //Getters and setters
    public int getId(){
        return id;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getAnno(){
        return anno;
    }

    public String getDirector(){
        return director;
    }

    public String getGenero(){
        return genero;
    }

    public String getSinopsis(){
        return sinopsis;
    }

}