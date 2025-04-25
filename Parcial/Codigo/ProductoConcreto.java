/**
 * Clase concreta que extiende la clase abstracta Producto.
 * Utiliza una implementación específica para mostrar los detalles del producto y asi aplicar el Bridge.
 */
public class ProductoConcreto extends Producto {

    /**
     * Constructor que inicializa la implementación del producto.
     * @param implementacion Implementación específica del producto.
     */
    public ProductoConcreto(ProductoImplementacion implementacion) {
        super(implementacion);
    }

    /**
     * Muestra los detalles del producto utilizando su implementación.
     */
    @Override
    public void mostrarDetalles() {
        implementacion.mostrarDetalles();
    }
}