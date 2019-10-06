/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist.pkg412.medical.application.scheduletreatments;

import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author Brian
 */
public class ScheduleTreatments 
{
    LinkedList<String> users = new LinkedList<String>();
    int ticketnum;
    Random rand = new Random();
    /**
     * constructor for the ScheduleTreatments class
     */
    
    public ScheduleTreatments()
    {
        //int userId = rand.nextInt(1000);
       // userId += 1;
        int userId = 100;
        users.add(userId,"John Doe");
    }
    
    /**
     *retrieves user information
     * requires user id input
     */
    
    public String getUser(int id)
    {
        return users.get(id);
    }
    
    /**
     * schedules treatment from user input
     * @returns ticket number
     */
    
    public int schedule(int id, int treatment)
    {
        return ticketnum;
    }
}
