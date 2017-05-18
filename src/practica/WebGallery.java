package practica;

import java.util.ArrayList;

/**
 *
 * @author Juan Felipe López
 */
public class WebGallery {
    
    private ArrayList<Usuario> usuarios;
    private ArrayList<Obra> galeria;

    public WebGallery() {
        this.usuarios = new ArrayList<>();
        this.galeria = new ArrayList<>();
    }
    
    public void addUsuario(Usuario u) {
        this.usuarios.add(u);
    }
    
    public void addObra(Obra o) {
        this.galeria.add(o);
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public ArrayList<Obra> getGaleria() {
        return galeria;
    }
    
}
