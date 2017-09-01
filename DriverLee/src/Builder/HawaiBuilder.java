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
public class HawaiBuilder extends Builder{

    public Hamb buildHamb() {
         return new Hawaiian();
    }

    public void buildBread() {
        Bread b = new Bread();
        hamb.setBread(b);
        
    }

    public Tomatoe buildtomatoe() {
        Hamb.setTomatoe(new Tomatoe ());
        
    }

    public Pineapple buildpineapple() {
         Hamb.setpineapple(new pineapple ());
         
    }

    public Meat buildmeat() {
        Hamb.setMeat(new meat ());
        
    }
    
}
