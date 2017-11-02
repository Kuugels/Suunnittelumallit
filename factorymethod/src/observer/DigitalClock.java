/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Samuli Käkönen
 */
public class DigitalClock implements Observer{
    
    private ClockSubject clock;
    
    private int minute;
    private int hour;
    
    public DigitalClock() {
        minute = 1;
        hour = 1;
    }

    public void update(Observable o, Object arg) {
        clock = (ClockSubject) o;
        clock.getTime();
    }

    
    
}
