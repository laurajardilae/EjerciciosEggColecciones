import java.sql.Time;

public class Pelicula {
    private String titulo;
    private String director;

    private Time duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Time duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Time getDuracion() {
        return duracion;
    }

    public void setDuracion(Time duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return
                "Titulo: " + titulo + "\n" +
                "Director: " + director + "\n" +
                "Duración: " + duracion + "\n" +
                "-------------------" ;
    }
}
