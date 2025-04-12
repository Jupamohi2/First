import java.util.ArrayList;

/**
 * Representa una impresión compuesta por varios productos (fotos o impresiones).
 */
public class Impresion implements Producto {
    private String tipo;
    private ArrayList<Foto> fotos;
    private int numero;

    /**
     * Constructor de la clase Impresion.
     * @param numero Número del producto.
     * @param tipo Tipo de impresión (Color, Blanco y Negro, etc.).
     * @param fotos Lista de fotos a imprimir.
     */
    public Impresion(int numero, String tipo, ArrayList<Foto> fotos) {
        this.numero = numero;
        this.tipo = tipo;
        this.fotos = fotos;
    }

    /**
     * Muestra los detalles de la impresión y de cada producto contenido.
     */
    @Override
    public void mostrarDetalles() {
        System.out.println("Impresion tipo: " + tipo + " (Foto #" + numero + ")");
        for (Foto f : fotos) {
            f.mostrarDetalles();
        }
    }
}
