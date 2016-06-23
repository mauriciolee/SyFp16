/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danylee
 */
public class Banco {
   List<Cuenta> cuenta;
   ArrayList<Cliente> cliente;
   
   public Banco()
   {
       cuenta = new ArrayList();
       cliente = new ArrayList();
       
       
       
   }
   
   public void AgregarCliente (Cliente x)
   {
       cliente.add(x);
       
       
   }
   
   public void AgregarCuenta (Cuenta z)
   {
       
       
   }
   
   public void GuardarCliente ()
   {
       try ( BufferedWriter bw = new BufferedWriter(new FileWriter ("cliente.txt", true)))
       {
           for ( Cliente cl : cliente)
           {
               bw.write(cl.getIdCliente() + "," + cl.getCuenta() + "," + cl.getEdad()+ "," + cl.getNombre()+ "\n");
               
               
           }
           
       } catch (IOException ex) {
           
       }
       
   }
   
   public void GuardarCuenta ()
   {
       try (BufferedWriter bw = new BufferedWriter ( new FileWriter ("cuenta.txt", true)))
       {
           for (Cuenta cl : cuenta)
           {
               bw.write(cl.getCliente()+"," + cl.getCuenta() + "\n");
               
           }
           
       } catch (IOException ex) {
          
       } 
       
       
   } 
   
   public static void main (String[]args)
   {
       Banco b = new Banco();
       Cliente c = new Cliente("oz","24","10",12,11);
       Cliente d = new Cliente ("lee","19","11",13, 14);
       Cliente e = new Cliente ("jos","22","12",14,15);
       Cliente f = new Cliente ("daniel","18","13",15,16);
       Cliente g = new Cliente ("H","21","14",16,17);
       
       b.AgregarCliente(c);
       b.AgregarCliente(d);
       b.AgregarCliente(e);
       b.AgregarCliente(f);
       b.AgregarCliente(g);
       b.GuardarCliente();
       
       
       Cuenta cu = new Cuenta(12,11);
       Cuenta cu3 = new Cuenta(13,14);
       Cuenta cu4 = new Cuenta (14,15);
       Cuenta cu2 = new Cuenta (15,16);
       Cuenta cu1 = new Cuenta (16,17);
       
       b.AgregarCuenta(cu);
       b.AgregarCuenta(cu3);
       b.AgregarCuenta(cu4);
       b.AgregarCuenta(cu2);
       b.AgregarCuenta(cu1);
       b.GuardarCuenta();
   }
   
   
           
   
}
