/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medioTermino;

/**
 *
 * @author danylee
 */
public class Cracker extends SuperCracker {

    @Override
    public void setHost(String host) {
        this.host = host;
        System.out.println("El host es host" + host);
        
    }

    @Override
    public void setDictonary(Dictionary dictonary) {
       
        
    }

    @Override
    public String crackPWD() {
        return "password";
        
    }
    
    
}
