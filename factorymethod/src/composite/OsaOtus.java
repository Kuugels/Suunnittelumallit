/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author Samuli Käkönen
 */
public abstract class OsaOtus implements Laiteosa{
    
    int hinta;
    
    public void addOsa(Laiteosa osa) {
        
    }
    
    public int getHinta() {
        return this.hinta;
    }
    
}
