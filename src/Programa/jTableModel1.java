/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Everton
 */
public class jTableModel1 extends AbstractTableModel{
    
    ArrayList<Celular> linhas ;
    ArrayList<Celular> colunas;

    public jTableModel1(ArrayList<Celular> linhas, ArrayList<Celular> colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
    }
    

       
    @Override
    public int getRowCount() {
        return this.linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return 
    }
    
     public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
}
