import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alimento extends Producto{
    private String fechaElaboracion;
    private String fechaVencimiento;
    private List<String> ingredientes = new ArrayList<>();

    public Alimento(String nombre, double precio, String codigo, int cantidad, String marca, String fechaElaboracion, String fechaVencimiento, List<String> ingredientes) {
        super(nombre, precio, codigo, cantidad, marca);
        this.fechaElaboracion = fechaElaboracion;
        this.fechaVencimiento = fechaVencimiento;
        this.ingredientes = ingredientes;
    }

    public Alimento(String fechaElaboracion, String fechaVencimiento, List<String> ingredientes) {
        this.fechaElaboracion = fechaElaboracion;
        this.fechaVencimiento = fechaVencimiento;
        this.ingredientes = ingredientes;
    }

    public Alimento() {

    }

    @Override

    public void ingresarProducto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alimento: ");
        this.nombre = sc.next();
        System.out.println("Ingrese el precio del alimento: ");
        this.precio = sc.nextDouble();
        System.out.println("Ingrese el código del alimento: ");
        this.codigo = sc.next();
        System.out.println("Ingrese la cantidad del alimento: ");
        this.cantidad = sc.nextInt();
        System.out.println("Ingrese la fecha de elaboración del alimento: ");
        this.fechaElaboracion = sc.next();
        System.out.println("Ingrese la fecha de vencimiento del alimento: ");
        this.fechaVencimiento = sc.next();
        System.out.println("Ingrese los ingredientes del alimento: ");
        String ingrediente = sc.next();
        this.ingredientes.add(ingrediente);
        System.out.println("Ingrese la marca del alimento: ");
        this.marca = sc.next();
    }
}


