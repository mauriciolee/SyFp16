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
public abstract class Hamb {
    public abstract void getHambtype();

    public void setBread(Bread bread) {
        this.bread = bread;
    }

    public void setTomatoe(Tomatoe tomatoe) {
        this.tomatoe = tomatoe;
    }

    public void setPineapple(Pineapple pineapple) {
        this.pineapple = pineapple;
    }

    public void setMeat(Meat meat) {
        this.meat = meat;
    }
    protected Bread bread;
    protected Tomatoe tomatoe;
    protected Pineapple pineapple;
    protected Meat meat;
    
    
    
}
