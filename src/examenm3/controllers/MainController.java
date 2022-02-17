/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenm3.controllers;

import examenm3.views.MainMenu;
import examenm3.views.Menu;
import examenm3.views.ViewMenu;

/**
 *
 * @author roger
 */
public class MainController {
    public MainController(){
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
                    System.out.println("searching...");
                    break;
                    
            }
            
        }while(!exit);
    }
}
