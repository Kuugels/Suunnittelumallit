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
public class DecoratorMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pizza pizza1 = new Kinkku(new Aurajuusto(new Kebab(new PizzaPohja())));
        Pizza pizza2 = new Jalapeno(new Kebab(new Kinkku(new PizzaPohja())));
        Pizza pizza3 = new Aurajuusto(new Jalapeno(new Kebab(new PizzaPohja())));
        
        System.out.println("Ensimmäinen pizza: " + pizza1.getKuvaus());
        System.out.println("Hinta: " + pizza1.getHinta() + "e");
        System.out.println("----------------------------------------------------");
        
        System.out.println("Toinen pizza: " + pizza2.getKuvaus());
        System.out.println("Hinta: " + pizza2.getHinta());
        System.out.println("----------------------------------------------------");
        
        
        System.out.println("kolmas pizza: " + pizza3.getKuvaus());
        System.out.println("Hinta: " + pizza3.getHinta());
        System.out.println("----------------------------------------------------");
    }
    
}
