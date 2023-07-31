import java.sql.Time;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class peliculaService {
    private List<Pelicula> listaPelis = new ArrayList<>();
    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public void crearPelisPorDefecto(){
        listaPelis.add(new Pelicula("Barbie","Greta Gerwig",new Time(1,54,0)));
        listaPelis.add(new Pelicula("Encanto", "Byron Howard",new Time(1,49,0)));
        listaPelis.add(new Pelicula("Avengers: Endgame","Anthony y Joe Russo",new Time(3,2,0)));
        listaPelis.add(new Pelicula("Oppenheimer","Christopher Nolan",new Time(3,0,0)));
    }
    public void crearNuevaPeli(){
        Pelicula p = new Pelicula();
        System.out.println("Ingrese el titulo de la pelicula: ");
        p.setTitulo(scan.next());
        System.out.println("Ingrese el director de la pelicula: ");
        p.setDirector(scan.next());
        System.out.println("Ingrese la duración de la pelicula (horas y minutos):");
        p.setDuracion(new Time(scan.nextInt(), scan.nextInt(), 0));
        listaPelis.add(p);
        System.out.println("Pelicula añadida exitosamente");
        System.out.println(p.toString());
    }
    public void listaCompleta(){
        for (Pelicula p:listaPelis) {
            System.out.println(p.toString());
        }
    }
    public void masDeDosHoras(){
        for (Pelicula p:listaPelis) {
            if(p.getDuracion().getHours()>=2){
                System.out.println(p.toString());
            }

        }
    }
    public void minToMaxDuracion(){
        Collections.sort(listaPelis,Comparador.minToMaxDuracion);
        for (Pelicula p:listaPelis) {
            System.out.println(p.toString());
        }
    }
    public void maxToMinDuracion(){
        Collections.sort(listaPelis,Comparador.maxToMinDuracion);
        for (Pelicula p:listaPelis) {
            System.out.println(p.toString());
        }
    }
    public void tituloAlfabetico(){
        Collections.sort(listaPelis,Comparador.titulo);
        for (Pelicula p:listaPelis) {
            System.out.println(p.toString());
        }
    }
    public void directorAlfabetico(){
        Collections.sort(listaPelis,Comparador.director);
        for (Pelicula p:listaPelis) {
            System.out.println(p.toString());
        }
    }
}
