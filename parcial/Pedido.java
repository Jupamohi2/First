import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    Cliente cliente;
    static ArrayList<Producto> producto = new ArrayList<>();
    Date fecha;
    int numeroTarjetaDeCredito;

    public Pedido(Cliente cliente,ArrayList<Producto> producto,Date fecha,int numeroTarjetaDeCredito){
        this.cliente = cliente;
        this.producto = producto;
        this.fecha = fecha;
        this.numeroTarjetaDeCredito = numeroTarjetaDeCredito;
    }

    public static void lista(Producto obj){
        producto.add(obj);
    }

}
