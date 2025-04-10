import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido extends Producto {
    private Cliente cliente;
    private List<Producto> productos;
    private Date fecha;
    private int numeroTarjetaCredito;

    private Pedido(PedidoBuilder builder, int numero) {
        super(numero);
        this.cliente = builder.cliente;
        this.productos = builder.productos;
        this.fecha = builder.fecha;
        this.numeroTarjetaCredito = builder.numeroTarjetaCredito;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("===== PEDIDO =====");
        System.out.println("Cliente: " + cliente.getNombre() + " (CI: " + cliente.getCedula() + ")");
        System.out.println("Fecha: " + fecha);
        System.out.println("Tarjeta de crédito: " + numeroTarjetaCredito);
        System.out.println("Productos del pedido:");
        for (Producto p : productos) {
            p.mostrarDetalles(); // Polimorfismo + Composite
        }
        System.out.println("=======================");
    }

    public static class PedidoBuilder {
        private Cliente cliente;
        private List<Producto> productos = new ArrayList<>();
        private Date fecha;
        private int numeroTarjetaCredito;

        public PedidoBuilder setCliente(Cliente cliente) {
            this.cliente = cliente;
            return this;
        }

        public PedidoBuilder addProducto(Producto producto) {
            productos.add(producto);
            return this;
        }

        public PedidoBuilder setFecha(Date fecha) {
            this.fecha = fecha;
            return this;
        }

        public PedidoBuilder setNumeroTarjetaCredito(int numero) {
            this.numeroTarjetaCredito = numero;
            return this;
        }

        public Pedido build(int numero) {
            return new Pedido(this, numero);
        }
    }
}
