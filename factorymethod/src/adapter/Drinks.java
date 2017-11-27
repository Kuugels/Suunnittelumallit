/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author Samuli Käkönen
 */
public class Drinks extends Bar implements BarDrinks{

    public Drinks(String beer1, String beer2) {
        super(beer1, beer2);
    }

    public String[] listOfDrinks() {
        String[] drinks = new String[2];
        drinks[0] = getBeer1();
        drinks[1] = getBeer2();
        return drinks;
    }
    
}
