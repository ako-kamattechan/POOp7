package dispositivos.computadora.dispositivoMovil;

import dispositivos.computadora.Computadora;

public class DispositivoMovil extends Computadora {
    protected final int resolucionCamaraFrontal;
    protected final int resolucionCamaraBack;
    protected final int porcentajeBateria;

    public DispositivoMovil(String marca, boolean isPremium, double precio, String CPU, int RAM, int memoria, int resolucionCamaraFrontal, int resolucionCamaraBack, int porcentajeBateria) {
        super(marca, isPremium, precio, CPU, RAM, memoria);
        this.resolucionCamaraFrontal = resolucionCamaraFrontal;
        this.resolucionCamaraBack = resolucionCamaraBack;
        this.porcentajeBateria = porcentajeBateria;
    }

    /**
     * getters
     */

    protected int getResolucionCamaraFrontal() {return this.resolucionCamaraFrontal;}
    protected int getResolucionCamaraBack() {return this.resolucionCamaraBack;}
    protected int getPorcentajeBateria() {return this.porcentajeBateria;}


}
