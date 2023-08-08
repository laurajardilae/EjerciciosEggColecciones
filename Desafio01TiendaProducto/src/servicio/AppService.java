package servicio;

import entidad.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppService {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    productoService ps = new productoService();
    tiendaService ts = new tiendaService(ps);

    public void ejecutar(){
        ts.agregarProductosPorDefecto();
        menuPrincipal();
    }
    public void menuPrincipal(){
        int opc;
        do {
            System.out.println("---MENU---\nSeleccione una opción:");
            System.out.println("1. Ingresar como empleado");
            System.out.println("2. Ingresar como cliente");
            System.out.println("3. Salir");
            opc=Integer.parseInt(scan.next());
            switch (opc){
                case 1:
                    menuEmpleado();
                    break;
                case 2:
                    menuCliente();
                    break;
                case 3:
                    System.out.println("Hasta luego");
                    break;
            }

        }while(opc!=3);
    }
    public void menuEmpleado(){
        int opc;
        do {
            System.out.println("---MENU EMPLEADOS---\nSeleccione una opción:");
            System.out.println("1. Ingresar un nuevo producto");
            System.out.println("2. Reabastecer un producto existente");
            System.out.println("3. Volver al menú principal");
            opc=Integer.parseInt(scan.next());
            switch (opc){
                case 1:
                    ts.agregarNuevoProducto(ps.crearNuevoProducto());
                    break;
                case 2:
                    ts.reabastecerProductoExistente();
                    break;
            }

        }while(opc!=3);
    }
    public void menuCliente(){
        int opc;
        do {
            System.out.println("---MENU CLIENTES---\nSeleccione una opción:");
            System.out.println("1. Comprar un producto");
            System.out.println("2. Volver al menú principal");
            opc=Integer.parseInt(scan.next());
            switch (opc){
                case 1:
                    ts.comprarProducto();
                    break;
            }

        }while(opc!=2);
    }
}
