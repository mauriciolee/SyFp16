/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverlee;

/**
 *
 * @author danylee
 */
public class ConectonTest {
    
    public static void main(String[] args) {
      Creator c = new Concrete();
        DFather f = c.FactoryMethod("MongoDB");  
    }
    
        
}

    

