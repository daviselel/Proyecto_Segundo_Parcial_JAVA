/*
    Chimaltenango, Septiembre de 2025
    Descipción: Proyecto Segundo Parcial
    Programador: Brian David Argueta Elel
    Carnet: 1990-24-16975
    Programacion 2
 */
package AppleStore;

public class Producto {
    private String id;
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;

    // Constructor
    public Producto(String id, String nombre, String categoria, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    // Getters y setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    // Representación en texto (para guardar en archivo)
    @Override
    public String toString() {
        return id + ", " + nombre + ", " + categoria + ", " + precio + ", " + stock;
    }
}
