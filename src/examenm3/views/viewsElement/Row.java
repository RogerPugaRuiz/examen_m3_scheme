/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenm3.views.viewsElement;

/**
 *
 * @author roger
 */
public class Row {
    private String[] elements;
    private int size;

    public Row(String[] elements) {
        this.elements = elements;
        size = this.elements.length;
    }
    
    public String toCSV(String sep){
        String text = "";
        for (int i = 0; i < elements.length; i++) {
            text += elements[i] + sep + " ";
        }
        return text;
    }
}
