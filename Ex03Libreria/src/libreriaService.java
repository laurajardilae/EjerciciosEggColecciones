import java.util.HashSet;
import java.util.Scanner;

public class libreriaService {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    HashSet<Libro> libros = new HashSet<>();
    public void agregarNuevoLibro(){
        Libro libro = new Libro();
        System.out.println("Ingrese el titulo: ");
        libro.setTitulo(scan.next());
        System.out.println("Ingrese el autor: ");
        libro.setAutor(scan.next());
        int total;
        do {
            System.out.println("Ingrese el total de ejemplares (ingrese un numero mayor a 0):");
            total = Integer.parseInt(scan.next());
        }while (total<=0);
        libro.setTotalEjemplares(total);
        libros.add(libro);
    }
    public void librosPorDefecto(){
        libros.add(new Libro("Orgullo y prejuicio","Jane Austen",5,2));
        libros.add(new Libro("Harry Potter","JK Rowling",3,1));
        libros.add(new Libro("La banda de Picapau","Yan Schenkel",2,0));
    }
    public void verListado(){
        for (Libro libro:libros) {
            System.out.println(libro.toString());
        }
    }

    public void prestamo(){
        verListado();
        System.out.println("Ingrese el ID del libro que desea alquilar: ");
        boolean encontrado = false;
        int libroUsu = Integer.parseInt(scan.next());
        for (Libro libro:libros) {
            if(libro.getId()==libroUsu){
                encontrado = true;
                //Reviso disponibilidad
                if((libro.getTotalEjemplares()-libro.getEjemplaresPrestados())>0){
                    libro.setEjemplaresPrestados(libro.getEjemplaresPrestados()+1);

                }else{
                    System.out.println("Lo sentimos, no tenemos ejemplares disponibles");
                }
                System.out.println(libro.toString());
                break;
            }
        }
        if(!encontrado){
            System.out.println("ID no encontrado, intente nuevamente");
        }

    }
    public void devolucion(){
        verListado();
        boolean encontrado = false;
        System.out.println("Ingrese el ID del libro que desea devolver: ");
        int libroUsu = Integer.parseInt(scan.next());
        for (Libro libro:libros) {
            if(libro.getId()==libroUsu){
                encontrado = true;
                //Reviso si efectivamente habian ejemplares en prestamo
                if(libro.getEjemplaresPrestados()>0){
                    libro.setEjemplaresPrestados(libro.getEjemplaresPrestados()-1);
                }else{
                    System.out.println("Ese libro no tenia ejemplares prestados");
                }
                System.out.println(libro.toString());
                break;
            }
        }
        if(!encontrado){
            System.out.println("ID no encontrado, intente nuevamente");
        }

    }
}
