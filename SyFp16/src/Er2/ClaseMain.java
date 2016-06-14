/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Er2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danylee
 */
public class ClaseMain {
    public static void main (String[] args){
        ArchivoBinario AB = new ArchivoBinario ();
        AB.agregar("abrir, desplegar, cerrar");
        List<ArchivoBinario> a;
        a = new ArrayList<ArchivoBinario>();
        
        ArchivoImagen AI = new ArchivoImagen ();
        AI.agregar("abrir, desplegar, cerrar");
        List<ArchivoImagen> b;
        b = new ArrayList<ArchivoImagen>();
        
        
        ArchivoTexto AT = new ArchivoTexto ();
        AT.agregar("abrir, desplegar, Cerrar");
        List<ArchivoTexto> c;
        c = new ArrayList<ArchivoTexto>();
        
                
        
    }
    
    
    
}
