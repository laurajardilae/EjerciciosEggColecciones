package Entidades;

import java.time.LocalDate;

public class Reserva {
    private static int contador=0;
    private int ID;
    private int numeroHabitacion;
    private int cantidadPersonas;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String titular;


    public Reserva(int numeroHabitacion, int cantidadPersonas, LocalDate fechaInicio, LocalDate fechaFin, String titular) {
        this.ID = contador;
        contador++;
        this.numeroHabitacion = numeroHabitacion;
        this.cantidadPersonas = cantidadPersonas;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.titular = titular;
    }

    public Reserva() {
        this.ID = contador;
        contador++;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "ID=" + ID +
                ", numeroHabitacion=" + numeroHabitacion +
                ", cantidadPersonas=" + cantidadPersonas +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", DNI titular='" + titular + '\'' +
                '}';
    }
}
