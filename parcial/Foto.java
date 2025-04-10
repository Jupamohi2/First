public class Foto {
    private String fichero;
    private double tamanoMB;

    public Foto(String fichero) {
        this.fichero = fichero;
        this.tamanoMB = 1 + Math.random() * 9;
        this.tamanoMB = Math.round(tamanoMB * 100.0) / 100.0;
    }

    public String getFichero() {
        return fichero;
    }

    public void print() {
        System.out.println("Foto: " + fichero + " - Tamaño: " + tamanoMB + " MB");
    }

}

