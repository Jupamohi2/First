/**
 * Clase abstracta que representa un producto.
 * Utiliza el patrón Bridge para delegar la implementación a una interfaz.
 */
public abstract class Producto {
    protected ProductoImplementacion implementacion; // Implementación del producto

    /**
     * Constructor que inicializa la implementación del producto.
     * @param implementacion Implementación específica del producto.
     */
    public Producto(ProductoImplementacion implementacion) {
        this.implementacion = implementacion;
    }

    /**
     * Método abstracto para mostrar los detalles del producto.
     */
    public abstract void mostrarDetalles();
}