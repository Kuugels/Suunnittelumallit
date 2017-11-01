/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;

/**
 *
 * @author Samuli Käkönen
 */
public class Kotelo extends OsaOtus{
    ArrayList<Laiteosa> childList = new ArrayList<Laiteosa>();
    
    public Kotelo(int hinta) {
        this.hinta = hinta;
    }
    
    @Override
    public void addOsa(Laiteosa osa) {
        childList.add(osa);
    }
    
    public int osienHinta() {
        int summa = 0;
        for (Laiteosa osa : childList) {
            summa += osa.getHinta();
        }
        return summa;
    }
    
    public String toString() {
        return "Kotelon hinta: " + this.hinta + " Sisällä olevien osien yhteishinta: " + osienHinta() + " Koneen kokonaishinta: " + (osienHinta()+this.hinta);
    }
}
