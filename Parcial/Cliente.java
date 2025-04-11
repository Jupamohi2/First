/**
 * Representa un cliente del sistema.
 */
public class Cliente {
    private String nombre;
    private String cedula;

    /**
     * Constructor del cliente.
     * @param nombre Nombre del cliente.
     * @param cedula Cédula del cliente.
     */
    public Cliente(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }
}
