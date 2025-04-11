import java.util.ArrayList;

/**
 * Representa una impresión compuesta por varios productos (fotos o impresiones).
 */
public class Impresion extends Producto {
    private String tipo;
    private ArrayList<Producto> productos;

    /**
     * Constructor de la clase Impresion.
     * @param numero Número del producto.
     * @param tipo Tipo de impresión (Color, Blanco y Negro, etc.).
     * @param productos Lista de productos a imprimir.
     */
    public Impresion(int numero, String tipo, ArrayList<Producto> productos) {
        super(numero);
        this.tipo = tipo;
        this.productos = productos;
    }

    /**
     * Muestra los detalles de la impresión y de cada producto contenido.
     */
    @Override
    public void mostrarDetalles() {
        System.out.println("Impresion tipo: " + tipo + " (Producto #" + numero + ")");
        for (Producto p : productos) {
            p.mostrarDetalles();
        }
    }
}
