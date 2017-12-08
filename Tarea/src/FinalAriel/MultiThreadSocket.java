/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalAriel;
import java.io.*;
import java.net.*;
import java.util.*;

/**
 *
 * @author danylee
 */
public class MultiThreadSocket {
    public static void main(String[] args) {
        Vector v = new Vector();
        try {
            int port = 1111;
            ServerSocket server = new ServerSocket(port);
            Socket clientes;

        

            for (int i=0;i<=10;i++) {

                clientes = server.accept();
                ProccessRequest other = new ProccessRequest (clientes,v);
                Thread t = new Thread ((Runnable) other);
                t.start();
                
            }
        for (int i=0;i<v.size();i++) {
            System.out.println(v.get(i)); 
            
        }
            
        } catch (IOException ex) {
            
        }
    }
}
    

