package tienda.clientes;

public class ClienteVip extends Cliente {
    protected int puntos;

    public ClienteVip(String nombre, String apellido, int numCliente) {
        super(nombre, apellido, numCliente);
        this.puntos = 0;
        this.descuento= 0.20;
        this.esVIP = true;
    }

    public double getDescuento() {
        return descuento;
    }

    public int getPuntos() {
        return puntos;
    }

    public void acumularPuntos(int valorCompra) {
        this.puntos += valorCompra / 10;
    }

    public void usarPuntos(int costo) {
        if (costo <= puntos) {
            this.puntos -= costo;
        } else {
            System.out.println("No tienes suficientes puntos.");
        }
    }

    @Override
    public void comprarArticulo(double precio) {
        double precioConDescuento = precio * (1 - this.descuento);
        System.out.println(nombre + " ha comprado un artículo por $" + precioConDescuento + " con descuento VIP.");
        numCompras++;
        System.out.println("Total de compras: " + numCompras);
    }

    @Override
    public String toString() {
        return "Cliente VIP: " + nombre + " " + apellido + " | Puntos: " + puntos;
    }


}
