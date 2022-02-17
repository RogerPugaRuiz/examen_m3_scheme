/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenm3.views.viewsElement;

import java.util.ArrayList;

/**
 *
 * @author roger
 */
public class Table {
    private ArrayList<Row> rows;
    public Table(){
        this.rows = new ArrayList<>();
    }
    public void addRow(Row row){
        rows.add(row);
    }
    
    public void show(String sep){
        for (int i = 0; i < rows.size(); i++) {
            System.out.println(rows.get(i).toCSV(sep));
        }
    }
    
}
