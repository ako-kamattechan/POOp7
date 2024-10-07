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
    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        tienda.anadirArticuloAInventario(new PC("PC Gamer ultra pro", "PCgamer", false, 2500, "AMD Ryzen 5", 12, 2048, "RTX 3080"));
        tienda.anadirArticuloAInventario(new Laptop("Thinkpad", "Lenovo", false, 1500, "AMD Ryzen 5", 16, 1024, 56));
        tienda.anadirArticuloAInventario(new Laptop("Laptops gamer", "Asus", true, 3000, "AMD Ryzen 7", 32, 1024, 86));
        tienda.anadirArticuloAInventario(new Tablet("Ipad pro", "Apple", false, 3500, "Snapdragon 7", 12, 512, 50, 100, 88));
        tienda.anadirArticuloAInventario(new Celular("Galaxy note 20", "Samsung", false, 1900, "Snapdragon 5", 8, 256, 30, 80, 45, "5533556622"));
        tienda.anadirArticuloAInventario(new PC("PC Gamer Xtreme", "Alienware", true, 4500, "Intel Core i9", 32, 2048, "NVIDIA RTX 4090"));
        tienda.anadirArticuloAInventario(new PC("PC Oficina Pro", "HP", false, 1200, "Intel Core i5", 16, 1024, "Intel UHD Graphics"));
        tienda.anadirArticuloAInventario(new Laptop("Laptop Ultraligera", "Dell", false, 1100, "Intel Core i7", 16, 512, 60));
        tienda.anadirArticuloAInventario(new Laptop("Laptop Gaming", "Asus", true, 2800, "AMD Ryzen 9", 32, 2048, 80));
        tienda.anadirArticuloAInventario(new Laptop("Laptop Profesional", "Lenovo", false, 1400, "Intel Core i5", 8, 1024, 50));
        tienda.anadirArticuloAInventario(new Tablet("Tablet Pro", "Apple", true, 1500, "A14 Bionic", 8, 256, 100, 90, 120));
        tienda.anadirArticuloAInventario(new Tablet("Tablet Básica", "Samsung", false, 350, "Snapdragon 625", 4, 64, 30, 50, 80));
        tienda.anadirArticuloAInventario(new Tablet("Tablet Compacta", "Huawei", false, 200, "Kirin 710", 3, 32, 20, 40, 60));
        tienda.anadirArticuloAInventario(new Celular("Galaxy S21", "Samsung", true, 1000, "Snapdragon 888", 12, 256, 50, 100, 85, "5599887766"));
        tienda.anadirArticuloAInventario(new Celular("iPhone 13", "Apple", true, 1200, "A15 Bionic", 8, 256, 70, 90, 100, "5599223344"));
        tienda.anadirArticuloAInventario(new Celular("Nokia 3310", "Nokia", false, 50, "Snapdragon 200", 1, 8, 10, 20, 30, "5511223344"));
        tienda.anadirArticuloAInventario(new Celular("Pixel 5", "Google", false, 800, "Snapdragon 765G", 6, 128, 60, 90, 75, "5512345678"));
        tienda.anadirArticuloAInventario(new PC("PC Estudio", "Acer", false, 800, "Intel Core i3", 8, 512, "Intel Integrated Graphics"));
        tienda.anadirArticuloAInventario(new Laptop("Laptop Estudiante", "HP", false, 900, "AMD Ryzen 5", 8, 512, 55));
        tienda.anadirArticuloAInventario(new Tablet("Tablet para niños", "Lenovo", false, 150, "Mediatek Helio", 2, 16, 15, 20, 40));
        tienda.anadirArticuloAInventario(new PC("PC de Edición", "MSI", true, 3200, "Intel Core i7", 32, 2048, "NVIDIA RTX 3080"));
        tienda.anadirArticuloAInventario(new Celular("Xiaomi Mi 11", "Xiaomi", false, 600, "Snapdragon 870", 8, 128, 40, 70, 65, "5533445566"));
        tienda.anadirArticuloAInventario(new PC("PC Multimedia", "LG", false, 750, "Intel Core i5", 16, 1024, "Intel UHD Graphics"));
        tienda.anadirArticuloAInventario(new Laptop("Laptop de Negocios", "Apple", true, 2200, "M1", 16, 1024, 75));
        tienda.anadirArticuloAInventario(new Tablet("Tablet de Dibujante", "Wacom", true, 900, "Snapdragon 732G", 4, 64, 80, 70, 110));

        ingresarSesion(tienda);



    }

    private static void ingresarSesion(Tienda tienda) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tipo de cliente que es: ");
        System.out.println("1.- Comprador");
        System.out.println("2.- Estudiante");
        System.out.println("3.- ClienteVip");
        


        while(true) {
            switch (sc.nextInt()) {
                case 1:
                    menuRegular(tienda, sc);
                    return;
                case 2:
                    menuEstudiante(tienda, sc);
                    return;
                case 3:
                    menuClienteVip(tienda, sc);
                    return;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }


    private static void menuRegular(Tienda tienda, Scanner sc) {
        System.out.println("Bienvenido al menú de Comprador Regular");
        System.out.println("En la compra de 5 artículos te volverás cliente vip");
        sc.nextLine();

        System.out.println("Ingresa tu nombre completo: ");
        String nombre=sc.nextLine();
        System.out.println("Ingresa tu apellido: ");
        String ap = sc.nextLine();
        sc.nextLine();
        System.out.println("Ingrese su número de cliente: ");
        int numCliente =sc.nextInt();

        Comprador regular = new Comprador(nombre, ap, numCliente);
        tienda.anadirCliente(regular);
        mostrarMenuCompras(tienda, regular, sc);
        
    }

    private static void menuEstudiante(Tienda tienda, Scanner sc) {
        System.out.println("Bienvenido al menú de Estudiante");
        System.out.println("Cuentas con un 10% de descuento");
        sc.nextLine();

        System.out.println("Ingresa tu nombre completo: ");
        String nombre=sc.nextLine();
        System.out.println("Ingresa tu apellido: ");
        String ap = sc.nextLine();
        sc.nextLine();
        System.out.println("Ingrese su número de cliente: ");
        int numCliente =sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese su escuela: ");
        String esc=sc.nextLine();

        Estudiante estudiante = new Estudiante(nombre, ap, numCliente, "3210", esc);
        tienda.anadirCliente(estudiante);
        mostrarMenuCompras(tienda, estudiante, sc);
    }

    private static void menuClienteVip(Tienda tienda, Scanner sc) {
        System.out.println("Bienvenido al menú de Cliente VIP");
        System.out.println("Cuentas con acceso a productos premium y 20% de descuento");
        sc.nextLine();

        System.out.println("Ingresa tu nombre completo: ");
        String nombre=sc.nextLine();
        System.out.println("Ingresa tu apellido: ");
        String ap = sc.nextLine();
        sc.nextLine();
        System.out.println("Ingrese su número de cliente: ");
        int numCliente =sc.nextInt();

        ClienteVip vip = new ClienteVip(nombre, ap, numCliente);
        tienda.anadirCliente(vip);
        mostrarMenuCompras(tienda, vip, sc);
    }

    private static void mostrarMenuCompras(Tienda tienda, ClienteVip cliente, Scanner sc) {
        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1.- Ver inventario");
            System.out.println("2.- Comprar un artículo");
            System.out.println("3. Agregar un artículo al carrito");
            System.out.println("4.- Ver carrito");
            System.out.println("5. Vaciar carrito");
            System.out.println("6.- Salir");

            String auxString;
            int indiceArticulo;

            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    tienda.imprimirInventario();;
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Ingrese qué clase de artículo quieres comprar:");
                    auxString = sc.nextLine();
                    System.out.println("Ingrese el índice del artículo que desea comprar:");
                    indiceArticulo = sc.nextInt();
                    cliente.comprarArticulo(tienda, cliente, indiceArticulo, auxString);
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Ingrese qué clase de artículo quiere agregar al carrito:");
                    auxString = sc.nextLine();
                    System.out.println("Ingrese el índice del artículo que desea agregar al carrito:");
                    indiceArticulo = sc.nextInt();
                    cliente.agregarAlCarrito(tienda, cliente, indiceArticulo, auxString);
                    break;
                case 4:
                    cliente.mostrarCarrito();
                    break;
                case 5:
                    cliente.vaciarCarrito();
                    break;
                case 6:
                    System.out.println("Gracias por su visita. Hasta luego.");
                    return;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        }
    }

    private static void mostrarMenuCompras(Tienda tienda, Estudiante cliente, Scanner sc) {
        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1.- Ver inventario");
            System.out.println("2.- Comprar un artículo");
            System.out.println("3. Agregar un artículo al carrito");
            System.out.println("4.- Ver carrito");
            System.out.println("5. Vaciar carrito");
            System.out.println("6.- Salir");

            String auxString;
            int indiceArticulo;

            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    tienda.imprimirInventario();;
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Ingrese qué clase de artículo quieres comprar:");
                    auxString = sc.nextLine();
                    System.out.println("Ingrese el índice del artículo que desea comprar:");
                    indiceArticulo = sc.nextInt();
                    cliente.comprarArticulo(tienda, cliente, indiceArticulo, auxString);
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Ingrese qué clase de artículo quiere agregar al carrito:");
                    auxString = sc.nextLine();
                    System.out.println("Ingrese el índice del artículo que desea agregar al carrito:");
                    indiceArticulo = sc.nextInt();
                    cliente.agregarAlCarrito(tienda, cliente, indiceArticulo, auxString);
                    break;
                case 4:
                    cliente.mostrarCarrito();
                    break;
                case 5:
                    cliente.vaciarCarrito();
                    break;
                case 6:
                    System.out.println("Gracias por su visita. Hasta luego.");
                    return;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        }
    }

    private static void mostrarMenuCompras(Tienda tienda, Comprador cliente, Scanner sc) {
        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1.- Ver inventario");
            System.out.println("2.- Comprar un artículo");
            System.out.println("3. Agregar un artículo al carrito");
            System.out.println("4.- Ver carrito");
            System.out.println("5. Vaciar carrito");
            System.out.println("6.- Salir");

            String auxString;
            int indiceArticulo;

            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    tienda.imprimirInventario();;
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Ingrese qué clase de artículo quieres comprar:");
                    auxString = sc.nextLine();
                    System.out.println("Ingrese el índice del artículo que desea comprar:");
                    indiceArticulo = sc.nextInt();
                    cliente.comprarArticulo(tienda, cliente, indiceArticulo, auxString);
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Ingrese qué clase de artículo quiere agregar al carrito:");
                    auxString = sc.nextLine();
                    System.out.println("Ingrese el índice del artículo que desea agregar al carrito:");
                    indiceArticulo = sc.nextInt();
                    cliente.agregarAlCarrito(tienda, cliente, indiceArticulo, auxString);
                    break;
                case 4:
                    cliente.mostrarCarrito();
                    break;
                case 5:
                    cliente.vaciarCarrito();
                    break;
                case 6:
                    System.out.println("Gracias por su visita. Hasta luego.");
                    return;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        }
    }

}

