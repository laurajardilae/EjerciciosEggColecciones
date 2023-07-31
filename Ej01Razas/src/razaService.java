import java.util.*;

public class razaService {
    List<String> razasPerros = new ArrayList<>();


    public void agregarRaza(String raza){
        razasPerros.add(raza);
    }
    public void eliminarRaza(String raza){
        Iterator<String> iterator = razasPerros.iterator();
        boolean eliminado=false;
        while(iterator.hasNext()){
            String aux = iterator.next();
            if(aux.equals(raza)){
                iterator.remove();
                System.out.println("Ha sido eliminado con éxito");
                eliminado=true;
            }
        }
        if(!eliminado){
            System.out.println("La raza ingresada no se encontraba en la lista");
        }
        verLista();
    }
    public void verLista(){
        Collections.sort(razasPerros);
        System.out.println(razasPerros.toString());
    }

    public List<String> getRazasPerros() {
        return razasPerros;
    }
}
