package servicio;

import entidad.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class tiendaService {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    private productoService ps;
    private List<Producto> listaProductos= new ArrayList<>();
    public tiendaService(productoService ps) {
        this.ps = ps;
    }
    public void agregarProductosPorDefecto(){
        listaProductos.add(new Producto("Salsa de tomate",0,5000,10));
        listaProductos.add(new Producto("Jabon rey",1,1500,15));
        listaProductos.add(new Producto("Blanqueador",1,5000,10));
        listaProductos.add(new Producto("Cepillo de dientes",2,8000,2));
        listaProductos.add(new Producto("Harina",1,5000,5));

    }
    public void agregarNuevoProducto(Producto p){
        listaProductos.add(p);
    }

    public void reabastecerProductoExistente(){
        int opc;
        boolean encontrado=false;
        System.out.println("Ingrese el ID del producto a reabastecer");
        verLista();
        opc = Integer.parseInt(scan.next());
        for (Producto p : listaProductos) {
            if (p.getId() == opc) {
                encontrado = true;
                System.out.println("Ingrese la cantidad de unidades que desea agregar: ");
                listaProductos.get(opc).setCantidad(listaProductos.get(opc).getCantidad() + Integer.parseInt(scan.next()));
                p.verProducto();
            }
        }
        if (!encontrado){
            System.out.println("El ID es incorrecto");
        }
    }

    public void verLista(){
        for (Producto p:listaProductos
             ) {p.verProducto();

        }
    }
    public void comprarProducto(){
        String opc;
        boolean encontrado=false;
        System.out.println("Ingrese el nombre del producto que desea comprar: ");
        verLista();
        opc = scan.next();
        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i).getNombre().equalsIgnoreCase(opc)) {
                encontrado = true;
                System.out.println("Ingrese la cantidad de unidades que desea comprar: ");
                int cantidadUsu=Integer.parseInt(scan.next());
                if (listaProductos.get(i).getCantidad()>=cantidadUsu){
                    listaProductos.get(i).setCantidad(listaProductos.get(i).getCantidad()-cantidadUsu);
                }else{
                    System.out.println("La cantidad ingresada supera el inventario");
                }
                listaProductos.get(i).verProducto();
            }
        }
        if (!encontrado){
            System.out.println("El ID es incorrecto");
        }


    }
}
