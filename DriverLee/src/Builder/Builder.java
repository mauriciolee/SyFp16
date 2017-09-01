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
public abstract class Builder {
    protected Hamb hamb;
    public abstract void Hamb();
    public abstract void Bread();
    public abstract void Tomatoe();
    public abstract void Pineapple();
    public abstract void Meat();
    
    public Hamb getHamb(){
        return hamb;
        
    }
    public void createHamb(){
        
        hamb = buildHamb();
        Bread();
        Tomatoe();
        Pineapple();
        Meat();
    }

    private Hamb buildHamb() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
