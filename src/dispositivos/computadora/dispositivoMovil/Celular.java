package dispositivos.computadora.dispositivoMovil;

import utils.RandNum;

public class Celular extends DispositivoMovil{
    private String numCelular;

    public Celular(String marca, boolean isPremium, double precio, String CPU, int RAM, int memoria, int resolucionCamaraFrontal, int resolucionCamaraBack, int porcentajeBateria, String numCelular) {
        super(marca, isPremium, precio, CPU, RAM, memoria, resolucionCamaraFrontal, resolucionCamaraBack, porcentajeBateria);
        this.numCelular = numCelular;
    }


    /**
     * getters
     */

    public String getNumCelular() {return this.numCelular;}

    /**
     * setters
     */

    public void setNumCelular(String numCelular) {this.numCelular = numCelular;}
    public void setRandNumCelular(){this.numCelular = RandNum.randNum(8, "55");}

}
