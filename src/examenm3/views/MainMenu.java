/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenm3.views;

import examenm3.views.viewsElement.Option;
import examenm3.views.viewsElement.Menu;
import java.util.ArrayList;


/**
 * View Main Menu
 * @author roger
 */
public class MainMenu implements ViewMenu{
    /**
     * Build the main menu
     * @return menu
     */
    public Menu build(){
        final String TITTLE = "Real Stage Agency";
        final Option[] OPTIONS = {
            new Option("Exit"),
            new Option("Show estates"),
            new Option("Add new estate")};
        Menu menu = new Menu(TITTLE);
        menu.addList(OPTIONS);
        return menu;
    }
    /**
     * show the main menu
     */
}
