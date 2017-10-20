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
public abstract class Creator {
    public abstract void create(String typeProduct, String host, String ip, Dictionary dictionary);
    public SuperCracker factoryMethod(String typeCracker)
    {
        create(typeCracker, host, ip, dictionary);
        return product;
    }
    protected SuperCracker product;
    
}
