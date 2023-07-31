import java.util.Scanner;

/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        razaService razaService = new razaService();
        int opc;
        do {
            System.out.println("Seleccione una opción");
            System.out.println("1.Ingresar nueva raza\n2.Ver lista\n3.Eliminar una raza\n4.Salir");
            opc = entrada.nextInt();
            String raza;
            switch (opc) {
                case 1:
                    System.out.println("Ingrese la raza:");
                    raza=entrada.next();
                    razaService.agregarRaza(raza);
                    break;
                case 2:
                    razaService.verLista();
                    break;
                case 3:
                    System.out.println("Ingrese la raza que desea eliminar de la lista:");
                    raza= entrada.next();
                    razaService.eliminarRaza(raza);
                    break;
                case 4:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente");
            }
        } while (opc != 4);


    }
}