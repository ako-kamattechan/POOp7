package tienda.clientes;

import java.util.LinkedList;

import tienda.Tienda;
import tienda.dispositivos.DispositivoElectronico;
import tienda.dispositivos.computadora.dispositivoMovil.Celular;
import tienda.dispositivos.computadora.dispositivoMovil.Tablet;
import tienda.dispositivos.computadora.pc.Laptop;
import tienda.dispositivos.computadora.pc.PC;

public class Cliente{
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected int numCliente;
    protected int numCompras;
    protected boolean esVIP=false;
    protected double descuento;
    public LinkedList<Articulo> carritoCompras = new LinkedList<>();
    public LinkedList<Articulo> articulosComprados = new LinkedList<>();

    
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

    public void comprarArticulo(Tienda tienda, Estudiante cliente, int indice, String tipoDeArticulo) {
        Laptop laptopAux;
        PC pcAux;
        Tablet tabletAux;
        Celular celularAux;

        double precioAux;

        switch(tipoDeArticulo){
            case "PC":
                pcAux = (PC)tienda.articulos.get(0).get(indice);

                if(pcAux.isPremium()){
                    System.out.println("Articulo solo disponible para clientes VIP");
                    return;
                }

                articulosComprados.add(new Articulo(pcAux.getNombre(), ((pcAux.getPrecio()) - pcAux.getPrecio()*0.10)));
                precioAux = (pcAux.getPrecio() - pcAux.getPrecio()*0.10);
                System.out.println(nombre + " ha comprado un artículo por $" + precioAux + ".");
                break;
            case "Laptop":
                laptopAux = (Laptop)tienda.articulos.get(1).get(indice);

                if(laptopAux.isPremium()){
                    System.out.println("Articulo solo disponible para clientes VIP");
                    return;
                }

                articulosComprados.add(new Articulo(laptopAux.getNombre(), ((laptopAux.getPrecio()) - laptopAux.getPrecio()*0.10)));
                precioAux = (laptopAux.getPrecio() - laptopAux.getPrecio()*0.10);
                System.out.println(nombre + " ha comprado un artículo por $" + precioAux + ".");
                break;
            case "Tablet":
                tabletAux = (Tablet)tienda.articulos.get(2).get(indice);

                if(tabletAux.isPremium()){
                    System.out.println("Articulo solo disponible para clientes VIP");
                    return;
                }

                articulosComprados.add(new Articulo(tabletAux.getNombre(), ((tabletAux.getPrecio()) - tabletAux.getPrecio()*0.10)));
                precioAux = (tabletAux.getPrecio() - tabletAux.getPrecio()*0.10);
                System.out.println(nombre + " ha comprado un artículo por $" + precioAux + ".");
                break;
            case "Celular":
                celularAux = (Celular)tienda.articulos.get(3).get(indice);

                if(celularAux.isPremium()){
                    System.out.println("Articulo solo disponible para clientes VIP");
                    return;
                }

                articulosComprados.add(new Articulo(celularAux.getNombre(), celularAux.getPrecio()));
                precioAux = celularAux.getPrecio()-celularAux.getPrecio()*0.10;
                System.out.println(nombre + " ha comprado un artículo por $" + precioAux + ".");
                break;
        }
        numCompras++;
    }

    public void comprarArticulo(Tienda tienda, Comprador cliente, int indice, String tipoDeArticulo) {
        Laptop laptopAux;
        PC pcAux;
        Tablet tabletAux;
        Celular celularAux;

        double precioAux;

        switch(tipoDeArticulo){
            case "PC":
                pcAux = (PC)tienda.articulos.get(0).get(indice);

                if(pcAux.isPremium()){
                    System.out.println("Articulo solo disponible para clientes VIP");
                    return;
                }


                articulosComprados.add(new Articulo(pcAux.getNombre(), ((pcAux.getPrecio()) - pcAux.getPrecio()*0.10)));
                precioAux = (pcAux.getPrecio() - pcAux.getPrecio()*0.10);
                System.out.println(nombre + " ha comprado un artículo por $" + precioAux + ".");
                break;
            case "Laptop":
                laptopAux = (Laptop)tienda.articulos.get(1).get(indice);

                if(laptopAux.isPremium()){
                    System.out.println("Articulo solo disponible para clientes VIP");
                    return;
                }

                articulosComprados.add(new Articulo(laptopAux.getNombre(), ((laptopAux.getPrecio()) - laptopAux.getPrecio()*0.10)));
                precioAux = (laptopAux.getPrecio() - laptopAux.getPrecio()*0.10);
                System.out.println(nombre + " ha comprado un artículo por $" + precioAux + ".");
                break;
            case "Tablet":
                tabletAux = (Tablet)tienda.articulos.get(2).get(indice);

                if(tabletAux.isPremium()){
                    System.out.println("Articulo solo disponible para clientes VIP");
                    return;
                }

                articulosComprados.add(new Articulo(tabletAux.getNombre(), ((tabletAux.getPrecio()) - tabletAux.getPrecio()*0.10)));
                precioAux = (tabletAux.getPrecio() - tabletAux.getPrecio()*0.10);
                System.out.println(nombre + " ha comprado un artículo por $" + precioAux + ".");
                break;
            case "Celular":
                celularAux = (Celular)tienda.articulos.get(3).get(indice);

                if(celularAux.isPremium()){
                    System.out.println("Articulo solo disponible para clientes VIP");
                    return;
                }

                articulosComprados.add(new Articulo(celularAux.getNombre(), celularAux.getPrecio()));
                precioAux = celularAux.getPrecio()-celularAux.getPrecio()*0.10;
                System.out.println(nombre + " ha comprado un artículo por $" + precioAux + ".");
                break;
        }
        numCompras++;
    }

    public void comprarArticulo(Tienda tienda, ClienteVip cliente, int indice, String tipoDeArticulo) {
        Laptop laptopAux;
        PC pcAux;
        Tablet tabletAux;
        Celular celularAux;

        double precioAux;

        switch(tipoDeArticulo){
            case "PC":
                pcAux = (PC)tienda.articulos.get(0).get(indice);
                articulosComprados.add(new Articulo(pcAux.getNombre(), ((pcAux.getPrecio()) - pcAux.getPrecio()*0.10)));
                precioAux = (pcAux.getPrecio() - pcAux.getPrecio()*0.20);
                System.out.println(nombre + " ha comprado un artículo por $" + precioAux + ".");
                break;
            case "Laptop":
                laptopAux = (Laptop)tienda.articulos.get(1).get(indice);
                articulosComprados.add(new Articulo(laptopAux.getNombre(), ((laptopAux.getPrecio()) - laptopAux.getPrecio()*0.10)));
                precioAux = (laptopAux.getPrecio() - laptopAux.getPrecio()*0.20);
                System.out.println(nombre + " ha comprado un artículo por $" + precioAux + ".");
                break;
            case "Tablet":
                tabletAux = (Tablet)tienda.articulos.get(2).get(indice);
                articulosComprados.add(new Articulo(tabletAux.getNombre(), ((tabletAux.getPrecio()) - tabletAux.getPrecio()*0.10)));
                precioAux = (tabletAux.getPrecio() - tabletAux.getPrecio()*0.20);
                System.out.println(nombre + " ha comprado un artículo por $" + precioAux + ".");
                break;
            case "Celular":
                celularAux = (Celular)tienda.articulos.get(3).get(indice);
                articulosComprados.add(new Articulo(celularAux.getNombre(), celularAux.getPrecio()));
                precioAux = celularAux.getPrecio()-celularAux.getPrecio()*0.20;
                System.out.println(nombre + " ha comprado un artículo por $" + precioAux + ".");
                break;
        }
    }


    public void agregarAlCarrito(Tienda tienda, ClienteVip cliente, int indice, String tipoDeArticulo) {
        Laptop laptopAux;
        PC pcAux;
        Tablet tabletAux;
        Celular celularAux;

        double precioAux;

        switch(tipoDeArticulo){
            case "PC":
                pcAux = (PC)tienda.articulos.get(0).get(indice);
                carritoCompras.add(new Articulo(pcAux.getNombre(), ((pcAux.getPrecio()) - pcAux.getPrecio()*0.10)));
                precioAux = (pcAux.getPrecio() - pcAux.getPrecio()*0.20);
                System.out.println(nombre + " ha agregado " + pcAux.getNombre() + " por $" + precioAux + " al carrito.");
                break;
            case "Laptop":
                laptopAux = (Laptop)tienda.articulos.get(1).get(indice);
                carritoCompras.add(new Articulo(laptopAux.getNombre(), ((laptopAux.getPrecio()) - laptopAux.getPrecio()*0.10)));
                precioAux = (laptopAux.getPrecio() - laptopAux.getPrecio()*0.20);
                System.out.println(nombre + " ha agregado " + laptopAux.getNombre() + " por $" + precioAux + " al carrito.");
                break;
            case "Tablet":
                tabletAux = (Tablet)tienda.articulos.get(2).get(indice);
                carritoCompras.add(new Articulo(tabletAux.getNombre(), ((tabletAux.getPrecio()) - tabletAux.getPrecio()*0.10)));
                precioAux = (tabletAux.getPrecio() - tabletAux.getPrecio()*0.20);
                System.out.println(nombre + " ha agregado " + tabletAux.getNombre() + " por $" + precioAux + " al carrito.");
                break;
            case "Celular":
                celularAux = (Celular)tienda.articulos.get(3).get(indice);
                carritoCompras.add(new Articulo(celularAux.getNombre(), celularAux.getPrecio()));
                precioAux = celularAux.getPrecio()-celularAux.getPrecio()*0.20;
                System.out.println(nombre + " ha agregado " + celularAux.getNombre() + " por $" + precioAux + " al carrito.");
                break;
            default:
                System.out.println("Articulo no existe");
                break;
        }
    }

    public void agregarAlCarrito(Tienda tienda, Comprador cliente, int indice, String tipoDeArticulo) {
        Laptop laptopAux;
        PC pcAux;
        Tablet tabletAux;
        Celular celularAux;

        double precioAux;

        switch(tipoDeArticulo){
            case "PC":
                pcAux = (PC)tienda.articulos.get(0).get(indice);

                if(pcAux.isPremium()){
                    System.out.println("Articulo solo disponible para clientes VIP");
                    return;
                }

                carritoCompras.add(new Articulo(pcAux.getNombre(), pcAux.getPrecio()));
                precioAux = pcAux.getPrecio();
                System.out.println(nombre + " ha agregado " + pcAux.getNombre() + " por $" + precioAux + " al carrito.");
                break;
            case "Laptop":
                laptopAux = (Laptop)tienda.articulos.get(1).get(indice);

                if(laptopAux.isPremium()){
                    System.out.println("Articulo solo disponible para clientes VIP");
                    return;
                }

                carritoCompras.add(new Articulo(laptopAux.getNombre(), laptopAux.getPrecio()));
                precioAux = laptopAux.getPrecio();
                System.out.println(nombre + " ha agregado " + laptopAux.getNombre() + " por $" + precioAux + " al carrito.");
                break;
            case "Tablet":
                tabletAux = (Tablet)tienda.articulos.get(2).get(indice);

                if(tabletAux.isPremium()){
                    System.out.println("Articulo solo disponible para clientes VIP");
                    return;
                }

                carritoCompras.add(new Articulo(tabletAux.getNombre(), tabletAux.getPrecio()));
                precioAux = tabletAux.getPrecio();
                System.out.println(nombre + " ha agregado " + tabletAux.getNombre() + " por $" + precioAux + " al carrito.");
                break;
            case "Celular":
                celularAux = (Celular)tienda.articulos.get(3).get(indice);

                if(celularAux.isPremium()){
                    System.out.println("Articulo solo disponible para clientes VIP");
                    return;
                }

                carritoCompras.add(new Articulo(celularAux.getNombre(), celularAux.getPrecio()));
                precioAux =celularAux.getPrecio();
                System.out.println(nombre + " ha agregado " + celularAux.getNombre() + " por $" + precioAux + " al carrito.");
                break;
            default:
                System.out.println("Articulo no existe");
                break;
        }
    }

    public void agregarAlCarrito(Tienda tienda, Estudiante cliente, int indice, String tipoDeArticulo) {
        Laptop laptopAux;
        PC pcAux;
        Tablet tabletAux;
        Celular celularAux;

        double precioAux;

        switch(tipoDeArticulo){
            case "PC":
                pcAux = (PC)tienda.articulos.get(0).get(indice);

                if(pcAux.isPremium()){
                    System.out.println("Articulo solo disponible para clientes VIP");
                    return;
                }

                carritoCompras.add(new Articulo(pcAux.getNombre(), ((pcAux.getPrecio()) - pcAux.getPrecio()*0.10)));
                precioAux = pcAux.getPrecio();
                System.out.println(nombre + " ha agregado " + pcAux.getNombre() + " por $" + precioAux + " al carrito.");
                break;
            case "Laptop":
                laptopAux = (Laptop)tienda.articulos.get(1).get(indice);

                if(laptopAux.isPremium()){
                    System.out.println("Articulo solo disponible para clientes VIP");
                    return;
                }

                carritoCompras.add(new Articulo(laptopAux.getNombre(), ((laptopAux.getPrecio()) - laptopAux.getPrecio()*0.10)));
                precioAux = laptopAux.getPrecio();
                System.out.println(nombre + " ha agregado " + laptopAux.getNombre() + " por $" + precioAux + " al carrito.");
                break;
            case "Tablet":
                tabletAux = (Tablet)tienda.articulos.get(2).get(indice);

                if(tabletAux.isPremium()){
                    System.out.println("Articulo solo disponible para clientes VIP");
                    return;
                }

                carritoCompras.add(new Articulo(tabletAux.getNombre(), ((tabletAux.getPrecio()) - tabletAux.getPrecio()*0.10)));
                precioAux = tabletAux.getPrecio();
                System.out.println(nombre + " ha agregado " + tabletAux.getNombre() + " por $" + precioAux + " al carrito.");
                break;
            case "Celular":
                celularAux = (Celular)tienda.articulos.get(3).get(indice);

                if(celularAux.isPremium()){
                    System.out.println("Articulo solo disponible para clientes VIP");
                    return;
                }

                carritoCompras.add(new Articulo(celularAux.getNombre(), celularAux.getPrecio()));
                precioAux =celularAux.getPrecio();
                System.out.println(nombre + " ha agregado " + celularAux.getNombre() + " por $" + precioAux + " al carrito.");
                break;
            default:
                System.out.println("Articulo no existe");
                break;
        }
    }




    public void mostrarCarrito() {
        if (carritoCompras.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            System.out.println("Carrito de " + nombre + ":");
            for (Articulo articulo : carritoCompras) {
                System.out.println("Articulo: " +articulo.getNombre());
                System.out.println("Precio: "+ articulo.getPrecio());
            }
        }
    }

    public void vaciarCarrito() {
        carritoCompras.clear();
        System.out.println("El carrito ha sido vaciado.");
    }
}