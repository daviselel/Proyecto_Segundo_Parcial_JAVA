# Proyecto_Segundo_Parcial_JAVA
Proyecto final segundo parcial sobre CRUD en Java
# Apple Store - Proyecto Java (Consola)

## Descripción
Este proyecto es un sistema CRUD desarrollado en Java que simula la gestión de productos de una **Apple Store**.  
Permite crear, listar, actualizar y eliminar productos, guardando los datos en un archivo plano (`productos.txt`).  
Se implementan los conceptos de **Programación Orientada a Objetos (POO)**: encapsulamiento, herencia, polimorfismo y manejo de archivos.

---

## Tecnologías
- Java 8 o superior
- IntelliJ IDEA (recomendado)
- Consola de comandos
- Archivo plano (`productos.txt`) para persistencia de datos

---

## Estructura del Proyecto
/mi_proyecto/
├── Main.java
├── Producto.java
├── ProductoDerivado.java  (Smartphone, Laptop, Accesorio)
├── Cliente.java
├── ArchivoUtil.java
├── Controlador.java
└── datos.txt

---

## Clases Principales

### Producto.java
Clase base que representa un producto genérico de la tienda.  
- Atributos privados: `id`, `nombre`, `categoria`, `precio`, `stock`.  
- Getters y setters para acceso controlado.  
- Método `toString()` para guardar productos en archivo.

### ProductoDerivado.java
Clases hijas que heredan de `Producto`:
- `Smartphone` → atributo extra: `iosVersion`.  
- `Laptop` → atributo extra: `chip`.  
- `Accesorio` → atributo extra: `compatibilidad`.  
Polimorfismo: sobrescriben `getDetalles()` para mostrar atributos propios.

### Cliente.java
Representa a un cliente de la tienda.  
- Atributos: `id`, `nombre`, `correo`.  
- Método `toString()` para presentación.

### CRUDProductos.java
Clase que maneja todas las operaciones CRUD sobre productos en `productos.txt`.  
- Crear, leer, actualizar y eliminar productos.  

### ArchivoUtil.java
Clase para manejar operaciones con archivos planos:
- Guardar línea, leer todas las líneas y reescribir el archivo.

### Controlador.java
Gestiona la lista de productos en memoria y sincroniza con el archivo.  
- Agregar, listar, buscar, actualizar, eliminar productos.  
- Generar nuevo ID automáticamente.

### Main.java
Menú en consola para interactuar con el usuario:
- Crear, listar, actualizar, eliminar productos.  
- Ciclo principal hasta que el usuario decide salir.

---

## Uso
1. Clonar o descargar el proyecto.
2. Abrir en IntelliJ IDEA.
3. Ejecutar `Main.java`.
4. Interactuar con el menú de consola:

	1.	Agregar producto
	2.	Listar productos
	3.	Actualizar producto
	4.	Eliminar producto
	5.	Salir
  
5. Los cambios se guardan automáticamente en `productos.txt`.

---

## Archivo de prueba
`productos.txt` incluye 3 productos de ejemplo
---

## Funcionalidades
- CRUD completo sobre productos.
- Persistencia de datos en archivo plano.
- Herencia y polimorfismo aplicados en tipos de productos.
- Encapsulamiento con atributos privados y getters/setters.
- Menú interactivo en consola.

---

## Autor
**Brian David Argueta Elel**  
Carnet: 1990-24-16975  
Curso: Programación 2 - Cuarto Semestre
