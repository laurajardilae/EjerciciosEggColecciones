package Servicios;

import Entidades.Habitacion;
import Entidades.Persona;
import Entidades.Reserva;

import java.time.LocalDate;
import java.util.*;

public class ReservaService {
    private List<Reserva> reservas = new ArrayList<>();
    Scanner scan = new Scanner(System.in).useDelimiter("\n");



    public void crearReserva(Map<Integer,Habitacion> habitaciones, PersonaService personaService){
        System.out.println("Recuerde que la reserva se crea por habitación");
        System.out.println("Ingrese la cantidad de personas que se hospedarán en esta habitación: (1/2/3) ");
        int cantPersonas = Integer.parseInt(scan.next());
        System.out.println("Ingrese la fecha de ingreso:\nIngrese el año + Enter\nIngrese el mes + Enter\nIngrese el día + Enter");
        LocalDate fechaInicio = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());
        System.out.println("Ingrese la fecha de salida:\nIngrese el año + Enter\nIngrese el mes + Enter\nIngrese el día + Enter");
        LocalDate fechaFin = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());

        Map<Integer,Habitacion> disponibles = habitacionesPosiblesPorCantidad(habitaciones,cantPersonas);


        for (Reserva reserva:reservas) {
            if(!(fechaInicio.isAfter(reserva.getFechaFin())||fechaFin.isBefore(reserva.getFechaInicio()))){
                int habitacionOcupada = reserva.getNumeroHabitacion();
                disponibles.remove(habitacionOcupada);
            }
        }
        Integer habitacionSeleccionada;
        do {
            System.out.println("Estas son las habitaciones disponibles:");
            disponibles.forEach((k,v)-> System.out.println(v.toString()));
            System.out.println("Ingrese el numero de habitación que desea reservar:");
            habitacionSeleccionada = Integer.parseInt(scan.next());
            if(disponibles.containsKey(habitacionSeleccionada)){
                break;
            }
        }while(true);

        System.out.println("Ingrese el DNI del titular de la reserva:");
        String DNIusu = scan.next();
        if(!personaService.getPersonas().containsKey(DNIusu)){
            System.out.println("Usuario no encontrado en la base de datos");
            System.out.println("Por favor diligencie la siguiente información");
            personaService.crearPersona(DNIusu);
        }else{
            System.out.println("Usuario encontrado en la base de datos");
        }
        Reserva nuevaReserva = new Reserva(habitacionSeleccionada,cantPersonas,fechaInicio,fechaFin,DNIusu);
        reservas.add(nuevaReserva);
        System.out.println("Reserva creada con éxito");
    }

    public Map<Integer,Habitacion> habitacionesPosiblesPorCantidad(Map<Integer,Habitacion> habitaciones, int cantPersonas){
        Map<Integer,Habitacion> disponibles = new HashMap<>();
        for (Map.Entry<Integer,Habitacion> habitacion: habitaciones.entrySet()) {
            if(habitacion.getValue().getCapacidad()>=cantPersonas){
                disponibles.put(habitacion.getValue().getNumeroHabitacion(),habitacion.getValue());
            }
        }
        return disponibles;
    }
    public void verReservas(){
        reservas.forEach(reserva -> System.out.println(reserva));
    }
    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
    @Override
    public String toString() {
        return "ReservaService{" +
                "reservas=" + reservas +
                '}';
    }
}
