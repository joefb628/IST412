/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewtreatments;

import java.util.PriorityQueue;

/**
 *
 * @author Brian
 */
public class ViewTreatmentsCntl 
{
    /**
     * Constructor for the ViewTreatmentsCntl class
     */
    
    PriorityQueue<String> treatments = new PriorityQueue<>();

    public ViewTreatmentsCntl() {
        ViewTreatments vt = new ViewTreatments();
        treatments = vt.getTreatments();
        ViewTreatmentsView vtv = new ViewTreatmentsView(treatments);
    }
    public PriorityQueue<String> getTreatments() {
        return treatments;
    }
}