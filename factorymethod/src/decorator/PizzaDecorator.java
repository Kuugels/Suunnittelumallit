/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Samuli Käkönen
 */
public abstract class PizzaDecorator implements Pizza{
    
    protected Pizza lisattavaAines;
    
    public PizzaDecorator(Pizza lisattavaAines) {
        this.lisattavaAines = lisattavaAines;
    }
    
    public int getHinta() {
        return this.lisattavaAines.getHinta();
    }
    
    public String getKuvaus() {
        return this.lisattavaAines.getKuvaus();
    }
    
}
