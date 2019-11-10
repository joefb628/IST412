/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewtreatments;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 *
 * @author Brian
 */
public class ViewTreatments 
{
    PriorityQueue<String> treatments = new PriorityQueue<>();
    
    public ViewTreatments() {
        populateQueue();
    }
    
    private void populateQueue(){
        treatments.add("20CCs of Vicodin");
        treatments.add("Warm compress every 2 hours");
        treatments.add("Take 2 Advil every 4 hours");
        treatments.add("Ice every 20 minutes");
    }
    
    /**
     * receives the list of treatments 
     */
    
    public void setTreatments()
    {
        
    }

    public PriorityQueue<String> getTreatments() {
        return treatments;
    }
    
    /**
     * gets the list of treatments so that it is viewable in other classes
     * @returns the list of treatments
     * takes the "type" input for better organization
     */
    
    
    
    
    
    
}
