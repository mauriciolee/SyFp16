/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalAriel;
import java.io.*;
import java.net.*;

/**
 *
 * @author danylee
 */
public class Cliente {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 1111;
        StringBuffer mensaje = new StringBuffer();

        
        try {

            InetAddress add = InetAddress.getByName(host);
            Socket cliente = new Socket(add, port);

            BufferedInputStream bis = new BufferedInputStream (cliente.getInputStream());
            InputStreamReader isr = new InputStreamReader (bis);
            BufferedOutputStream bos = new BufferedOutputStream (cliente.getOutputStream());
            OutputStreamWriter osw = new OutputStreamWriter (bos);

            osw.write("Soy lee” + ((char)13));
            osw.flush();

            int c;
            while ((c = isr.read()) != 13) {

                mensaje.append((char)c);
                
            }

            System.err.println(mensaje);
            cliente.close();

        } catch (UnknownHostException ex){

        

            
        } catch (IOException ex) {
            
        }
    }
    
}
    

