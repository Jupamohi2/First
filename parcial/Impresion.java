import java.util.List;

public class Impresion extends Producto {
    private String tipo;
    private List<Foto> fotos;

    public Impresion(int numero, String tipo, List<Foto> fotos) {
        super(numero);
        this.tipo = tipo;
        this.fotos = fotos;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Impresión tipo: " + tipo + " (Producto #" + numero + ")");
        for (Foto foto : fotos) {
            System.out.println("  - Foto: " + foto.getFichero());
        }
    }
}
