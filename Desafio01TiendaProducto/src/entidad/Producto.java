package entidad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Producto {
    private static int contador=0;
    private int id;
    private String nombre;
    private int categoria;
    private double precio;
    private int cantidad;
    private List<String> listaCategorias = Arrays.asList("Despensa","Aseo hogar","Higiene personal");

    public Producto() {
        this.id=contador;
        contador++;
    }

    public Producto(String nombre, int categoria, double precio, int cantidad) {
        this.id=contador;
        contador++;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public int getId() {
        return id;
    }

    public void verProducto(){
        System.out.println("ID = " + id +
                ", nombre = " + nombre +
                ", categoria = " + listaCategorias.get(categoria) +
                ", precio = " + precio +
                ", cantidad = " + cantidad);

    }
    public void verCategorias(){
        for (int i = 0; i < listaCategorias.size(); i++) {
            System.out.println(i+". "+listaCategorias.get(i));
        }
    }

    public List<String> getListaCategorias() {
        return listaCategorias;
    }
}
