package dispositivos.computadora.pc;

import dispositivos.computadora.Computadora;

public class PC extends Computadora {
    private String tarjetaGrafica;
    private double precio;

    public PC(String marca, boolean isPremium, String CPU, int RAM, int memoria, String tarjetaGrafica, double precio){
        super(marca, isPremium, CPU, RAM, memoria);
        this.tarjetaGrafica = tarjetaGrafica;
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
    public String getPorcentajeBateria(){return this.tarjetaGrafica;}
    public double getPrecio(){return this.precio;}

    /**
     * Setters
     * @param precio modifica el precio de algún artículo para aplicar el descuento correspondiente
     */

    public void setPrecio(int precio){this.precio = precio;}

}
