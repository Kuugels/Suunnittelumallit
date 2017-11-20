/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author Samuli Käkönen
 */
public class MementoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Asiakas asiakas = new Asiakas("Pena");
        Asiakas ruuben = new Asiakas("Ruuben");
        Arvuuttaja arvuuttaja = new Arvuuttaja();
        
        asiakas.pelinAvaus(arvuuttaja.liityPeliin());
        ruuben.pelinAvaus(arvuuttaja.liityPeliin());
        
        asiakas.arvaus(arvuuttaja);
        asiakas.arvaus(arvuuttaja);
        asiakas.arvaus(arvuuttaja);
        asiakas.arvaus(arvuuttaja);
        System.out.println("");
        ruuben.arvaus(arvuuttaja);
        ruuben.arvaus(arvuuttaja);
        ruuben.arvaus(arvuuttaja);
        ruuben.arvaus(arvuuttaja);
    }
    
}
