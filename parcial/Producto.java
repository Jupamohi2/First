public abstract class Producto {
    protected int numero;

    public Producto(int numero) {
        this.numero = numero;
    }

    public abstract void mostrarDetalles();
}
