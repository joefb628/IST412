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
public class ViewTreatmentsView 
{
    int type;
    int treatment;
    
    /**
     * Constructor for the ViewTreatmentsView class
     */
    
    public ViewTreatmentsView()
    {
        
    }
    
    /**
     * receives the treatments list and displays it for the user
     */
    
    public void displayTreatments(ArrayList<String> j)
    {
        
    }
    
    /**
     * gets the user input for the type of treatments
     * @returns the type as an int
     */
    
    public int getType()
    {
        return type;
    }
    
    /**
     * gets user input on chosen treatment
     * @returns int that is tied to treatment
     */
    
    public int selectedTreatment()
    {
        return treatment;
    }
}
