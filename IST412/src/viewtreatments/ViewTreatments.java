/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist.pkg412.medical.application.viewtreatments;

import java.util.ArrayList;

/**
 *
 * @author Brian
 */
public class ViewTreatments 
{
    ArrayList<String> j = new ArrayList<String>();
    /**
    *The constructor of the ViewTreatments class
    */
    
    public ViewTreatments()
    {
 
    }
    
    
    /**
     * receives the list of treatments 
     */
    
    public void setTreatments()
    {
        
    }
    
    /**
     * gets the list of treatments so that it is viewable in other classes
     * @returns the list of treatments
     * takes the "type" input for better organization
     */
    
    public ArrayList<String> getTreatments(int Type)
    {
        return j;
    }
    
    
    
    
}
