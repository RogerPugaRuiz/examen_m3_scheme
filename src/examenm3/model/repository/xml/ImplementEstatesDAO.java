/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenm3.model.repository.xml;

import examenm3.model.Estate;
import examenm3.model.EstatesDAO;
import examenm3.model.repository.xml.handler.EstatesHandler;
import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 *
 * @author roger
 */
public class ImplementEstatesDAO implements EstatesDAO{

    @Override
    public ArrayList<Estate> read() {
                SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();
            EstatesHandler handler = new EstatesHandler();
            saxParser.parse(new File("estates.xml"), handler);
            
            //Get Bank list 
            ArrayList<Estate> estates = (ArrayList<Estate>) handler.getEstates();
            
            //print Bank information 
            return estates;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
