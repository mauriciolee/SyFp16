/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author danylee
 */
public class Test {
    
    public static void main(String[] args) {
        Director d = new Director();
        Hamb h = (Hawaiian) d.orderHamb("Hawaiiana");
        Hamb dob = d.orderHamb ("Double");
    }
    
    
}
