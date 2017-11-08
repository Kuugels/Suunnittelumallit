/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Samuli Käkönen
 */
public class Singleton {
    
    private static Singleton INSTANCE = null;
    
    private boolean loggedIn = false;
    
    private Singleton() {
        
    }
    
    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
    
    public void logIn() {
        loggedIn = true;
    }
    
    public void logOut() {
        loggedIn = false;
    }
    
    public boolean logInfo() {
        return loggedIn;
    }
}
