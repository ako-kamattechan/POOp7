package dispositivos.computadora;

import dispositivos.*;

public class Computadora extends DispositivoElectronico{
    protected String CPU;
    protected int RAM;
    protected int memoria;

    /**
     * Constructor de la clase Computadora
     * @param (CPU, RAM, memoria) son los argumentos del constructor que no pertenecen a clases ancestro
     */

    public Computadora(String marca, boolean isPremium, double precio, String CPU, int RAM, int memoria) {
        super(marca, isPremium, precio);
        this.CPU = CPU;
        this.RAM = RAM;
        this.memoria = memoria;
    }

    /**
     * getters
     */

    protected String getCPU(){return this.CPU;}
    protected int getRAM(){return this.RAM;}
    protected int getMemoria(){return this.memoria;}

    /**
     * setters
     */

    protected void setCPU(String CPU){this.CPU = CPU;}
    protected void setRAM(int RAM){this.RAM = RAM;}
    protected void setMemoria(int memoria){this.memoria = memoria;}

}
