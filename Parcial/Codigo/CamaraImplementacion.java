/**
 * Clase que implementa la interfaz ProductoImplementacion.
 * Representa una cámara como un producto con detalles específicos.
 */
public class CamaraImplementacion implements ProductoImplementacion {
    private String marca; // Marca de la cámara
    private String modelo; // Modelo de la cámara
    private int numero; // Número identificador del producto

    /**
     * Constructor de la clase CamaraImplementacion.
     * @param numero Número identificador del producto.
     * @param marca Marca de la cámara.
     * @param modelo Modelo de la cámara.
     */
    public CamaraImplementacion(int numero, String marca, String modelo) {
        this.numero = numero;
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Muestra los detalles de la cámara.
     */
    @Override
    public void mostrarDetalles() {
        System.out.println("Cámara: " + marca + " " + modelo + " (Producto #" + numero + ")");
    }
}