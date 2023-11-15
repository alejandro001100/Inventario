import java.util.ArrayList;
import java.util.List;

public class Alimento extends Producto{
    private String fechaElaboracion;
    private String fechaVencimiento;
    private List<String> ingredientes = new ArrayList<>();

    public Alimento(String nombre, double precio, String Codigo, int cantidad, String fechaElaboracion, String fechaVencimiento, List<String> ingredientes) {
        super(nombre, precio, Codigo, cantidad);
        this.fechaElaboracion = fechaElaboracion;
        this.fechaVencimiento = fechaVencimiento;
        this.ingredientes = ingredientes;
    }
    @Override
    public void ingresarProducto(){
        super.ingresarProducto();
        System.out.println("Ingrese la fecha de elaboración: ");
        this.fechaElaboracion=sc.next();
        System.out.println("Ingrese la fecha de vencimiento: ");
        this.fechaVencimiento=sc.next();
        System.out.println("Ingrese los ingredientes: ");
        this.ingredientes=sc.next();
    }
    public Alimento(String fechaElaboracion, String fechaVencimiento, List<String> ingredientes) {
        this.fechaElaboracion = fechaElaboracion;
        this.fechaVencimiento = fechaVencimiento;
        this.ingredientes = ingredientes;
    }

    public String getFechaElaboracion() {
        return fechaElaboracion;
    }

    public void setFechaElaboracion(String fechaElaboracion) {
        this.fechaElaboracion = fechaElaboracion;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
