/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estudiante
 */
public class ManejoDatos {
    
    public void guardarDatos(WebGallery w) {
        ArrayList<Usuario> usuarios = w.getUsuarios();
        File f = new File("Datos.txt");
        try {
            PrintStream salida = new PrintStream(f);
            for (Usuario u : usuarios) {
                if (u instanceof Comprador) {
                    salida.println(u.getInfoFormatoBaseDeDatos());
                } else if (u instanceof Artista) {
                    salida.println(u.getInfoFormatoBaseDeDatos());
                }
            }
        } catch (FileNotFoundException ex) { 
            System.out.println("El archivo \"Datos.txt\" no existe dentro del proyecto");
        }
    }
    
    public void cargarDatos(WebGallery w) {
        File f = new File("Datos.txt");
        try {
            Scanner sc = new Scanner(f);
            sc.useDelimiter(":");
            while (sc.hasNext()) {
                
            }
            if  (sc.next().equals("Comprador")) {
                w.addUsuario(new Artista(null, null, null, null));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo \"Datos.txt\" no existe dentro del proyecto");
        }
        
    }
    
}
