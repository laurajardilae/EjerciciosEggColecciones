import java.util.Scanner;

public class appServicio {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    alumnoService as = new alumnoService();
    public void menu(){
        int opc;
        do{
            System.out.println("Seleccione una opción");
            System.out.println("1.Agregar un alumno\n2.Ver listado de alumnos\n3.Ver nota final de un alumno\n4.Salir");
            opc= scan.nextInt();
            switch (opc){
                case 1:
                    as.agregarAlumno(as.crearAlumno());
                    break;
                case 2:
                    as.verListado();
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del alumno: ");
                    as.buscarAlumno(scan.next());
                    break;
                case 4:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("--------------------------");
                    System.out.println("Opción inválida, intente nuevamente");
                    System.out.println("--------------------------");
            }

        }while(opc!=4);
    }


}
