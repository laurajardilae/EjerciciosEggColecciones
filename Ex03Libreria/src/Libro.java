import java.util.Objects;

public class Libro {
    private static int contador=0;
    private int id;
    private String titulo;
    private String autor;

    public int getId() {
        return id;
    }

    private int totalEjemplares;
    private int ejemplaresPrestados;

    public Libro() {
        this.id = contador;
        contador++;
    }

    public Libro(String titulo, String autor, int totalEjemplares, int ejemplaresPrestados) {
        this.id = contador;
        contador++;
        this.titulo = titulo;
        this.autor = autor;
        this.totalEjemplares = totalEjemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalEjemplares() {
        return totalEjemplares;
    }

    public void setTotalEjemplares(int totalEjemplares) {
        this.totalEjemplares = totalEjemplares;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " - Titulo: " + titulo +
                " - Autor: " + autor  +
                " - Ejemplares disponibles: " + (totalEjemplares-ejemplaresPrestados) +
                " - Total de ejemplares: " + totalEjemplares +
                " - Ejemplares prestados: " + ejemplaresPrestados;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro l = (Libro) o;
        return Objects.equals(this.getTitulo(), l.getTitulo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitulo());
    }
}
