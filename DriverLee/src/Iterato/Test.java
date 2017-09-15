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
public class Test {
    public static void main(String[] args){
        Collection<String> strs = new Collection<String>(10);
        strs.add("hola");
        strs.add("como has estado");
        strs.add("tal vez me hayas olvidado");
        
        System.out.println("" + strs.at(2));
    }
    
    Iterato it = strs.getIterato();
    while (it.hasNext())
    {
        System.out.println("" + it.next());
    }
}
