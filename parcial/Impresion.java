import java.util.List;

public class Impresion extends Producto {
    private String tipo;
    private List<Producto> productos;  // Fotos o Impresiones

    public Impresion(int numero, String tipo, List<Producto> productos) {
        super(numero);
        this.tipo = tipo;
        this.productos = productos;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Impresion tipo: " + tipo + " (Producto #" + numero + ")");
        for (Producto p : productos) {
            p.mostrarDetalles();
        }
    }
}
