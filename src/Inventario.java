import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
    public void gestionarInventario() {

        Producto[] inventario = new Producto[10]; // Arreglo de 10 productos
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int contador = 0;
        while (opcion != 3) {
            System.out.println("Bienvenido al inventario de productos");
            System.out.println("1. Ingresar producto");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Salir");
            System.out.println("Ingrese la opción que desea realizar: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    if (contador >= inventario.length) {
                        System.out.println("Inventario lleno, no se pueden agregar más productos.");
                        break;
                    }
                    System.out.println("Ingrese el tipo de producto que desea ingresar: ");
                    System.out.println("1. Electrodoméstico");
                    System.out.println("2. Tecnología");
                    System.out.println("3. Alimento");
                    int opcion2 = sc.nextInt();
                    switch (opcion2) {
                        case 1:
                            Electrodomestico electrodomestico = new Electrodomestico();
                            electrodomestico.ingresarProducto();
                            inventario[contador] = electrodomestico;
                            contador++;
                            break;
                        case 2:
                            Tecnologia tecnologia = new Tecnologia();
                            tecnologia.ingresarProducto();
                            inventario[contador] = tecnologia;
                            contador++;
                            break;
                        case 3:
                            Alimento alimento = new Alimento();
                            alimento.ingresarProducto();
                            inventario[contador] = alimento;
                            contador++;
                            break;
                        default:
                            System.out.println("Opción no válida");
                            break;
                    }
                    break;
                case 2:
                    for (int i = 0; i < inventario.length; i++) {
                        if (inventario[i] != null) {
                            System.out.println(inventario[i].toString());
                        }
                    }
                    break;

                case 3:
                    System.out.println("Gracias por usar el inventario");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
        sc.close();
    }
}