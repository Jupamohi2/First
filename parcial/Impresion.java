import java.util.ArrayList;

public class Impresion extends Producto {
    private String tipo;
    private ArrayList<Producto> productos; 

    public Impresion(int numero, String tipo, ArrayList<Producto> productos) {
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
