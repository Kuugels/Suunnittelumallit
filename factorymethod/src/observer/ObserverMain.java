/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author Samuli Käkönen
 */
public class ObserverMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClockSubject gello = new ClockSubject();
        DigitalClock dg = new DigitalClock();
        
        gello.addObserver(dg);
        
        gello.tick();
        gello.tick();
        gello.tick();
    }
    
}
