/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainOfResponsibility;

/**
 *
 * @author Samuli Käkönen
 */
public class ChainOfResponsibilityMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Esimies esimies = new Esimies();
        SuperEsimies superEsimies = new SuperEsimies();
        Toimitusjohtaja tj = new Toimitusjohtaja();
        
        esimies.setSuccessor(superEsimies);
        superEsimies.setSuccessor(tj);
        
        int[] tyäukot = new int[10];
        
        for (int i = 0; i < 9; i++) {
            tyäukot[i] = 1 + (int)(Math.random() * 10);
        }
        
        for (int i = 0; i < 9; i++) {
            System.out.println("-------TYÄ_UKKO NRO." + (i+1));
            esimies.processRequest(new KorotusPyynto(tyäukot[i]));
            System.out.println("");
        }
        
    }
    
}
