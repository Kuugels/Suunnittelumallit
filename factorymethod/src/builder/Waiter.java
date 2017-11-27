/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Samuli Käkönen
 */
public class Waiter {
    private BurgerBuilder bb;
    
    public void setBurgerBuilder(BurgerBuilder bb) {
        this.bb = bb;
    }
    
    public Burger getBurger() {
        return bb.getBurger();
    }
    
    public void constructBurger() {
        bb.createNewBurger();
        bb.buildBurger();
    }
}
