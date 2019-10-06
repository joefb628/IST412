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
public class ViewTreatmentsCntl 
{
    ViewTreatments vt = new ViewTreatments();
    ViewTreatmentsView vtv = new ViewTreatmentsView();
    ArrayList<String>treatments = new ArrayList<String>();
    
    /**
     * Constructor for the ViewTreatmentsCntl class
     */
    
    public ViewTreatmentsCntl()
    {
        treatments = vt.getTreatments(0);
    }

    public ArrayList<String> getTreatments() {
        return treatments;
    }
    
    
}
