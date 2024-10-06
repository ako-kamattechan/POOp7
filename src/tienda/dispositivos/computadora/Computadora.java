package tienda.dispositivos.computadora;

import tienda.dispositivos.*;

public class Computadora extends DispositivoElectronico{
    protected String CPU;
    protected int RAM;
    protected int memoria;

    /**
     * Constructor de la clase Computadora
     */

    public Computadora(String nombre, String marca, boolean isPremium, double precio, String CPU, int RAM, int memoria) {
        super(nombre, marca, isPremium, precio);
        this.CPU = CPU;
        this.RAM = RAM;
        this.memoria = memoria;
    }

    /**
     * getters
     */

    public String getCPU(){return this.CPU;}
    public int getRAM(){return this.RAM;}
    public int getMemoria(){return this.memoria;}

    /**
     * setters
     */

    public void setCPU(String CPU){this.CPU = CPU;}
    public void setRAM(int RAM){this.RAM = RAM;}
    public void setMemoria(int memoria){this.memoria = memoria;}

}
