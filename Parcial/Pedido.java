import java.util.ArrayList;
import java.util.Date;

/**
 * Representa un pedido realizado por un cliente.
 * Contiene una lista de productos, fecha y número de tarjeta.
 */
public class Pedido {
    private Cliente cliente;
    private ArrayList<Producto> productos;
    private Date fecha;
    private int numeroTarjetaCredito;
    private int numeroPedido;

    /**
     * Constructor privado que recibe un builder para construir el pedido.
     * @param builder Instancia del builder con los datos del pedido.
     * @param numeroPedido Número del pedido.
     */
    private Pedido(PedidoBuilder builder, int numeroPedido) {
        this.numeroPedido = numeroPedido;
        this.cliente = builder.cliente;
        this.productos = builder.productos;
        this.fecha = builder.fecha;
        this.numeroTarjetaCredito = builder.numeroTarjetaCredito;
    }

    /**
     * Muestra los detalles del pedido, incluyendo cliente y productos.
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
     * Builder para construir objetos Pedido paso a paso.
     */
    public static class PedidoBuilder {
        private Cliente cliente;
        private ArrayList<Producto> productos = new ArrayList<>();
        private Date fecha;
        private int numeroTarjetaCredito;

        /**
         * Establece el cliente del pedido.
         * @param cliente Cliente a asignar.
         * @return El mismo builder.
         */
        public PedidoBuilder setCliente(Cliente cliente) {
            this.cliente = cliente;
            return this;
        }

        /**
         * Agrega un producto al pedido.
         * @param producto Producto a agregar.
         * @return El mismo builder.
         */
        public PedidoBuilder addProducto(Producto producto) {
            productos.add(producto);
            return this;
        }

        /**
         * Establece la fecha del pedido.
         * @param fecha Fecha del pedido.
         * @return El mismo builder.
         */
        public PedidoBuilder setFecha(Date fecha) {
            this.fecha = fecha;
            return this;
        }

        /**
         * Establece el número de tarjeta de crédito.
         * @param numero Número de la tarjeta.
         * @return El mismo builder.
         */
        public PedidoBuilder setNumeroTarjetaCredito(int numero) {
            this.numeroTarjetaCredito = numero;
            return this;
        }

        /**
         * Construye el pedido con el número asignado.
         * @param numero Número de pedido.
         * @return Objeto Pedido construido.
         */
        public Pedido build(int numero) {
            return new Pedido(this, numero);
        }
    }
}
