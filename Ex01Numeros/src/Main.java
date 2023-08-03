import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Integer n;
        double suma=0;
        do {
            System.out.println("Ingrese un numero: ");
            n = scan.nextInt();
            if(n!=-99){
                lista.add(n);
                suma+=n;
            }else{
                break;
            }
        }while(true);

        System.out.printf("Se almacenaron %d valores",lista.size());
        System.out.println(lista.toString());
        System.out.println("La suma es: " + suma);

        double prom = suma/ lista.size();
        System.out.println("El promedio es: " + prom);

    }
}