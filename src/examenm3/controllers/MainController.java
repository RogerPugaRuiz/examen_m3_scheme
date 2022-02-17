/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenm3.controllers;

import examenm3.model.Estate;
import examenm3.model.Model;
import examenm3.views.EstatesTable;
import examenm3.views.MainMenu;
import examenm3.views.viewsElement.Menu;
import examenm3.views.ViewMenu;
import examenm3.views.ViewTable;
import examenm3.views.viewsElement.Row;
import examenm3.views.viewsElement.Table;
import java.util.ArrayList;
import org.xml.sax.Parser;

/**
 *
 * @author roger
 */
public class MainController {
    public MainController(){
        // first view
        showMainMenu();
    }
    
    private void showMainMenu(){
        ViewMenu viewMenu = new MainMenu();
        boolean exit = false;
        int idOption = -1;
        Menu menu = viewMenu.build();
        
        do{
            menu.show();
            idOption = menu.choose();
            switch(idOption){
                case 0: //exit
                    exit=true;
                    break;
                case 1: //find a Client by Id
                    showEstates();
                    break;
                    
            }
            
        }while(!exit);
    }
    
    private void showEstates(){
        ViewTable estatesTable = new EstatesTable();
        Table table = estatesTable.build();
        ArrayList<Estate> estates = new Model().getEstates();
        for (int i = 0; i < estates.size(); i++) {
            final Estate estate = estates.get(i);
            String[] elements = {
                estate.getType(),
                Double.toString(estate.getSurface()),
                estate.getAddres().toString(),
                Double.toString(estate.getPrice())
            };
            Row row = new Row(elements);
            table.addRow(row);
        }
        table.show(";");
    }
}
