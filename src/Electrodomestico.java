import java.util.Scanner;

public class Electrodomestico extends Producto{
    private int vidaUtilaños;
    private String sitioFabricacion;
    private double voltajeAlimentacion;
    private String garantia;

    public Electrodomestico(String nombre, double precio, String Codigo, int cantidad, int vidaUtilaños, String sitioFabricacion, double voltajeAlimentacion, String garantia) {
        super(nombre, precio, Codigo, cantidad);
        this.vidaUtilaños = vidaUtilaños;
        this.sitioFabricacion = sitioFabricacion;
        this.voltajeAlimentacion = voltajeAlimentacion;
        this.garantia = garantia;
    }

    public Electrodomestico(){

    }

    public double intervaloMantenimiento() {
        double intervalo = vidaUtilaños / 5;
        return intervalo;
    }
    @Override
    public String toString() {
        return "El electrodomestico" + this.nombre + "es de marca:" + this.marca;
    }

    public int getVidaUtilaños() {
        return vidaUtilaños;
    }

    public void setVidaUtilaños(int vidaUtilaños) {
        this.vidaUtilaños = vidaUtilaños;
    }

    public String getSitioFabricacion() {
        return sitioFabricacion;
    }

    public void setSitioFabricacion(String sitioFabricacion) {
        this.sitioFabricacion = sitioFabricacion;
    }

    public double getVoltajeAlimentacion() {
        return voltajeAlimentacion;
    }

    public void setVoltajeAlimentacion(double voltajeAlimentacion) {
        this.voltajeAlimentacion = voltajeAlimentacion;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }
    @Override
    public void ingresarProducto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto: ");
        this.nombre = sc.next();
        System.out.println("Ingrese el precio del producto: ");
        this.precio = sc.nextDouble();
        System.out.println("Ingrese el código del producto: ");
        this.Codigo = sc.next();
        System.out.println("Ingrese la cantidad del producto: ");
        this.cantidad = sc.nextInt();
        System.out.println("Ingrese la vida útil del producto: ");
        this.vidaUtilaños = sc.nextInt();
        System.out.println("Ingrese el sitio de fabricación del producto: ");
        this.sitioFabricacion = sc.next();
        System.out.println("Ingrese el voltaje de alimentación del producto: ");
        this.voltajeAlimentacion = sc.nextDouble();
        System.out.println("Ingrese la garantía del producto: ");
        this.garantia = sc.next();
        System.out.println("Ingrese la marca del producto: ");
        this.marca = sc.next();

    }

}
