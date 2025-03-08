public class Pelicula {

    private String titulo;
    private int duracion;
    private int edadMinima;
    private String director;
    private String genero;

    public Pelicula(String titulo, int duracion, int edadMinima, String director, String genero) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public String getDirector() {
        return director;
    }

    public String getGenero() {
        return genero;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", duracion=" + duracion +
                ", edadMinima=" + edadMinima +
                ", director='" + director + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
    
}
