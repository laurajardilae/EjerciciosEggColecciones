package Servicios;

import Entidades.Persona;
import Entidades.Reserva;

import java.time.LocalDate;
import java.util.Scanner;

public class AppService {
    HabitacionService habitacionService = new HabitacionService();
    PersonaService personaService = new PersonaService();
    ReservaService reservaService = new ReservaService();
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    public void ejecutar(){
        habitacionService.creacionHabitaciones();
        datosPorDefecto();
        menuReservas();
    }

    public void menuReservas(){
        int opc;
        do {
            System.out.println("MENÚ RESERVAS");
            System.out.println("1. Crear nueva reserva\n2. Eliminar una reserva\n3. Ver todas las reservas\n4.Salir");
            opc= scan.nextInt();
            switch (opc){
                case 1:
                    reservaService.crearReserva(habitacionService.getHabitaciones(),personaService);
                    break;
                case 2:
                    System.out.println("funcion en mantenimiento :)");
                    break;
                case 3:
                    reservaService.verReservas();
                    break;
                case 4:
                    System.out.println("Hasta luego");
                    break;
                /*case 5:
                    //pruebas
                    System.out.println(reservaService.habitacionesPosiblesPorCantidad(habitacionService.getHabitaciones(),2).toString());
                    break;*/
                default:
                    System.out.println("Opción inválida");
            }
        }while(opc!=4);

    }

    public void datosPorDefecto(){
        personaService.getPersonas().put("1234",new Persona("Laura",24,"1234","Colombia"));
        personaService.getPersonas().put("5678",new Persona("Juan",29,"5678","USA"));
        reservaService.getReservas().add(new Reserva(2,2, LocalDate.of(2023,8,15),LocalDate.of(2023,8,20),"1234"));
        reservaService.getReservas().add(new Reserva(9,1, LocalDate.of(2023,8,15),LocalDate.of(2023,8,20),"1234"));
    }


}
