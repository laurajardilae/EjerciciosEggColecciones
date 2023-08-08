import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ciudadService {

    private Map<String, Ciudad> ciudades = new HashMap<>();
    private Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public void verLista(){
        ciudades.forEach((c, ciudad) -> System.out.printf("Código postal: %s, Ciudad: %s",c,ciudad.toString()));
    }

    public void buscarPorCodigo(){
        System.out.println("Ingrese el codigo postal que desea buscar:");
        String codUsu = scan.next();
        if(ciudades.containsKey(codUsu)){
            System.out.println(ciudades.get(codUsu).toString());
        }else{
            System.out.println("Codigo postal no encontrado");
        }
    }
    public void ingresarNuevaCiudad(){
        System.out.println("Ingrese el codigo postal: ");
        String cod = scan.next();
        Ciudad c = new Ciudad();
        System.out.println("Ingrese el nombre de la ciudad: ");
        c.setNombre(scan.next());
        System.out.println("Ingrese la población de la ciudad: ");
        c.setPoblacion(scan.nextInt());
        if(!ciudades.containsKey(c)){
            ciudades.put(cod,c);
            System.out.println("Ciudad añadida con éxito");
            System.out.println(ciudades.get(cod).toString());
        }else{
            System.out.println("Ya existe una ciudad con ese código postal");
        }
    }
    public void eliminarCiudad(){
        System.out.println("Ingrese el codigo postal de la ciudad que desea eliminar");
        String cod = scan.next();
        if(ciudades.containsKey(cod)){
            ciudades.remove(cod);
            System.out.println("Ciudad eliminada con éxito");
        }else{
            System.out.println("No existe una ciudad con ese código postal");
        }
    }

    public Map<String, Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(Map<String, Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

}
