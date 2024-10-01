package dispositivos;

public class DispositivoElectronico {
    protected String marca;
    protected boolean isPremium;

    /**
     * Constructor de la clase DispositivoElectronico
     * @param (marca, isPremium) argumentos del constructor
     */

    public DispositivoElectronico(String marca, boolean isPremium) {
        this.marca = marca;
        this.isPremium = isPremium;
    }

    /**
     * Getters de la clase DispositivoElectronico
     * @return el retorno es el atributo correspondiente
     */

    protected String getMarca() {
        return this.marca;
    }
    protected boolean getIsPremium() {
        return this.isPremium;
    }

    /**
     * Setters de la clase DispositivoElectronico
     * @param (marca, isPremium) atributo que se desea modificar
     */

    protected void setMarca(String marca) {
        this.marca = marca;
    }

    protected void setIsPremium(boolean isPremium) {
        this.isPremium = isPremium;
    }


}
