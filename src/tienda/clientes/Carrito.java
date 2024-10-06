package tienda.clientes;

import tienda.dispositivos.*;

public class Carrito{
    private String dispositivo;
    private double costo;

    public Carrito(String dispositivo, double costo){
        this.dispositivo = dispositivo;
        this.costo = costo;
    }

    public String getDispositivo(){
        return dispositivo;
    }

    public void setDispositivo(String dispositivo){
        this.dispositivo = dispositivo;
    }

    public double getCosto(){
        return costo;
    }

    public void setCosto(double costo){
        this.costo = costo;
    }

    public String toString(DispositivoElectronico dispositivoElectronico) {
        return "Artículo: " + dispositivoElectronico.getNombre() + ", Precio: $" + dispositivoElectronico.getPrecio();
    }
}