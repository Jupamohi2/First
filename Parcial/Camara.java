/**
 * Representa una cámara como un tipo de producto.
 */
public class Camara implements Producto {
    private String marca;
    private String modelo;
    private int numero;

    /**
     * Constructor de la clase Camara.
     * @param numero Número del producto.
     * @param marca Marca de la cámara.
     * @param modelo Modelo de la cámara.
     */
    public Camara(int numero, String marca, String modelo) {
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
