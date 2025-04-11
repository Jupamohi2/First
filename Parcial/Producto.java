/**
 * Clase abstracta que representa un producto genérico.
 */
public abstract class Producto {
    protected int numero;
    /**
     * Constructor del producto.
     * @param numero Número identificador del producto.
     */
    public Producto(int numero) {
        this.numero = numero;
    }

    /**
     * Método abstracto para mostrar los detalles del producto.
     */
    public abstract void mostrarDetalles();
}
