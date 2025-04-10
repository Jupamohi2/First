public class CamaraAntigua {
    private String descripcion;

    public CamaraAntigua(String descripcion) {
        this.descripcion = descripcion;
    }

    public void mostrarInfo() {
        System.out.println("Cámara antigua: " + descripcion);
    }
}
