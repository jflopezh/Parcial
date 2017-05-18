package practica;

/**
 *
 * @author Juan Felipe López
 */
public class Obra implements ComisionWebGallery{
    
    private String nombre;
    private String descripcion;
    private String estilo;
    private double valor;

    public Obra(String nombre, String descripcion, String estilo, double valor) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estilo = estilo;
        this.valor = valor + (valor*COMISION);
    }
    
    public String getInfoBaseDeDatos() {
        return this.nombre + ":" + this.descripcion + ":" + this.estilo + ":" + this.valor;
    }
    
}
