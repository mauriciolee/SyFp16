/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenFinal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danylee
 */


public class Almacen implements IAlmacen {
   
    ArrayList<Productos>p1;
public Almacen() {
    p1 = new ArrayList();
}

    public void Comprar(Productos p) {
        p1.add(p);
    }

    public Productos Buscar(String s) {
        for (int i = 0; i < p1.size() ; i++){
            if(p1.get(i).getNombre().equals(i)){
                return p1.get(i);
            }
        }
        return null;
    }

    @Override
    public void Comprar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    


    
    
    
}
