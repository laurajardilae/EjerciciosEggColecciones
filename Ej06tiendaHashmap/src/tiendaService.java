import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class tiendaService {
    private HashMap<String, Integer> listaProductos = new HashMap<>();
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    public void productosPorDefecto(){
        listaProductos.put("Harina",1200);
        listaProductos.put("Jabon",2500);
        listaProductos.put("Pasta",3200);
        listaProductos.put("Jabon",2500);
        listaProductos.put("Escoba",12500);
    }
    public void nuevoProducto(){
        System.out.println("Ingrese el nombre del producto:");
        String n = scan.next();
        System.out.println("Ingrese el valor del producto: ");
        Integer p = Integer.parseInt(scan.next());
        listaProductos.put(n, p);
        System.out.println("Producto añadido correctamente");
    }
    public void modificarPrecio(){
        System.out.println("Ingrese el nombre del producto:");
        String n = scan.next();
        if(listaProductos.containsKey(n)){
            System.out.println("Ingrese el nuevo valor del producto: ");
            Integer p = Integer.parseInt(scan.next());
            listaProductos.put(n,p);
            System.out.println("Precio actualizado exitosamente");
            System.out.println(n + ":" + listaProductos.get(n));
        }else {
            System.out.println("No se encontró el producto en el listado");
        }
    }
    public void eliminarProducto(){
        int tamanoInicial = listaProductos.size();
        System.out.println("Ingrese el nombre del producto:");
        String n = scan.next();
        listaProductos.remove(n);
        if (listaProductos.size()==tamanoInicial-1){
            System.out.println("Producto eliminado exitosamente");
        }else {
            System.out.println("No se encontró el producto en el listado");
        }

    }
    public void mostrarLista(){
        for (Map.Entry<String, Integer> producto: listaProductos.entrySet()) {
            System.out.printf("Producto: %s - Precio: %d\n",producto.getKey(),producto.getValue());
        }
    }
    public void mostrarLista2(){
        listaProductos.forEach((s, integer) -> System.out.printf("Producto: %s - Precio: %d\n",s,integer));
    }

    @Override
    public String toString() {
        return "tiendaService{" +
                "listaProductos=" + listaProductos +
                '}';
    }
}
