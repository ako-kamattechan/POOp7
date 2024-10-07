package tienda.clientes;

public class Estudiante extends Cliente {
    protected String numeroCuenta;
    protected String nombreUniversidad;

    public Estudiante(String nombre, String apellido, int numCliente, String numeroCuenta, String nombreUniversidad) {
        super(nombre, apellido, numCliente);
        this.numeroCuenta = numeroCuenta;
        this.nombreUniversidad = nombreUniversidad;
        this.descuento=0.10;
    }

    public double getDescuento() {
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
