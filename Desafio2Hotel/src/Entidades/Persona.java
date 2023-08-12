package Entidades;

public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private String pais;

    public Persona() {
    }

    public Persona(String nombre, int edad, String DNI, String pais) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return
                "\nNombre: " + nombre + " - " +
                " - Edad=" + edad +
                " - DNI='" + DNI +
                " - País='" + pais  ;
    }
}
