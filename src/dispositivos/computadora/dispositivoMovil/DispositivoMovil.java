package dispositivos.computadora.dispositivoMovil;

import dispositivos.computadora.Computadora;

public class DispositivoMovil extends Computadora {
    protected int resolucionCamaraFrontal;
    protected int resolucionCamaraBack;
    protected int porcentajeBateria;

    public DispositivoMovil(String marca, boolean isPremium, String CPU, int RAM, int memoria, int resolucionCamaraFrontal, int resolucionCamaraBack, int porcentajeBateria) {
        super(marca, isPremium, CPU, RAM, memoria);
        this.resolucionCamaraFrontal = resolucionCamaraFrontal;
        this.resolucionCamaraBack = resolucionCamaraBack;
        this.porcentajeBateria = porcentajeBateria;
    }

}
