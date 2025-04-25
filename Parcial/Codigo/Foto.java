/**
 * Clase que representa una foto como un producto independiente.
 * Cada foto tiene un fichero asociado, un tamaño en MB y un número identificador.
 */
public class Foto {
    private String fichero; // Nombre del fichero de la foto
    private double tamanoMB; // Tamaño de la foto en megabytes
    private int numero; // Número identificador del producto

    /**
     * Constructor de la clase Foto.
     * Genera un tamaño aleatorio para la foto entre 1 MB y 10 MB.
     * @param numero Número identificador del producto.
     * @param fichero Nombre del fichero de la foto.
     */
    public Foto(int numero, String fichero) {
        this.numero = numero;
        this.fichero = fichero;
        this.tamanoMB = 1 + Math.random() * 9; // Genera un tamaño aleatorio entre 1 y 10 MB
        this.tamanoMB = Math.round(tamanoMB * 100.0) / 100.0; // Redondea a 2 decimales
    }

    /**
     * Muestra los detalles de la foto, incluyendo su nombre y número identificador.
     */
    public void mostrarDetalles() {
        System.out.println("Foto: " + fichero + " (Producto #" + numero + ")");
    }
}