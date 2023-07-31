package servicio;

import entidad.Producto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class productoService {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");



    public Producto crearNuevoProducto(){
        Producto p = new Producto();
        System.out.println("-----------------");
        System.out.println("Ingrese el nombre del nuevo producto:");
        p.setNombre(scan.next());
        System.out.println("Ingrese el precio del nuevo producto:");
        p.setPrecio(Double.parseDouble(scan.next()));
        System.out.println("Ingrese la cantidad del nuevo producto:");
        p.setCantidad(Integer.parseInt(scan.next()));
        int categoria;
        do{
            System.out.println("Ingrese la categoria del nuevo producto:");
            p.verCategorias();
            categoria=Integer.parseInt(scan.next());
        }while (categoria>=p.getListaCategorias().size());
        p.setCategoria(categoria);
        System.out.println("Producto añadido correctamente");
        System.out.println("-----------------");
        return p;
    }



}
