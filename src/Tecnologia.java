import java.util.Scanner;

public class Tecnologia extends Producto {
    private int vidaUtilaños;
    private String sitioFabricacion;
    private double voltajeAlimentacion;
    private String garantia;
    private String color;
    private String tipo;
    private String modelo;

    public Tecnologia(String nombre, double precio, String codigo, int cantidad, String marca, int vidaUtilaños, String sitioFabricacion, double voltajeAlimentacion, String garantia, String color, String tipo, String modelo) {
        super(nombre, precio, codigo, cantidad, marca);
        this.vidaUtilaños = vidaUtilaños;
        this.sitioFabricacion = sitioFabricacion;
        this.voltajeAlimentacion = voltajeAlimentacion;
        this.garantia = garantia;
        this.color = color;
        this.tipo = tipo;
        this.modelo = modelo;
    }

    public Tecnologia(int vidaUtilaños, String sitioFabricacion, double voltajeAlimentacion, String garantia, String color, String tipo, String modelo) {
        this.vidaUtilaños = vidaUtilaños;
        this.sitioFabricacion = sitioFabricacion;
        this.voltajeAlimentacion = voltajeAlimentacion;
        this.garantia = garantia;
        this.color = color;
        this.tipo = tipo;
        this.modelo = modelo;
    }

    public Tecnologia() {

    }

    public double intervaloMantenimiento() {
        double intervalo = vidaUtilaños / 5;
        return intervalo;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String toString(){
        return "El producto " + this.nombre + " es de marca: " + this.marca;
    }

    @Override
    public void ingresarProducto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto: ");
        this.nombre = sc.next();
        System.out.println("Ingrese el precio del producto: ");
        this.precio = sc.nextDouble();
        System.out.println("Ingrese el código del producto: ");
        this.codigo = sc.next();
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
        System.out.println("Ingrese el tipo del producto: ");
        this.tipo = sc.next();
        System.out.println("Ingrese el modelo del producto: ");
        this.modelo = sc.next();
        System.out.println("Ingrese la marca del producto: ");
        this.marca = sc.next();
    }
}
