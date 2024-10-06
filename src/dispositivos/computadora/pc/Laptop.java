package dispositivos.computadora.pc;

import dispositivos.computadora.Computadora;

public class Laptop extends Computadora {
    private int porcentajeBateria;

    /**
     * Constructor de la clase Computadora
     * @param (porcentajeBateria, precio) son los argumentos del constructor (que no pertenecen a clases ancestro)
     */

    public Laptop(String marca, boolean isPremium, double precio, String CPU, int RAM, int memoria, int porcentajeBateria){
        super(marca, isPremium, precio, CPU, RAM, memoria);
        this.porcentajeBateria = porcentajeBateria;
    }

    /**
     * Getters
     */

    public int getPorcentajeBateria(){return this.porcentajeBateria;}

    /**
     * Setters
     */

    public void setPorcentajeBateria(int porcentajeBateria){this.porcentajeBateria = porcentajeBateria;}


}
