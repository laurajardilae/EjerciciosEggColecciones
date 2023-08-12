package Entidades;

import java.time.LocalDate;

public class Habitacion {
    private static int contador=0;
    private int numeroHabitacion;
    private int capacidad;

    public Habitacion() {
        contador++;
        this.numeroHabitacion = contador;
    }

    public Habitacion(int capacidad) {
        contador++;
        this.numeroHabitacion = contador;
        this.capacidad = capacidad;

    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }



    @Override
    public String toString() {
        return
                "Número habitación:" + numeroHabitacion +
                " - Capacidad=" + capacidad;
    }
}
