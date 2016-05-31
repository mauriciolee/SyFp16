/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E1;

/**
 *
 * @author danylee
 */
public class Cesar {
    
    public String cifrar (String mensaje, int constante ) {
        
            String resultado = " ";
            for (int i = 0 ; i< mensaje.length(); i++ )
            {
                
              
            resultado = resultado  + (char) ( mensaje.charAt(i) + constante );
                      
                
                
                
            }
            return resultado ;
            
    }       
    
    public static void main(String[] args) {
        
        Cesar c = new Cesar();
        c.cifrar("hola", 3);
        System.out.println(c.cifrar ("hola", 3));
        
        c.descifrar("", 3);
        System.out.println("",3));
    }
    


    public String descifrar (String s , int constante ){

        String resultado = "";
        for (int i=0 ; i< s.length();i++ ) {
            resultado = resultado + (char) (s.charAt(i) + constante );

}
    return resultado;
            
        
}

    
        


}
     
  
    



    

