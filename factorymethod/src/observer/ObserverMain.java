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
        ClockObservable clock = new ClockObservable();
        DigitalClock dc = new DigitalClock();

        clock.addObserver(dc);
        
        clock.run();

    }

}
