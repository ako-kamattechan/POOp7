package tienda.clientes;

import java.util.LinkedList;

public class Cliente{
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected int numCliente;
    protected int numCompras;
    protected boolean esVIP=false;
    protected double descuento;
    protected LinkedList<Carrito> carritoCompras;
    
    public Cliente(String nombre, String apellido, int numCliente){
        this.nombre=nombre;
        this.apellido=apellido;
        this.numCliente=numCliente;
        this.numCompras=0;
        LinkedList<Carrito> carritoCompras = new LinkedList<>();
    }
     
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean getVip(){
        return esVIP;
    }

    public int getNumCliente(){
        return this.numCliente;
    }

    public void comprarArticulo(double precio) {
        System.out.println(nombre + " ha comprado un artículo por $" + precio + ".");
        numCompras++;
    }

    public void agregarAlCarrito(String nombreArticulo, double precio) {
        Carrito nuevoArticulo = new Carrito(nombreArticulo, precio);
        carritoCompras.add(nuevoArticulo);  
        System.out.println(nombre + " ha agregado " + nombreArticulo + " por $" + precio + " al carrito.");
    }

    public void mostrarCarrito() {
        if (carritoCompras.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            System.out.println("Carrito de " + nombre + ":");
            for (Carrito articulo : carritoCompras) {
                System.out.println(articulo);
            }
        }
    }

    public void vaciarCarrito() {
        carritoCompras.clear();
        System.out.println("El carrito ha sido vaciado.");
    }
}