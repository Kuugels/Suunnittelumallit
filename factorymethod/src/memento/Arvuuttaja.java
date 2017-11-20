/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Samuli Käkönen
 */
public class Arvuuttaja {
    
    public Object liityPeliin() {
        int arvottuLuku = 1 + (int)(Math.random() * 10);
        System.out.println("Oikea luku:" + arvottuLuku);
        return new Memento(arvottuLuku);
    }
    
    public void vertaa(Object obj, int arvaus) {
        Memento memento = (Memento)obj;
        if (memento.getLuku() == arvaus) {
            System.out.println("Oikea luku!");
        }
    }
    
}
