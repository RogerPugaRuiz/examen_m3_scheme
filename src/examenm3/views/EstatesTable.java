/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenm3.views;

import examenm3.views.viewsElement.Row;
import examenm3.views.viewsElement.Table;

/**
 *
 * @author roger
 */
public class EstatesTable implements ViewTable{

    @Override
    public Table build() {
        Table estates = new Table();
        String[] headerStr = {"Type","Surface","Addres","Price"};
        Row header = new Row(headerStr);
        estates.addRow(header);
        return estates;
    }
    
}
