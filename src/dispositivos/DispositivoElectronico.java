package dispositivos;

public class DispositivoElectronico {
    protected final String marca;
    protected final boolean isPremium;
    protected double precio;

    /**
     * Constructor de la clase DispositivoElectronico
     * @param (marca, isPremium, precio) son los argumentos del constructor
     */

    public DispositivoElectronico(String marca, boolean isPremium, double precio) {
        this.marca = marca;
        this.isPremium = isPremium;
        this.precio = precio;
    }

    /**
     * getters
     */

    protected String getMarca(){return this.marca;}
    protected boolean isPremium(){return this.isPremium;}
    protected double getPrecio(){return this.precio;}

    /**
     * setter to change the price depending on the clients' discount
     */

    protected void setPrecio(double precio){this.precio = precio;}


}
