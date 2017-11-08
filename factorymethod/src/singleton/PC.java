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
public class PC implements Computer{
    
    private Singleton user;
    
    public PC(Singleton s) {
        this.user = s;
    }

    public void logInfo() {
        if (user.logInfo()) {
            System.out.println("Logged in from PC");
        }else {
            System.out.println("User not logged in");
        }
    }

    public void login() {
        if (!user.logInfo()) {
            user.logIn();
        }
    }

    public void logout() {
        if (user.logInfo()) {
            user.logOut();
        }
    }
    
    
    
}
