/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Observable;

/**
 *
 * @author Samuli Käkönen
 */
public class ClockSubject extends Observable{
    
    int minutes;
    int hour;
    
    public ClockSubject() {
        minutes = 1;
        hour = 0;
    }
    
    public void tick() {
        minutes++;
        setChanged();
        notifyObservers();
    }
    
    public void getTime() {
        System.out.println("GEllO :D " + minutes);
    }
    
    
    
}
