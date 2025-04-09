

public class Main {
    
    public static void main(String[] args) {
        Producto camara1 = new Camara("acme","T-800",2);
        Cliente cliente1 = new Cliente("15448","juan");
        Producto camara2 = new Camara("adidas","5000", 3);

        ArrayList<Producto> lista1;
        lista1.add(camara1);
        lista1.add(camara2);

        Pedido pedido1 = new Pedido(cliente1, lista1, "01-02-2002", 45);

    }
}
