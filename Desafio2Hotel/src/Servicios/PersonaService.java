package Servicios;

import Entidades.Persona;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PersonaService {
    private Map<String, Persona> personas = new HashMap<>();
    private Scanner scan;

    public PersonaService() {
        this.scan = new Scanner(System.in);
    }

    public Persona crearPersona(String DNIusu) {

        Persona persona = new Persona();
        persona.setDNI(DNIusu);
        System.out.print("Ingrese el nombre: ");
        persona.setNombre(scan.next());
        System.out.print("Ingrese la edad: ");
        persona.setEdad(Integer.parseInt(scan.next()));
        System.out.print("Ingrese el pais: ");
        persona.setPais(scan.next());
        return persona;
    }
    public String agregaPersona(Persona persona) {
        personas.put(persona.getDNI(), persona);
        return persona.getDNI();
    }

    /*public void fabricaPersonas() {
        do {
            agregaPersona(crearPersona());
            System.out.println("Desea seguir ingresando personas? (S/N)");
        } while (scan.nextLine().equalsIgnoreCase("s"));
    }*/

    public void listarPersonas() {
        personas.forEach((s, persona) -> System.out.println(persona));
    }

    public Map<String, Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(Map<String, Persona> personas) {
        this.personas = personas;
    }
}
