package tienda.dispositivos;

public class DispositivoElectronico {
    protected final String nombre;
    protected final String marca;
    protected final boolean isPremium;
    protected double precio;

    /**
     * Constructor de la clase DispositivoElectronico
     */

    public DispositivoElectronico(String nombre, String marca, boolean isPremium, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.isPremium = isPremium;
        this.precio = precio;
    }

    /**
     * getters
     */

    public String getMarca(){return this.marca;}
    public boolean isPremium(){return this.isPremium;}
    public double getPrecio(){return this.precio;}
    public String getNombre(){return this.nombre;}

    /**
     * setter to change the price depending on the clients' discount
     */

    public void setPrecio(double precio){this.precio = precio;}


}
