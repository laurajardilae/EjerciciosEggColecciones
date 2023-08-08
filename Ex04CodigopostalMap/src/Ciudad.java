import java.util.Iterator;

public class Ciudad {
    private String nombre;
    private Integer poblacion;

    public Ciudad() {
    }

    public Ciudad(String nombre, Integer poblacion) {
        this.nombre = nombre;
        this.poblacion = poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(Integer poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        return
                "Nombre: '" + nombre + '\'' +
                ", población=" + poblacion + "\n";
    }
}
