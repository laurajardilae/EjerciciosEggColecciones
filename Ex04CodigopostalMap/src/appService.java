import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class appService {

    ciudadService cs = new ciudadService();
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    public void ejecutar(){
        ciudadesPorDefecto();
        menu();
    }
    public void menu(){
        int opc;
        do {
            System.out.println("---MENÚ---");
            System.out.println("1. Mostrar listado");
            System.out.println("2. Ingresar nueva ciudad");
            System.out.println("3. Buscar una ciudad");
            System.out.println("4. Eliminar una ciudad");
            System.out.println("5. Salir");
            opc = scan.nextInt();
            switch (opc){
                case 1:
                    cs.verLista();
                    break;
                case 2:
                    cs.ingresarNuevaCiudad();
                    break;
                case 3:
                    cs.buscarPorCodigo();
                    break;
                case 4:
                    cs.verLista();
                    cs.eliminarCiudad();
                    break;
                case 5:
                    System.out.println("Hasta luego");
                    break;
                default:
            }
        }while(opc!=5);


    }
    public void ciudadesPorDefecto(){
        cs.getCiudades().put("60601", new Ciudad("Chicago",2693976));
        cs.getCiudades().put("10115", new Ciudad("Berlin",3769495));
        cs.getCiudades().put("08002", new Ciudad("Barcelona",1636762));
        cs.getCiudades().put("01000", new Ciudad("Ciudad de Mexico",8851080));
        cs.getCiudades().put("00118", new Ciudad("Roma",2872800));
    }
}
