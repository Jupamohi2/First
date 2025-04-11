import java.util.ArrayList;
import java.util.Date;

/**
 * Clase principal que ejecuta el flujo de creación de pedidos y productos.
 * Aquí se documentan los escenarios de prueba para validar el sistema.
 */
public class Main {
    public static void main(String[] args) {

        // Escenario 1: Crear tres clientes distintos
        Cliente cliente1 = new Cliente("Juan Pérez", "123456789");
        Cliente cliente2 = new Cliente("Ana Gómez", "987654321");
        Cliente cliente3 = new Cliente("Luis Martínez", "456789123");

        // Escenario 2: Crear cámaras de diferentes marcas y modelos
        Producto camara1 = new Camara(1, "Canon", "EOS 4000D");
        Producto camara2 = new Camara(2, "Nikon", "D3500");
        Producto camara3 = new Camara(3, "Sony", "Alpha 6000");

        // Escenario 3: Crear varias fotos simuladas con nombres de archivo
        Producto foto1 = new Foto(4, "playa.jpg");
        Producto foto2 = new Foto(5, "montaña.jpg");
        Producto foto3 = new Foto(6, "ciudad.jpg");
        Producto foto4 = new Foto(7, "naturaleza.jpg");

        // Escenario 4: Agrupar fotos en una lista de productos para impresión
        ArrayList<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(foto1);
        listaProductos.add(foto2);
        listaProductos.add(foto3);
        listaProductos.add(foto4);

        // Escenario 5: Crear impresiones tipo "Color" y "Blanco y negro"
        Producto impresion1 = new Impresion(8, "Color", listaProductos);
        Producto impresion2 = new Impresion(9, "Blanco y negro", listaProductos);
        Producto impresion3 = new Impresion(10, "Color", listaProductos);

        // Escenario 6: Crear un pedido con una cámara y una impresión a color
        Pedido pedido1 = new Pedido.PedidoBuilder()
                .setCliente(cliente1)
                .addProducto(camara1)
                .addProducto(impresion1)
                .setFecha(new Date())
                .setNumeroTarjetaCredito(123456)
                .build(100);
        pedido1.mostrarPedido();

        // Escenario 7: Crear un pedido con una cámara y una impresión blanco y negro
        Pedido pedido2 = new Pedido.PedidoBuilder()
                .setCliente(cliente2)
                .addProducto(camara2)
                .addProducto(impresion2)
                .setFecha(new Date())
                .setNumeroTarjetaCredito(654321)
                .build(101);
        pedido2.mostrarPedido();

        // Escenario 8: Crear un pedido con otra combinación de cámara e impresión
        Pedido pedido3 = new Pedido.PedidoBuilder()
                .setCliente(cliente3)
                .addProducto(camara3)
                .addProducto(impresion3)
                .setFecha(new Date())
                .setNumeroTarjetaCredito(789012)
                .build(102);
        pedido3.mostrarPedido();
    }
}
