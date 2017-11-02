/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Samuli Käkönen
 */
public class ClockObservable extends Observable implements Runnable {

    int seconds;
    int minutes;
    int hour;

    public ClockObservable() {
        seconds = 0;
        minutes = 0;
        hour = 0;
    }

    public void tick() {
        if (seconds >= 59) {
            seconds = 0;
            if (minutes >= 59) {
                minutes = 0;
                if (hour >= 23) {
                    hour = 0;
                    minutes = 0;
                }else {
                    hour++;
                }
            }else {
                minutes++;
            }
        }else {
            seconds++;
        }

        setChanged();
        notifyObservers();
    }

    public void getTime() {
        System.out.println("Time: " + hour + ":" + minutes + ":" + seconds);
    }

    public void run() {
        int i = 1;
        while (i < 100) {
            tick();
            try {
                //Aika laitettu testauksen vuoksi menemään vähän nopeemmin
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(ClockObservable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
