/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E5;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danylee
 */
public class Traductor {

    private Traductor(InputStream in) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String traducir (String parametro ){
        
        int i= palabra.indexOf(parametro);
        
        if ( i== -1)
            return parametro;
        
        else 
            return palabras.get(i);
        
        

    }
    
    public void agregar ( String letra, String letras){
        palabra.add(letra);
        palabras.add(letras);
        
    }
                
    List<String> palabra;
    List<String>palabras;
    

public Traductor (){
    
   palabra = new ArrayList<>();
   palabras = new ArrayList<>();
}
public String elminiar ( String palabranueva)
{
    
    return palabranueva;
    
}

public static void main (String []args){
    
    Traductor  el = new Traductor ();
    el.agregar("reprobar", "fail");
    
    List <Traductor> e;
     e = new ArrayList<Traductor> ();
     
    
    
    
    
    
    System.out.println("reprobar");
    
            
}

}
