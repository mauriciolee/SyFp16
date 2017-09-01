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
public class Director {
    protected Builder builder;
    public Builder getBuilder(String tipo) {
        
        if(tipo == "Hawaiiana")
        {
            return new HawaiBuilder();  
        }
        if(tipo == "Doble")
        {
            return new DoubleBuilder();
        }
        return new DoubleBuilder();
    }
    
    public Hamb orderHamb (String tipo)
    {
       builder = getBuilder(tipo);
       builder.createHamb();
       return builder.getHamb();
    }

    Hawaiian orderHamb(String hawaiiana) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
