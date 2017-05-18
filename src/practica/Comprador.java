package practica;

/**
 *
 * @author Juan Felipe López
 */
public class Comprador extends Usuario {

    public Comprador(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public String getInfoFormatoBaseDeDatos() {
        return "Comprador:" + this.nombre + ":" + this.apellido; 
    }
    
}
