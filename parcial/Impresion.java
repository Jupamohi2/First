import java.util.ArrayList;


public class Impresion extends Producto {
    String color;
    ArrayList<Foto> foto = new ArrayList<>();

    public Impresion(String color, ArrayList<Foto> foto, int numero){
        super(numero);
        this.color = color;
        this.foto = foto;
    }
    
}
