/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenm3.views;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Menu {

    List<Option> options;
    String title;

    //CONSTRUCTOR
    public Menu(String title) {
        this.title = title;
        options = new ArrayList<>();
    }

    //METHODS
    //adds an option to the menu
    public void add(Option option) {
        options.add(option);
    }
    
    public void addList(Option[] optionList){
        for (int i = 0; i < optionList.length; i++) {
            options.add(optionList[i]);
        }
    }

    //removes an option from the list
    public boolean remove(Option option) {
        return options.remove(option);
    }

    //removes an option from the list (at specified index)
    public Option remove(int index) {
        return options.remove(index);
    }
    
    //toString: Converts the menu to string
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("---- " + getTitle() + " ----");
        Iterator it = options.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
        }
        return sb.toString();
    }
    //shows the menu
    public void show(){
        int idOption = 0;
        Iterator it = options.iterator();
        while(it.hasNext()){
            System.out.format("[%d] %s\n", idOption,it.next().toString());
            idOption++;
        }
    }
    
    //gets input from user to select an option
    //returns -1 if error
    public int choose(){
        System.out.print("Select: ");
        Scanner sc = new Scanner(System.in);
        int opt = -1;
        try{
            opt = sc.nextInt();
            if(opt<0 || opt>=options.size())
                opt = -1;
        }catch(InputMismatchException e){
            opt = -1;
        }
        return opt;
    }
    
    //SETTERS & GETTERS
    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    

}
