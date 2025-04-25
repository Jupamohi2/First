/**
 * Clase que representa un cliente.
 * Cada cliente tiene un nombre y una cédula que lo identifican.
 */
public class Cliente {
    private String nombre; // Nombre del cliente
    private String cedula; // Cédula del cliente

    /**
     * Constructor de la clase Cliente.
     * @param nombre Nombre del cliente.
     * @param cedula Cédula del cliente.
     */
    public Cliente(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    /**
     * Obtiene el nombre del cliente.
     * @return Nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la cédula del cliente.
     * @return Cédula del cliente.
     */
    public String getCedula() {
        return cedula;
    }
}