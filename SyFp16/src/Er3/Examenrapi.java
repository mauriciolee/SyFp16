/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Er3;

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
public class Examenrapi extends AbstractTableModel {
    String products;
    int i = 0;
    String row [];
    
    

    @Override
    public int FRAME() throws IOException {
        i =0;
        
        try {
            BufferedReader br = null;
            br = new BufferedReader(new FileReader (products)); 
            String linea = br.readLine();
            
            while (linea !=null){
            row = linea.split(",");
            if (row[4].equals
                ("FRAME"))
            {
                i = i+1;
            }
                linea = br.readLine();  
        }
            
        } catch (FileNotFoundException ex) {
            System.out.println("filenotfound");
            
        }
        return i;
        
        
    }
    
    public int GLUE(){
        int i = 0;
        try {
            BufferedReader br = null;
            br = new BufferedReader (new FileReader (products));
            String linea = br.readLine();
            
            while (linea !=null){
                row = linea.split(",");
                if (row [4].equals
                    ("GLUE"))
                {
                    i = i+1;
                }
                linea = br.readLine();
                
            }
            
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            
        }
        return i;
        
    }
    
    public int PUZZLE(){
        int i =0;
        try {
            BufferedReader br = null;
            br = new BufferedReader (new FileReader (products));
            String linea = br.readLine();
            
            while (linea !=null){
                row = linea.split(",");
                if (row [4].equals
                    ("PUXXLE"))
                {
                    i = i+1;
                }
               
                linea = br.readLine();
                
            }
            
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
           
        }
        return 0;
    }
    
    public int STORAGE(){
        try {
            BufferedReader br = null;
            br = new BufferedReader ( new FileReader (products));
            String linea = br.readLine();
            
            while (linea !=null){
                row = linea.split(",");
                if (row [4].equals
                    ("STORAGE"))
                {
                    i = i+1;
                }
                linea = br.readLine();
                
                
                
                
            }
            
            
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            
        }
        return i;
        
        
    }

    @Override
    public int getRowCount() {
        return 0;
         
    }

    @Override
    public int getColumnCount() {
        return 0;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        return null;
    }
    public class Examenrapi;
String frame;
String glue;
String puzzle;
String storage;


    

    public Examenrapi(String 6) {
        examen = 6;
        6 = contarFrame();
        
        
            
        }
        
    }



    
    
}

