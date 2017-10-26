/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author Samuli Käkönen
 */
public abstract class Vaatteet {
    
    Lippis lippis;
    Tpaita tpaita;
    Housut housut;
    Kengat kengat;
    
    public Vaatteet() {
        
    }
    
    public abstract Lippis pueLippis();
    public abstract Tpaita pueTpaita();
    public abstract Housut pueHousut();
    public abstract Kengat pueKengat();
    
    public void pueVaatteet() {
        lippis = pueLippis();
        tpaita = pueTpaita();
        housut = pueHousut();
        kengat = pueKengat();
    }
    
   
    
    public void puetutVaatteet() {
        System.out.println("Päälläni on: \n" + lippis + tpaita + housut + kengat);
    }
}
