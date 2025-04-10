import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear cliente
        // Crear cliente
        Cliente cliente = new Cliente("123456789", "Juan Pérez");

        // Crear cámara (Producto)
        Camara camara1 = new Camara(1, "Canon", "EOS 4000D");

        // Crear fotos
        Foto foto1 = new Foto("playa.jpg");
        Foto foto2 = new Foto("montaña.jpg");

        // Lista de fotos
        ArrayList<Foto> listaFotos = new ArrayList<>();
        listaFotos.add(foto1);
        listaFotos.add(foto2);

        // Crear impresión (Producto)
        Impresion impresion1 = new Impresion(2, "Color", listaFotos);

        // === NUEVO: Creamos y adaptamos una cámara antigua ===
        CamaraAntigua camaraAntigua = new CamaraAntigua("Kodak 1965");
        Producto camaraAdaptada = new CamaraAntiguaAdapter(3, camaraAntigua);

        // Crear pedido usando el patrón Builder + el Adapter
        Pedido pedido = new Pedido.PedidoBuilder()
                .setCliente(cliente)
                .addProducto(camara1)
                .addProducto(impresion1)
                .addProducto(camaraAdaptada) // ← Aquí agregás el Adapter
                .setFecha(new Date())
                .setNumeroTarjetaCredito(123456)
                .build();

        // Mostrar el pedido
        pedido.mostrarPedido();

    }
}
