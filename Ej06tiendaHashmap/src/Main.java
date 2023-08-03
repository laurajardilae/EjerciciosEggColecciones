import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        tiendaService ts = new tiendaService();
        ts.productosPorDefecto();
        menu(ts);
    }
    public static void menu(tiendaService ts){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        int opc;
        do{
            System.out.println("MENÚ");
            System.out.println("1. Introducir nuevo producto");
            System.out.println("2. Modificar precio de un producto existente");
            System.out.println("3. Eliminar un producto");
            System.out.println("4. Mostrar listado de productos");
            System.out.println("5. Salir");
            opc = Integer.parseInt(scan.next());
            switch (opc){
                case 1:
                    ts.nuevoProducto();
                    break;
                case 2:
                    ts.mostrarLista();
                    ts.modificarPrecio();
                    break;
                case 3:
                    ts.mostrarLista();
                    ts.eliminarProducto();
                    break;
                case 4:
                    ts.mostrarLista();
                    break;
                case 5:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción inválida intente nuevamente");
            }
        }while(opc!=5);
    }
}