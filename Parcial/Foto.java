/**
 * Representa una fotografía como un tipo de producto.
 */
public class Foto {
    private String fichero;
    private double tamanoMB;
    private int numero;

    /**
     * Constructor de la clase Foto.
     * @param numero Número del producto.
     * @param fichero Nombre del archivo de la foto.
     */
    public Foto(int numero, String fichero) {
        this.numero = numero;
        this.fichero = fichero;
        this.tamanoMB = 1 + Math.random() * 9;
        this.tamanoMB = Math.round(tamanoMB * 100.0) / 100.0;
    }

    /**
     * Muestra los detalles de la fotografía.
     */
    public void mostrarDetalles() {
        System.out.println("Foto: " + fichero + " (Producto #" + numero + ")");
    }
}
