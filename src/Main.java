import tienda.Tienda;
import tienda.clientes.Cliente;
import tienda.clientes.ClienteVip;
import tienda.clientes.Comprador;
import tienda.clientes.Estudiante;
import tienda.dispositivos.computadora.dispositivoMovil.Celular;
import tienda.dispositivos.computadora.dispositivoMovil.Tablet;
import tienda.dispositivos.computadora.pc.Laptop;
import tienda.dispositivos.computadora.pc.PC;

import java.util.Scanner;

public class Main {
    public static Tienda tienda = new Tienda();

    public static void main(String[] args) {

        tienda.anadirArticuloAInventario(new PC("PC Gamer ultra pro", "PCgamer", false, 2500, "AMD Ryzen 5", 12, 2048, "RTX 3080"));
        tienda.anadirArticuloAInventario(new Laptop("Thinkpad", "Lenovo", false, 1500, "AMD Ryzen 5", 16, 1024, 56));
        tienda.anadirArticuloAInventario(new Laptop("Laptops gamer", "Asus", true, 3000, "AMD Ryzen 7", 32, 1024, 86));
        tienda.anadirArticuloAInventario(new Tablet("Ipad pro", "Apple", false, 3500, "Snapdragon 7", 12, 512, 50, 100, 88));
        tienda.anadirArticuloAInventario(new Celular("Galaxy note 20", "Samsung", false, 1900, "Snapdragon 5", 8, 256, 30, 80, 45, "5533556622"));

        tienda.anadirCliente(new Comprador("Geraldo", "Duarte", 1234));
        tienda.anadirCliente(new Estudiante("Quintín", "Contreras", 1111, "3333", "Universidad real"));
        tienda.anadirCliente(new ClienteVip("Ildefonso", "Olmos", 2222));



        ingresarSesion();

    }

    private static void ingresarSesion() {
        System.out.println("Ingrese el tipo de cliente que es: ");
        System.out.println("1.- Comprador");
        System.out.println("2.- Estudiante");
        System.out.println("3.- ClienteVip");
        Scanner sc = new Scanner(System.in);

        Comprador compradorAux;
        ClienteVip clienteVipAux;
        Estudiante estudianteAux;

        estudianteAux = (Estudiante)tienda.clientes.get(0).get(0);

        compradorAux = (Comprador)tienda.clientes.get(1).get(0);

        clienteVipAux = (ClienteVip) tienda.clientes.get(2).get(0);


        while(true) {
            switch (sc.nextInt()) {
                case 1:
                    menu(compradorAux);
                    return;
                case 2:
                    menu(estudianteAux);
                    return;
                case 3:
                    menu(clienteVipAux);
                    return;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }

//    private static void ingresarSesion(Tienda tienda) {
//        System.out.println("Ingrese su número de cliente");
//        Scanner sc = new Scanner(System.in);
//
//        int numClienteAux = sc.nextInt();
//
//        Comprador compradorAux;
//        ClienteVip clienteVipAux;
//        Estudiante estudianteAux;
//
//
//        for(int i = 0; i < tienda.clientes.get(0).size(); i++){
//            estudianteAux = (Estudiante)tienda.clientes.get(0).get(i);
//            if(estudianteAux.getNumCliente() == numClienteAux){
//                menu(estudianteAux);
//                return;
//            }
//        }
//
//        for(int i = 0; i < tienda.clientes.get(1).size(); i++){
//            compradorAux = (Comprador)tienda.clientes.get(1).get(i);
//            if(compradorAux.getNumCliente() == numClienteAux){
//                menu(compradorAux);
//                return;
//            }
//        }
//
//        for(int i = 0; i < tienda.clientes.get(2).size(); i++){
//            clienteVipAux = (ClienteVip) tienda.clientes.get(2).get(i);
//            if(clienteVipAux.getNumCliente() == numClienteAux){
//                menu(clienteVipAux);
//                return;
//            }
//        }
//
//        System.out.println("No se ha encontrado el cliente");
//
//    }

    private static void menu(ClienteVip cliente) {
        System.out.println("Bienvenido al sistema");
        Scanner sc = new Scanner(System.in);

        System.out.println("1.- Imprimir inventario");
        switch (sc.nextInt()) {
            case 1->{tienda.imprimirInventario();}
        }

    }

    private static void menu(Estudiante cliente) {
        System.out.println("Bienvenido al sistema");
        Scanner sc = new Scanner(System.in);

        System.out.println("1.- Imprimir inventario");
        switch (sc.nextInt()) {
            case 1->{tienda.imprimirInventario();}
        }
    }

    private static void menu(Comprador cliente) {
        System.out.println("Bienvenido al sistema");
        Scanner sc = new Scanner(System.in);

        System.out.println("1.- Imprimir inventario");
        switch (sc.nextInt()) {
            case 1->{tienda.imprimirInventario();}
        }
    }

}