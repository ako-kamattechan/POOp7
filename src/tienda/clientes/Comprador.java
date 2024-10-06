package tienda.clientes;

public class Comprador extends Cliente {
    private static final int LIMITE_COMPRAS_VIP = 10;

    public Comprador(String nombre, String apellido, int numCliente) {
        super(nombre, apellido, numCliente);
        this.descuento=0;
    }

    @Override
    public void comprarArticulo(double precio) {
        System.out.println(nombre + " ha comprado un artículo por $" + precio + ".");
        numCompras++;
        System.out.println("Total de compras: " + numCompras);

        if (numCompras >= LIMITE_COMPRAS_VIP) {
            System.out.println(nombre + " ha alcanzado 10 compras y ahora será convertido en Cliente VIP.");
            ClienteVip clienteVip = convertirAVip();
            System.out.println(clienteVip); 
        }
    }

    public ClienteVip convertirAVip() {
        ClienteVip nuevoVip = new ClienteVip(this.nombre, this.apellido, this.numCliente);
        return nuevoVip;
    }


}
