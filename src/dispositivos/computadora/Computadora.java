package dispositivos.computadora;

import dispositivos.*;

public class Computadora extends DispositivoElectronico{
    protected String CPU;
    protected int RAM;
    protected int memoria;

    public Computadora(String marca, boolean isPremium, String CPU, int RAM, int memoria) {
        super(marca, isPremium);
        this.CPU = CPU;
        this.RAM = RAM;
        this.memoria = memoria;
    }



}
