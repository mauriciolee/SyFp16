/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalAriel;

import java.net.Socket;
import java.util.Vector;
import java.io.*;
import java.net.*;
import java.util.*;

/**
 *
 * @author danylee
 */
public class ProccessRequest {
    Socket cliente;
    StringBuffer mensaje;
    Vector v;
    
    public ProccessRequest (Socket cliente, Vector v)
    {
        this.cliente = cliente;
        this.v = v;

    }

    public void run(){
        int c;

        mensaje = new StringBuffer();
        try {

            BufferedInputStream bis = new BufferedInputStream (cliente.getInputStream());
            InputStreamReader isr = new InputStreamReader (bis);
            BufferedOutputStream bos = new BufferedOutputStream (cliente.getOutputStream());
            OutputStreamWriter osw = new OutputStreamWriter (bos);

            while((c = isr.read())!= (char)13){
                mensaje.append((char)c);
            }
            System.err.println("el cliente dice:" + mensaje);
            v.add(mensaje);
            osw.write("Request accepted" + (char)13);
            osw.flush();
            cliente.close();

        } catch (IOException ex) {
            //TODO: handle exception
        }
       

    }
}

   
    

