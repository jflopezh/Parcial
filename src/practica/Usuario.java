package practica;

/**
 *
 * @author Juan Felipe López
 */
public abstract class Usuario { 
    
    /* Se hace uso de una clase abstracta en lugar de una interface para reutilizar 
    código relacionado con atributos y métodos comunes entre las clases hijas,
    y también para declarar a su vez métodos abstractos que estas deben implementar
    de manera obligatoria */
    
    protected String nombre;
    protected String apellido;

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public abstract String getInfoFormatoBaseDeDatos();
    
}
