package Servicios;

import Entidades.Habitacion;

import java.util.*;

public class HabitacionService {
    private Map<Integer,Habitacion> habitaciones = new HashMap<>();
    
    public void creacionHabitaciones(){
        for (int i = 0; i < 10; i++) {
            Habitacion h = new Habitacion();
            if(i<5){
                h.setCapacidad(2);
                habitaciones.put(h.getNumeroHabitacion(),h);
            } else if (i>=5 && i<8) {
                h.setCapacidad(3);
                habitaciones.put(h.getNumeroHabitacion(),h);
            }else if (i>=8 && i<10) {
                h.setCapacidad(1);
                habitaciones.put(h.getNumeroHabitacion(),h);
            }
        }
    }

    @Override
    public String toString() {
        return
                "Habitaciones: \n" + habitaciones;
    }

    public Map<Integer, Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Map<Integer, Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }
}
