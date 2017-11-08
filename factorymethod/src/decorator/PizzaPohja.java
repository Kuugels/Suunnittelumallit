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
public class PizzaPohja implements Pizza{

    private int hinta;
    private String kuvaus;
    
    public PizzaPohja() {
        this.kuvaus = "Pizzapohja";
        this.hinta = 4;
    }
    
    public int getHinta() {
        return this.hinta;
    }

    public String getKuvaus() {
        return this.kuvaus;
    }
    
}
