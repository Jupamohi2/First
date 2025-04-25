import java.util.ArrayList;

/**
 * Clase que implementa la interfaz ProductoImplementacion.
 * Representa una impresión como un producto con detalles específicos.
 */
public class ImpresionImplementacion implements ProductoImplementacion {
    private String tipo; // Tipo de impresión (e.g., color, blanco y negro)
    private int numero; // Número identificador del producto
    private String descripcion; // Descripción de la impresión
    private ArrayList<Foto> fotos; // Lista de fotos incluidas en la impresión

    /**
     * Constructor de la clase ImpresionImplementacion.
     * @param numero Número identificador del producto.
     * @param tipo Tipo de impresión.
     * @param descripcion Descripción de la impresión.
     * @param fotos Lista de fotos incluidas en la impresión.
     */
    public ImpresionImplementacion(int numero, String tipo, String descripcion, ArrayList<Foto> fotos) {
        this.numero = numero;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.fotos = fotos;
    }

    /**
     * Muestra los detalles de la impresión, incluyendo las fotos asociadas.
     */
    @Override
    public void mostrarDetalles() {
        System.out.println("Impresión tipo: " + tipo + " (Producto #" + numero + ") - " + descripcion);
        System.out.println("Fotos: ");
        for (Foto foto : fotos) {
            foto.mostrarDetalles();
        }
    }
}