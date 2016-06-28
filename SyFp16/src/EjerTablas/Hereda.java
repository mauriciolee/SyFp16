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
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author danylee
 */
public class Hereda extends AbstractTableModel  {
    String m [][];
    
    int i = 0;
    
    


    @Override
    public int getRowCount() {
        return 101;
        
    }

    @Override
    public int getColumnCount() {
        return 5;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return m [rowIndex][columnIndex];
         
    }

    public Hereda(String h) throws FileNotFoundException, IOException {
        m =new String [101][7];
        String row [];
        BufferedReader br = null;
    br = new BufferedReader(new FileReader ("employees.csv"));
    String linea = br.readLine();
    while (linea != null){
    row = linea.split(",");
    m[i]=row;
    i = i+1;
    linea = br.readLine();
       
    }
   
        
        
    }
}

