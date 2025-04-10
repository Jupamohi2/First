import java.util.ArrayList;

public class Impresion extends Producto {
    private String color;
    private ArrayList<Foto> fotos;

    public Impresion(int numero, String color, ArrayList<Foto> fotos) {
        super(numero);
        this.color = color;
        this.fotos = fotos;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Impresión en color " + color);
        for (Foto f : fotos) {
            f.print();
        }
    }
}
