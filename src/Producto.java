import java.util.Scanner;

public class Producto {
    public String nombre;
    public double precio;
    public String Codigo;
    public int cantidad;
    public String Marca;
    public String marca;

    public Producto(String nombre, double precio, String Codigo, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.Codigo = Codigo;
        this.cantidad = cantidad;
    }

    public Producto() {

    }

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
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getMarca() {

        return Marca;
    }

    public String toString() {
        return "El producto " + this.nombre + " es de marca: " + this.marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}



