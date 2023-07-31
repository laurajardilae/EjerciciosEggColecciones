import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class alumnoService {
    private List<Alumno> listaAlumnos = new ArrayList<>();
    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public List<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    /*public void listadoDePrueba(){
        listaAlumnos.add(new Alumno("Lau",new double[]{5, 4, 5}));
    }*/

    public Alumno crearAlumno(){
        System.out.println("--------------------------");
        Alumno a = new Alumno();
        System.out.println("Ingrese el nombre del alumno: ");
        a.setNombre(scan.next());
        System.out.println("Ingrese las 3 notas del alumno: ");
        double[] notas=new double[3];
        for (int i = 0; i < notas.length; i++) {
            notas[i]=Double.parseDouble(scan.next());
        }
        a.setNotas(notas);
        System.out.println("Alumno agregado con éxito");
        System.out.println("--------------------------");
        return a;
    }
    public boolean agregarAlumno(Alumno a){
        return listaAlumnos.add(a);
    }
    public boolean buscarAlumno(String nombreIngresado){
        boolean encontrado=false;
        for (int i = 0; i < listaAlumnos.size(); i++) {
            if(listaAlumnos.get(i).getNombre().equals(nombreIngresado)){
                encontrado=true;
                notaFinal(i);
            }
        }
        if(!encontrado){
            System.out.println("--------------------------");
            System.out.println("El alumno no se encuentra en el listado");
            System.out.println("--------------------------");
        }
        return encontrado;
    }
    public double notaFinal(int indiceAlumno){
        double notas[]=listaAlumnos.get(indiceAlumno).getNotas();
        double prom=0;
        for (double nota:notas) {
            prom+=nota;
        }
        prom=prom/3;
        System.out.println("--------------------------");
        System.out.printf("El promedio %s es: %.2f\n",listaAlumnos.get(indiceAlumno).getNombre(),prom);
        System.out.println("--------------------------");
        return prom;
    }

    public void verListado(){
        //System.out.println("--------------------------");
        System.out.println(listaAlumnos.toString());

    }
}
