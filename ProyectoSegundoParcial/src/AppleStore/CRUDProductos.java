/*
    Chimaltenango, Septiembre de 2025
    Descipción: Proyecto Segundo Parcial
    Programador: Brian David Argueta Elel
    Carnet: 1990-24-16975
    Programacion 2
 */
package AppleStore;
import java.io.*;
import java.util.*;

public class CRUDProductos {
    // Constante que almacena el nombre del archivo donde se guardan los productos
    private static final String FILE_NAME = "productos.txt";

    // Crear (agregar producto)
    public void crear(Producto producto) {
        // Abre el archivo en modo append para agregar un nuevo producto al final
        // Escribe la representación en texto del producto y maneja posibles excepciones
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            bw.write(producto.toString());
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Leer (listar productos)
    public List<Producto> leer() {
        List<Producto> lista = new ArrayList<>();
        // Abre el archivo, lee cada línea, separa los datos por coma y reconstruye objetos Producto
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 5) {
                    lista.add(new Producto(datos[0], datos[1], datos[2], Double.parseDouble(datos[3]), Integer.parseInt(datos[4])));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }

    // Actualizar (producto por ID)
    public void actualizar(String id, Producto nuevoProducto) {
        // Reescribe el archivo, reemplazando el producto cuyo ID coincide con el nuevo
        List<Producto> lista = leer();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Producto p : lista) {
                if (p.getId().equals(id)) {
                    bw.write(nuevoProducto.toString());
                } else {
                    bw.write(p.toString());
                }
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Eliminar (producto por ID)
    public void eliminar(String id) {
        // Reescribe el archivo excluyendo el producto con el ID indicado
        List<Producto> lista = leer();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Producto p : lista) {
                if (!p.getId().equals(id)) {
                    bw.write(p.toString());
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
