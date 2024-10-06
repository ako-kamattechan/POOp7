public class Estudiante extends Cliente {
    private int descuento = 10; 
    protected String numeroCuenta;
    protected String nombreUniversidad;

    public Estudiante(String nombre, String apellido, int numCliente, String numeroCuenta, String nombreUniversidad) {
        super(nombre, apellido, numCliente);
        this.numeroCuenta = numeroCuenta;
        this.nombreUniversidad = nombreUniversidad;
    }

    public int getDescuento() {
        return descuento;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreUniversidad() {
        return nombreUniversidad;
    }

    public void setNombreUniversidad(String nombreUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
    }
}
