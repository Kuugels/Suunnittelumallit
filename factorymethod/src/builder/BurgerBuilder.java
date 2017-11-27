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
public abstract class BurgerBuilder {
    
    protected Burger burger;
    
    public Burger getBurger() {
        return burger;
    }
    
    public void createNewBurger() {
        burger = new Burger();
    }
    
    public abstract void buildBurger();
}
