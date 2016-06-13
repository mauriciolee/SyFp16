/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E6;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 *
 * @author danylee
 */
public class Convertidor {

    public Convertidor() {
        list = new HashMap();
        list.put("centimetros", 0.01);
        list.put("metros",1.00);
        list.put("kilometros", 1000.00);
        list.put("pulgadas", .0254);
        list.put("pies", .305);
        list.put("yardas", .914);
        list.put("millas", 1613.00);
        
    }
    
    Map<String,Double> list ;
    
    public double convertir (String s, double d, String s1)
    {
        if(list.containsKey(s))
        {
        double cm = list.get(s);
        cm = cm *d;
        double inch = list.get(s1);
        return cm/inch;
        }
        return 0.0;
        
    }

public static void main (String[]args)
{
    Convertidor c = new Convertidor();
    c.convertir("cm", 30.00, "pies");
    double r = c.convertir("cm", 30, "pies");
    System.out.println(r);
    
    
}

}

