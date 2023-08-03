import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cantanteService {
    List<CantanteFamoso> listaCantantes = new ArrayList<>();
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    public void nuevoCantante(){
        CantanteFamoso c = new CantanteFamoso();
        System.out.println("Ingrese el nombre:");
        c.setNombre(scan.next());
        System.out.println("Ingrese el titulo del disco con más ventas:");
        c.setDiscoConMasVentas(scan.next());
        listaCantantes.add(c);
        System.out.println("El cantante se ha agregado corectamente");
    }
    public void cantantesPorDefecto(){
        listaCantantes.add(new CantanteFamoso("Shakira","Servicio de lavandería"));
        listaCantantes.add(new CantanteFamoso("Karol G","Mañana Será Bonito"));
        listaCantantes.add(new CantanteFamoso("Bad Bunny","Un Verano Sin Ti"));
    }
    public void verLista(){
        for (CantanteFamoso c : listaCantantes) {
            System.out.printf("Nombre: %s - Disco: %s\n", c.getNombre(),c.getDiscoConMasVentas());
        }
    }
    public void eliminarCantante(){
        verLista();
        System.out.println("Ingrese el cantante que desea eliminar:");
        String eliminado = scan.next();
        int tamanoInicial = listaCantantes.size();
        for (int i = 0; i < listaCantantes.size(); i++) {
            if(listaCantantes.get(i).getNombre().equalsIgnoreCase(eliminado)){
                listaCantantes.remove(i);
            }
        }
        if (listaCantantes.size()==tamanoInicial-1){
            System.out.println("Cantante eliminado exitosamente");
        }else {
            System.out.println("No se encontró el cantante en el listado");
        }

    }
}
