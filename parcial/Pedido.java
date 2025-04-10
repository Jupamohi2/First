import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private Cliente cliente;
    private ArrayList<Producto> productos;
    private Date fecha;
    private int numeroTarjetaCredito;

    // Constructor privado: el único modo de crear un Pedido es a través del Builder
    private Pedido(PedidoBuilder builder) {
        this.cliente = builder.cliente;
        this.productos = builder.productos;
        this.fecha = builder.fecha;
        this.numeroTarjetaCredito = builder.numeroTarjetaCredito;
    }

    public void mostrarPedido() {
        System.out.println("Pedido del cliente: " + cliente.getNombre());
        System.out.println("Fecha: " + fecha);
        for (Producto p : productos) {
            p.mostrarDetalles(); // Polimorfismo
        }
    }

    // Clase interna static Builder
    public static class PedidoBuilder {
        private Cliente cliente;
        private ArrayList<Producto> productos = new ArrayList<>();
        private Date fecha;
        private int numeroTarjetaCredito;

        public PedidoBuilder setCliente(Cliente cliente) {
            this.cliente = cliente;
            return this;
        }

        public PedidoBuilder addProducto(Producto producto) {
            this.productos.add(producto);
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

        public Pedido build() {
            // Aquí podrías incluir validaciones antes de construir el Pedido
            return new Pedido(this);
        }
    }
}
