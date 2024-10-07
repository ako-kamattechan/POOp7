package tienda.clientes;

import tienda.Tienda;

public class Comprador extends Cliente {
    private static final int LIMITE_COMPRAS_VIP = 5;

    public Comprador(String nombre, String apellido, int numCliente) {
        super(nombre, apellido, numCliente);
        this.descuento=0;
    }



    public void convertirAVip(Tienda tienda) {
        ClienteVip nuevoVip = new ClienteVip(this.nombre, this.apellido, this.numCliente);
        nuevoVip.articulosComprados = this.articulosComprados;
        tienda.anadirCliente(nuevoVip);
    }
}
