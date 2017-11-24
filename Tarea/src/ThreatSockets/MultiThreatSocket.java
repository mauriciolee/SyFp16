/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreatSockets;

import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author danylee
 */
public class MultiThreatSocket {
    public static void main (String[] args)
    {
        try{
        int port = 1111;
        ServerSocket server = new ServerSocket(port);
        Socket clientes;
        while(true)
        {
            clientes = server.accept();
            ProcessRequest other = new ProcessRequest(clientes);
            Thread t = new Thread(other);
            t.start();
            
        }
        catch (IOException ex) {
                
                }
                
                
                
                
        
    }
    
}
