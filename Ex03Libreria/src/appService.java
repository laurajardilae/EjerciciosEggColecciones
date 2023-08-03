import java.util.Scanner;

public class appService {
    libreriaService ls = new libreriaService();
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    public void ejecutar(){
        ls.librosPorDefecto();
        menu();
    }
    public void menu(){
        int opc;
        do {
            System.out.println("---MENÚ---");
            System.out.println("1. Crear nuevo libro");
            System.out.println("2. Ver listado");
            System.out.println("3. Realizar un préstamo");
            System.out.println("4. Realizar una devolución");
            System.out.println("5. Salir");
            opc = scan.nextInt();
            switch (opc){
                case 1:
                    ls.agregarNuevoLibro();
                    break;
                case 2:
                    ls.verListado();
                    break;
                case 3:
                    ls.prestamo();
                    break;
                case 4:
                    ls.devolucion();
                    break;
                case 5:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }while(opc!=5);


    }
}
