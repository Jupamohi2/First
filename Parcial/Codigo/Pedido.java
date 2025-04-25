import java.util.ArrayList;
import java.util.Date;

/**
 * Clase que representa un pedido realizado por un cliente.
 * Utiliza el patrón Builder para construir pedidos de manera flexible.
 */
public class Pedido {
    private Cliente cliente; // Cliente que realiza el pedido
    private ArrayList<Producto> productos; // Lista de productos en el pedido
    private Date fecha; // Fecha del pedido
    private int numeroTarjetaCredito; // Número de tarjeta de crédito del cliente
    private int numeroPedido; // Número identificador del pedido

    /**
     * Constructor privado para forzar el uso del patrón Builder.
     * @param builder Objeto PedidoBuilder con los datos del pedido.
     * @param numeroPedido Número identificador del pedido.
     */
    private Pedido(PedidoBuilder builder, int numeroPedido) {
        this.numeroPedido = numeroPedido;
        this.cliente = builder.cliente;
        this.productos = builder.productos;
        this.fecha = builder.fecha;
        this.numeroTarjetaCredito = builder.numeroTarjetaCredito;
    }

    /**
     * Muestra los detalles del pedido.
     */
    public void mostrarPedido() {
        System.out.println("===== PEDIDO =====");
        System.out.println("Número de pedido: " + numeroPedido);
        System.out.println("Cliente: " + cliente.getNombre() + " (CI: " + cliente.getCedula() + ")");
        System.out.println("Fecha: " + fecha);
        System.out.println("Tarjeta de crédito: " + numeroTarjetaCredito);
        System.out.println("Productos del pedido:");
        for (Producto p : productos) {
            p.mostrarDetalles();
        }
        System.out.println("=======================");
    }

    /**
     * Clase interna que implementa el patrón Builder para construir pedidos.
     */
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