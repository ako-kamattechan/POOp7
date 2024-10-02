package dispositivos.computadora;

import dispositivos.*;

public class Computadora extends DispositivoElectronico{
    protected final String CPU;
    protected final int RAM;
    protected final int memoria;

    /**
     * Constructor de la clase Computadora
     * @param (CPU, RAM, memoria) son los argumentos del constructor que no pertenecen a clases ancestro
     */

    public Computadora(String marca, boolean isPremium, String CPU, int RAM, int memoria) {
        super(marca, isPremium);
        this.CPU = CPU;
        this.RAM = RAM;
        this.memoria = memoria;
    }

}
