/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerTablas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author danylee
 */
public class Hereda extends AbstractTableModel  {
    String m [][];
    
    String nombredelarchivo;
    String cols [];
    int i = 0;
   
    public int renglon()
    {
         int i = 0;
    
        try {
            BufferedReader br = null;
            br = new BufferedReader(new FileReader (nombredelarchivo));
            String linea;
        linea = br.readLine();
        while (linea != null){
             i = i+1;
            linea = br.readLine();
            
        }
        } catch (FileNotFoundException ex) {
            System.out.println("filenotfound");
        } catch (IOException ex) {
           
        }
        return i;
        
           
        
        
        
        
               
                
    
}

    

    
    public int contar;
    {
        
        try {
            BufferedReader br = null;
            br = new BufferedReader(new FileReader(nombredelarchivo));
            String linea;
            linea = br.readLine();
            cols = linea.split(",");
            i = cols.length;
               
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            
        }
    }    
        
        
        
        
        
        
    
    



    @Override
    public int getRowCount() {
        
        return renglon();
        
        
    }

    @Override
    public int getColumnCount() {
        return contar();
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return m [rowIndex][columnIndex];
         
    }

    public Hereda(String h) throws FileNotFoundException, IOException {
        nombredelarchivo = h;
        int i = 0;
               
m =new String [101][7];
        String row [];
        BufferedReader br = null;
    br = new BufferedReader(new FileReader (nombredelarchivo));
    String linea = br.readLine();
    while (linea != null){
    row = linea.split(",");
    m[i]=row;
    i = i+1;
    linea = br.readLine();
       
    }
   
        
        
    }

    private int contar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

