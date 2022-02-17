/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenm3.model;

import examenm3.model.repository.xml.ImplementEstatesDAO;
import java.util.ArrayList;

/**
 *
 * @author roger
 */
public class Model {
    public ArrayList<Estate> getEstates(){
        EstatesDAO estates = new ImplementEstatesDAO();
        return estates.read();
    }
}
