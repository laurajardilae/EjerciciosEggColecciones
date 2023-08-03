import java.util.Scanner;

public class appService {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    cantanteService cs = new cantanteService();
    public void porDefecto(){
        cs.cantantesPorDefecto();
    }
    public void menu(){
        int opc;
        do {
            System.out.println("---MENÚ---");
            System.out.println("1. Ingresar nuevo cantante");
            System.out.println("2. Eliminar un cantante");
            System.out.println("3. Ver listado");
            System.out.println("4. Salir");
            opc = Integer.parseInt(scan.next());
            switch (opc){
                case 1:
                    cs.nuevoCantante();
                    break;
                case 2:
                    cs.eliminarCantante();
                    break;
                case 3:
                    cs.verLista();
                    break;
                case 4:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción inválida");
                }
            }while(opc!=4);
    }
}
