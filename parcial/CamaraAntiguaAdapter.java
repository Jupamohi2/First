public class CamaraAntiguaAdapter extends Producto {
    private CamaraAntigua camaraAntigua;

    public CamaraAntiguaAdapter(int numero, CamaraAntigua camaraAntigua) {
        super(numero);
        this.camaraAntigua = camaraAntigua;
    }

    @Override
    public void mostrarDetalles() {
        camaraAntigua.mostrarInfo(); // adaptamos el método original
    }
}
