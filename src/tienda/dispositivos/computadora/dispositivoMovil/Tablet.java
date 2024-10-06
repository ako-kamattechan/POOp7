package tienda.dispositivos.computadora.dispositivoMovil;

public class Tablet extends DispositivoMovil{

    /**
     * La clase tablet no tiene atributos adicionales a los de dispositivo movil
     */

    public Tablet(String nombre, String marca, boolean isPremium, double precio, String CPU, int RAM, int memoria, int resolucionCamaraFrontal, int resolucionCamaraBack, int porcentajeBateria){
        super(nombre, marca, isPremium, precio, CPU, RAM, memoria, resolucionCamaraFrontal, resolucionCamaraBack, porcentajeBateria);
    }

}
