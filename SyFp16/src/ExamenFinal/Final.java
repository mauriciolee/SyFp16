/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenFinal;

/**
 *
 * @author danylee
 */
public class Final {
    package ReporteEstadisticaArchivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dany lee
 */
public class ReporteAbstractTableModel extends AbstractTableModel
{
    private String m[][];
    private String names[];
    private String nombreArchivo;
    int cFrame=0, cPuzzle=0, cGlue=0, cStorage = 0;

    @Override
    public String getColumnName(int column) {
        return names[column];
    }

    public ReporteAbstractTableModel(String nombre) {
        
        names = new String[]{"id", "product", "total"};
        nombreArchivo = nombre;
        
        leerArchivo();
        
        m = new String[4][3];
        m[0][0] = "1";
        m[0][1] = "FRAME";
        m[0][2] = " " + cFrame;
        m[1][0] = "2";
        m[1][1] = "GLUE";
        m[1][2] = " " + cGlue;
        m[2][0] = "3";
        m[2][1] = "PUZZLE";
        m[2][2] = " " + cPuzzle ;
        m[3][0] = "4";
        m[3][1] = "STORAGE";
        m[3][2] = " " + cStorage;
    }
    
    
    
    @Override
    public int getRowCount() {
        return 3;
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return m[rowIndex][columnIndex];
    }
    
    public void leerArchivo()
    {
        
        try(BufferedReader br = new BufferedReader(new FileReader(nombreArchivo)))
        {
            String linea;
            linea = br.readLine();
            while(linea != null)
            {
                String row[];
                
                if(row[3].equals("PUZZLE"))
                {
                    cPuzzle = cPuzzle + 1;
                }
                if(row[6].equals("GLUE"))
                {
                    cGlue = cGlue + 1;
                }
                
                linea = br.readLine();
            }                       
        } catch (IOException ex) {
            Logger.getLogger(ReporteAbstractTableModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    
}
