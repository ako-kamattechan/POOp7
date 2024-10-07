package tienda.clientes;

import tienda.dispositivos.DispositivoElectronico;
import tienda.dispositivos.computadora.dispositivoMovil.Celular;
import tienda.dispositivos.computadora.dispositivoMovil.Tablet;
import tienda.dispositivos.computadora.pc.Laptop;
import tienda.dispositivos.computadora.pc.PC;

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

    @Override
    public String toString() {
        return "Artículo: " + dispositivo + ", Precio: $" + costo;
    }
}