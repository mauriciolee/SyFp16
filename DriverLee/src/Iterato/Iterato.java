/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterato;

/**
 *
 * @author danylee
 */
public class Iterato <T>{
    protected Collection<T> collection;
    int cont;
    public Iterato(Collection<T> collection)
    {
        this.collection = collection;
        cont = 0;
        
    }
    
    boolean hasNext()
    {
        if(cont <= collection.length())
        
            return true;
            return false;
            
            
        
    }
    
    public T next()
    {
        return collection.at(cont ++);
    }

    String next() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
