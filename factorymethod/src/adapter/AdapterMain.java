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
public class AdapterMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BarDrinks listOfDrinks = new Drinks("Heineken", "Karhu");
        
        for (String drink : listOfDrinks.listOfDrinks()) {
            System.out.println("Drink1: " + drink);
        }
    }
    
}
