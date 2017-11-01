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
public class Emolevy extends OsaOtus{
    
    ArrayList<Laiteosa> childList = new ArrayList<Laiteosa>();
    
    public Emolevy(int hinta) {
        this.hinta = hinta;
    }
    
    @Override
    public void addOsa(Laiteosa osa) {
        childList.add(osa);
    }
    
    @Override
    public int getHinta() {
        int summa = 0;
        for (Laiteosa osa : childList) {
            summa += osa.getHinta();
        }
        return summa;
    }
    

    
    @Override
    public String toString() {
        return "Emolevyn hinta: " + this.hinta + " Liitettyjen osien hinta: " + (getHinta()-this.hinta);
    }
}
