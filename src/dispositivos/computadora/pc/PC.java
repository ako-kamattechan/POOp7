package dispositivos.computadora.pc;

import dispositivos.computadora.Computadora;

public class PC extends Computadora {
    private String tarjetaGrafica;

    public PC(String marca, boolean isPremium, double precio, String CPU, int RAM, int memoria, String tarjetaGrafica){
        super(marca, isPremium, precio, CPU, RAM, memoria);
        this.tarjetaGrafica = tarjetaGrafica;
    }

    /**
     * Getters
     * @return Retorna los atributos que se especifiquen
     */

    public String getTarjetaGrafica(){return this.tarjetaGrafica;}

    /**
     * Setters
     */

    public void setTarjetaGrafica(String tarjetaGrafica){this.tarjetaGrafica = tarjetaGrafica;}

}
