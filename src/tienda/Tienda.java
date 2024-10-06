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

    public void imprimirInventario(){
        PC pcAux;
        Laptop laptopAux;
        Tablet tabletAux;
        Celular celularAux;

        System.out.println("*********************************");
        System.out.println("Inventario");
        System.out.println("*********************************");

        System.out.println("PCs");
        for(int i =0; i< articulos.get(0).size(); i++){
            System.out.println();
            System.out.println("PC #"+(i+1));

            pcAux = (PC)this.articulos.get(0).get(i);
            System.out.println("Nombre: "+ pcAux.getNombre());
            System.out.println("Marca: "+ pcAux.getMarca());
            System.out.println("Precio: "+ pcAux.getPrecio());
            System.out.println("CPU: "+ pcAux.getCPU());
            System.out.println("RAM: "+ pcAux.getRAM());
            System.out.println("Memoria: "+ pcAux.getMemoria());
            System.out.println("Tarjeta gráfica: "+ pcAux.getTarjetaGrafica());
        }
        System.out.println();

        System.out.println("Laptops");
        for(int i =0; i< articulos.get(1).size(); i++){
            System.out.println();
            System.out.println("Laptop #"+(i+1));

            laptopAux = (Laptop)this.articulos.get(1).get(i);
            System.out.println("Nombre: "+ laptopAux.getNombre());
            System.out.println("Marca: "+ laptopAux.getMarca());
            System.out.println("Precio: "+ laptopAux.getPrecio());
            System.out.println("CPU: "+ laptopAux.getCPU());
            System.out.println("RAM: "+ laptopAux.getRAM());
            System.out.println("Memoria: "+ laptopAux.getMemoria());
            System.out.println("Tarjeta gráfica: "+ laptopAux.getPorcentajeBateria());
        }
        System.out.println();

        System.out.println("Tablets");
        for(int i =0; i< articulos.get(2).size(); i++){
            System.out.println();
            System.out.println("Tablet #"+(i+1));

            tabletAux = (Tablet) this.articulos.get(2).get(i);
            System.out.println("Nombre: "+tabletAux.getNombre());
            System.out.println("Marca: "+ tabletAux.getMarca());
            System.out.println("Precio: "+ tabletAux.getPrecio());
            System.out.println("CPU: "+ tabletAux.getCPU());
            System.out.println("RAM: "+ tabletAux.getRAM());
            System.out.println("Memoria: "+ tabletAux.getMemoria());
            System.out.println("Tarjeta gráfica: "+ tabletAux.getPorcentajeBateria());
            System.out.println("Resolución de la cámara frontal: "+ tabletAux.getResolucionCamaraFrontal());
            System.out.println("Resolución de la cámara trasera: "+ tabletAux.getResolucionCamaraBack());

        }
        System.out.println();

        System.out.println("Celulares");
        for(int i =0; i< articulos.get(3).size(); i++){
            System.out.println();
            System.out.println("Celular #"+(i+1));

            celularAux = (Celular) this.articulos.get(3).get(i);
            System.out.println("Nombre: "+celularAux.getNombre());
            System.out.println("Marca: "+ celularAux.getMarca());
            System.out.println("Precio: "+ celularAux.getPrecio());
            System.out.println("CPU: "+ celularAux.getCPU());
            System.out.println("RAM: "+ celularAux.getRAM());
            System.out.println("Memoria: "+ celularAux.getMemoria());
            System.out.println("Tarjeta gráfica: "+ celularAux.getPorcentajeBateria());
            System.out.println("Resolución de la cámara frontal: "+ celularAux.getResolucionCamaraFrontal());
            System.out.println("Resolución de la cámara trasera: "+ celularAux.getResolucionCamaraBack());
            System.out.println("Número: "+ celularAux.getNumCelular());
        }
        System.out.println();


    }


}

