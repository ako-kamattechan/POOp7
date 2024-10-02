package dispositivos.computadora.pc;

import dispositivos.computadora.Computadora;

public class Laptop extends Computadora {
    private int porcentajeBateria;
    private double precio;

    /**
     * Constructor de la clase Computadora
     * @param (porcentajeBateria, precio) son los argumentos del constructor (que no pertenecen a clases ancestro)
     */

    public Laptop(String marca, boolean isPremium, String CPU, int RAM, int memoria, int porcentajeBateria, double precio){
        super(marca, isPremium, CPU, RAM, memoria);
        this.porcentajeBateria = porcentajeBateria;
        this.precio = precio;
    }

    /**
     * Getters
     * @return Retorna los atributos que se especifiquen
     */

    public String getMarca(){return this.marca;}
    public boolean getIsPremium(){return this.isPremium;}
    public String getCPU(){return this.CPU;}
    public int getRAM(){return this.RAM;}
    public int getMemoria(){return this.memoria;}
    public int getPorcentajeBateria(){return this.porcentajeBateria;}
    public double getPrecio(){return this.precio;}

    /**
     * Setters
     * @param precio modifica el precio de algún artículo para aplicar el descuento correspondiente
     */

    public void setPrecio(int precio){this.precio = precio;}

    /**
     * Setters
     * @param porcentajeBateria modifica el porcentaje de batería del dispositivo
     */

    public void setPorcentajeBateria(int porcentajeBateria){this.porcentajeBateria = porcentajeBateria;}


}
