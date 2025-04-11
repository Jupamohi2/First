import java.util.ArrayList;
import java.util.Date;

public class Main {
        public static void main(String[] args) {

                Cliente cliente1 = new Cliente("Juan Pérez", "123456789");
                Cliente cliente2 = new Cliente("Ana Gómez", "987654321");
                Cliente cliente3 = new Cliente("Luis Martínez", "456789123");

                Producto camara1 = new Camara(1, "Canon", "EOS 4000D");
                Producto camara2 = new Camara(2, "Nikon", "D3500");
                Producto camara3 = new Camara(3, "Sony", "Alpha 6000");

                Foto foto1 = new Foto("playa.jpg");
                Foto foto2 = new Foto("montaña.jpg");
                Foto foto3 = new Foto("ciudad.jpg");
                Foto foto4 = new Foto("naturaleza.jpg");

                ArrayList<Foto> listaFotos = new ArrayList<>();
                listaFotos.add(foto1);
                listaFotos.add(foto2);
                listaFotos.add(foto3);
                listaFotos.add(foto4);

                Producto impresion1 = new Impresion(2, "Color", listaFotos);
                Producto impresion2 = new Impresion(0, "blanco y negro", listaFotos);
                Producto impresion3 = new Impresion(0, "Color", listaFotos);

                Pedido pedido1 = new Pedido.PedidoBuilder()
                                .setCliente(cliente1)
                                .addProducto(camara1)
                                .addProducto(impresion1)
                                .setFecha(new Date())
                                .setNumeroTarjetaCredito(123456)
                                .build(100);

                pedido1.mostrarPedido();

                Pedido pedido2 = new Pedido.PedidoBuilder()
                                .setCliente(cliente2)
                                .addProducto(camara2)
                                .addProducto(impresion2)
                                .setFecha(new Date())
                                .setNumeroTarjetaCredito(654321)
                                .build(101);
                pedido2.mostrarPedido();

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
