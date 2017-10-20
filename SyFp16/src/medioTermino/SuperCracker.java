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
public abstract class SuperCracker {
    protected String host;
    protected String ip;
    protected Dictionary dictonary;
    
    public abstract void setHost(String host);
    public abstract void setDictonary ( Dictionary dictonary);
    public abstract String crackPWD();
    
}
