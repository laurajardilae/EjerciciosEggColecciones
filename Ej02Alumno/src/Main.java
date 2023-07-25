import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("BIENVENIDO");
        int opc;
        do{
            System.out.println("Seleccione una opción");
            opc= scan.nextInt();
            System.out.println("1.Agregar un alumno\n2.Ver listado de alumnos\n3.Ver nota final de un alumno");
            switch (opc){
                case 1:
                case 2:
                case 3:
                default:
                    System.out.println("Opción inválida, intente nuevamente");
            }

        }while(opc!=3);
    }
}