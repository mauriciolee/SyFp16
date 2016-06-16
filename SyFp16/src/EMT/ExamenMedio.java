/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EMT;

import java.io.InputStream;

/**
 *
 * @author danylee
 */
public  class ExamenMedio extends Examen{
    public String getHoyNoCircula (){
        return null;
       
    }
    public String getByPlaca( String n1m){
        if (n1m == "5" || n1m == "6" ){
            return "lunes";
        }
        if (n1m == "7" || n1m == "8"){
            return"martes";
        }
        if (n1m == "3" || n1m == "4"){
            return "miercoles";
        }
        if (n1m == "1" || n1m == "2"){
            return "jueves";
        }
        if (n1m == "9" || n1m == "0"){
            return "viernes";
        }   
    return "";
}
    public String getTerminacionPlaca (String dia){
        if(dia == "lunes")
        {return "5,6";
    }
        if(dia == "martes")
        {
            return "7,8";
        }
        if(dia == "miercoles")
        {
            return "3,4";
        }
        if(dia == "jueves")
        {
            return "1,2";
        }
        if(dia == "viernes")
        {
            return "9,0";
        } 
        
        
        
      return"";  
    }
    public String getColor (String color){
        if (color == "amarillo")
        {
            return "lunes";
        }
        if (color == "rosa")
        {
            return "martes";
        }
        if (color == "rojo")
        {
            return "miercoles";
        }
        if(color == "verde")
        {
            return "jueves";
        }
        if (color == "azul")
        {
            return "viernes";
        } 
        
        return"";
    }
    
    
   
}
