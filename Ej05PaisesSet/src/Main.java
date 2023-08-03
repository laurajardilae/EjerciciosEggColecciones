import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Set<Pais> paises = new HashSet<>();
        paisesPorDefecto((HashSet) paises);

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        String opc="";
        do {
            System.out.println("Ingrese el nombre del nuevo país: ");
            paises.add(new Pais(scan.next()));
            System.out.println("¿Desea añadir un nuevo país?(S/N)");
            opc = scan.next();
        }while(opc.equalsIgnoreCase("S"));

        List<Pais> listaPaises = new ArrayList<>(paises);
        Collections.sort(listaPaises, Comparador.ordenarPorNombre);
        System.out.println(listaPaises.toString());
    }

    public static void paisesPorDefecto(HashSet paises){
        paises.add(new Pais("Colombia"));
        paises.add(new Pais("Venezuela"));
        paises.add(new Pais("Perú"));
        paises.add(new Pais("Colombia"));
        paises.add(new Pais("Colombia"));
    }
}