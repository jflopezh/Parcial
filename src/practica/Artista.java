package practica;

import java.util.ArrayList;

/**
 *
 * @author Juan Felipe López
 */
public class Artista extends Usuario {
    
    private String curriculum;
    private String distinciones;
    private ArrayList<Obra> obras;

    public Artista(String curriculum, String distinciones, String nombre, String apellido) {
        super(nombre, apellido);
        this.curriculum = curriculum;
        this.distinciones = distinciones;
        this.obras = new ArrayList<>();
    }

    public String getInfoFormatoBaseDeDatos() {
        String x = "Artista:" + this.nombre + ":" + this.apellido + "\n" + this.obras.size();
        for (Obra obra : obras) {
            x += "\n" + obra.getInfoBaseDeDatos();
        }
        return x;
    }
    
}
