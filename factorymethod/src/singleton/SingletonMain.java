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
public class SingletonMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Singleton user = Singleton.getInstance();
        
        AbstractComputer pc = new PCfactory(user);
        
        pc.setComp();
        pc.login();
        pc.logout();
        
        pc = new LaptopFactory(user);
        pc.setComp();
        pc.login();
    }
    
}
