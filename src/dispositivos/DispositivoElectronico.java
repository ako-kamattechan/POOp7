package dispositivos;

public class DispositivoElectronico {
    protected final String marca;
    protected final boolean isPremium;

    /**
     * Constructor de la clase DispositivoElectronico
     * @param (marca, isPremium) son los argumentos del constructor
     */

    public DispositivoElectronico(String marca, boolean isPremium) {
        this.marca = marca;
        this.isPremium = isPremium;
    }
}
