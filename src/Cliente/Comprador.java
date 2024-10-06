public class Comprador extends Cliente {
    private static final int LIMITE_COMPRAS_VIP = 10;

    public Comprador(String nombre, String apellido, int numCliente) {
        super(nombre, apellido, numCliente);
    }

    public void realizarCompra(int valorCompra) {
        this.numCompras++; 
        System.out.println("Compra realizada. Número total de compras: " + numCompras);

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
