/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenm3.views;

/**
 *
 * @author alumne
 */
public class Option {
    private String description;
    
    
    //CONSTRUCTORS

    public Option(String description) {
        this.description = description;
    }
    
    
    
    //SETTERS & GETTERS

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
    
    
    
}
