

public class Camara extends Producto{
    String marca;
    String modelo;

    public Camara(String marca, String modelo, int numero){
        super(numero);
        this.marca = marca;
        this.modelo = modelo;
    }

    public void imprimir(){
        System.out.println("Marca de la camara: "+marca+"modelo de la camara: "+modelo + "id del producto: "+numero);
    }
}
