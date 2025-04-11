public class Foto extends Producto {
    private String fichero;
    private double tamanoMB;

    public Foto(int numero, String fichero) {
        super(numero);
        this.fichero = fichero;
        this.tamanoMB = 1 + Math.random() * 9;
        this.tamanoMB = Math.round(tamanoMB * 100.0) / 100.0;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Foto: " + fichero + " (Producto #" + numero + ")");
    }
}
