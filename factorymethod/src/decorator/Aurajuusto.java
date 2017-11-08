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
public class Aurajuusto extends PizzaDecorator{
    
    public Aurajuusto(Pizza lisattavaAines) {
        super(lisattavaAines);
    }
    
    @Override
    public int getHinta() {
        return super.getHinta() + 2;
    }

    @Override
    public String getKuvaus() {
        return super.getKuvaus() + " aurajuusto ";
    }
    
}
