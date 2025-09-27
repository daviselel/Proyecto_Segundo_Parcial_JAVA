package AppleStore;
// Importa las clases necesarias para manejar listas y entrada de datos
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Crea una instancia de CRUDProductos para manejar las operaciones CRUD
        CRUDProductos crud = new CRUDProductos();
        // Crea un objeto Scanner para leer los ingresos de datos en la consola
        Scanner sc = new Scanner(System.in);
        int opcion;

        // Ciclo de repeticion del menu
        do {
            // Menu
            System.out.println("");
            System.out.println("======================================================");
            System.out.println("======== Bienvenido al sistema de Apple Store ========");
            System.out.println("======================================================");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⠀⠀⠀⠀⠀⠀      ");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⡿⠀⠀⠀⠀⠀⠀      ");
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀      ");
            System.out.println("⠀⠀⠀⢀⣠⣤⣤⣤⣀⣀⠈⠋⠉⣁⣠⣤⣤⣤⣀⡀⠀⠀      ");
            System.out.println("⠀⢠⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⡀      ");
            System.out.println("⣠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠋⠀      1. Crear producto");
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⠀⠀⠀      2. Listar productos");
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀      3. Actualizar producto");
            System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀      4. Eliminar producto");
            System.out.println("⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣤⣀      5. Salir");
            System.out.println("⠀⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁");
            System.out.println("⠀⠀⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠁⠀");
            System.out.println("⠀⠀⠀⠈⠙⢿⣿⣿⣿⠿⠟⠛⠻⠿⣿⣿⣿⡿⠋⠀⠀⠀");
            System.out.println("");
            // Solicita al usuario que elija una opción del menú
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpia el buffer del scanner

            // switch para ver la opcion sleccionada del usuario
            switch (opcion) {
                case 1:
                    // Solicita los datos para crear un nuevo producto
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Categoria: ");
                    String categoria = sc.nextLine();
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();
                    System.out.print("Stock: ");
                    int stock = sc.nextInt();
                    sc.nextLine(); // Limpia el buffer
                    // Crea un nuevo producto y lo agrega mediante el CRUD
                    crud.crear(new Producto(id, nombre, categoria, precio, stock));
                    break;

                case 2:
                    // Obtiene la lista de productos y la muestra
                    List<Producto> lista = crud.leer();
                    System.out.println("--- Lista de Productos ---");
                    for (Producto p : lista) {
                        System.out.println(p.getId() + " - " + p.getNombre() + " - " + p.getCategoria() + " - Q" + p.getPrecio() + " - Stock: " + p.getStock());
                    }
                    break;

                case 3:
                    // Solicita los datos para actualizar un producto existente
                    System.out.print("ID del producto a actualizar: ");
                    String idAct = sc.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = sc.nextLine();
                    System.out.print("Nueva categoria: ");
                    String nuevaCat = sc.nextLine();
                    System.out.print("Nuevo precio: ");
                    double nuevoPrecio = sc.nextDouble();
                    System.out.print("Nuevo stock: ");
                    int nuevoStock = sc.nextInt();
                    sc.nextLine(); // Limpia el buffer
                    // Actualiza el producto con los nuevos datos
                    crud.actualizar(idAct, new Producto(idAct, nuevoNombre, nuevaCat, nuevoPrecio, nuevoStock));
                    break;

                case 4:
                    // Solicita el ID del producto que se desea eliminar
                    System.out.print("ID del producto a eliminar: ");
                    String idDel = sc.nextLine();
                    // Elimina el producto correspondiente
                    crud.eliminar(idDel);
                    break;
            }

        } while (opcion != 5); // Repite el menú hasta que el usuario elija salir

        // Cierra el scanner y finaliza el programa
        sc.close();
        System.out.println("Vuelve pronto! ;)");
    }
}