package tienda;

import tienda.clientes.Cliente;
import tienda.clientes.ClienteVip;
import tienda.clientes.Comprador;
import tienda.clientes.Estudiante;
import tienda.dispositivos.DispositivoElectronico;
import tienda.dispositivos.computadora.dispositivoMovil.Celular;
import tienda.dispositivos.computadora.dispositivoMovil.Tablet;
import tienda.dispositivos.computadora.pc.Laptop;
import tienda.dispositivos.computadora.pc.PC;

import java.util.LinkedList;

public class Tienda {
    public final LinkedList<LinkedList<?>> articulos = new LinkedList<>();
    public final LinkedList<LinkedList<?>> clientes = new LinkedList<>();

    public Tienda() {
            articulos.add(new LinkedList<PC>());
            articulos.add(new LinkedList<Laptop>());
            articulos.add(new LinkedList<Tablet>());
            articulos.add(new LinkedList<Celular>());

            clientes.add(new LinkedList<Estudiante>());
            clientes.add(new LinkedList<Comprador>());
            clientes.add(new LinkedList<ClienteVip>());
    }

    /**
     * @param articulo a añadir, utiliza sobrecarga para añadir el artículo a la lista correspondiente
     */

    public void anadirArticuloAInventario(PC articulo) {
        ((LinkedList<PC>)articulos.get(0)).add(articulo);
    }

    public void anadirArticuloAInventario(Laptop articulo) {
        ((LinkedList<Laptop>)articulos.get(1)).add(articulo);
    }

    public void anadirArticuloAInventario(Tablet articulo) {
        ((LinkedList<Tablet>)articulos.get(2)).add(articulo);
    }

    public void anadirArticuloAInventario(Celular articulo) {
        ((LinkedList<Celular>)articulos.get(3)).add(articulo);
    }



    public void anadirCliente(Estudiante cliente) {
        ((LinkedList<Estudiante>)clientes.get(0)).add(cliente);
    }

    public void anadirCliente(Comprador cliente) {
        ((LinkedList<Comprador>)clientes.get(1)).add(cliente);
    }

    public void anadirCliente(ClienteVip cliente) {
        ((LinkedList<ClienteVip>)clientes.get(2)).add(cliente);
    }

}

