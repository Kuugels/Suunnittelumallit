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
public abstract class AbstractComputer {
    
    Computer computer;
    Singleton user;
    
    public AbstractComputer(Singleton s) {
        this.user = s;
    }
    
    public void setComp() {
        computer = comp();
    }
    
    public abstract Computer comp();
    
    public void login() {
        computer.login();
        computer.logInfo();
    }
    
    public void logout() {
        computer.logout();
        computer.logInfo();
    }
}
