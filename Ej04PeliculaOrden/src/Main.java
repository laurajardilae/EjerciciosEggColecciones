import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        peliculaService ps = new peliculaService();
        ps.crearPelisPorDefecto();
        int opc;
        do{
            System.out.println("MENÚ");
            System.out.println("Seleccione una opción: ");
            System.out.println("1. Crear nueva pelicula");
            System.out.println("2. Ver todas las peliculas");
            System.out.println("3. Ver peliculas con duracion mayor a dos horas");
            System.out.println("4. Ver peliculas de la mas larga a la más corta");
            System.out.println("5. Ver peliculas de la mas corta a la más larga");
            System.out.println("6. Ver pelicula por titulo alfabeticamente");
            System.out.println("7. Ver pelicula por director alfabeticamente");
            System.out.println("8. Salir");
            opc = Integer.parseInt(scan.next());
            switch (opc){
                case 1:
                    ps.crearNuevaPeli();
                    break;
                case 2:
                    ps.listaCompleta();
                    break;
                case 3:
                    ps.masDeDosHoras();
                    break;
                case 4:
                    ps.maxToMinDuracion();
                    break;
                case 5:
                    ps.minToMaxDuracion();
                    break;
                case 6:
                    ps.tituloAlfabetico();
                    break;
                case 7 :
                    ps.directorAlfabetico();
                    break;
                case 8:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción inválida, intentenuevamente");
            }
        }while(opc!=8);


    }
}