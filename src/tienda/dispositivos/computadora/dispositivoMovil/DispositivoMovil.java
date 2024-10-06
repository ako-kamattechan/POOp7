package tienda.dispositivos.computadora.dispositivoMovil;

import tienda.dispositivos.computadora.Computadora;

public class DispositivoMovil extends Computadora {
    protected final int resolucionCamaraFrontal;
    protected final int resolucionCamaraBack;
    protected final int porcentajeBateria;

    public DispositivoMovil(String nombre, String marca, boolean isPremium, double precio, String CPU, int RAM, int memoria, int resolucionCamaraFrontal, int resolucionCamaraBack, int porcentajeBateria) {
        super(nombre, marca, isPremium, precio, CPU, RAM, memoria);
        this.resolucionCamaraFrontal = resolucionCamaraFrontal;
        this.resolucionCamaraBack = resolucionCamaraBack;
        this.porcentajeBateria = porcentajeBateria;
    }

    /**
     * getters
     */

    public int getResolucionCamaraFrontal() {return this.resolucionCamaraFrontal;}
    public int getResolucionCamaraBack() {return this.resolucionCamaraBack;}
    public int getPorcentajeBateria() {return this.porcentajeBateria;}


}
