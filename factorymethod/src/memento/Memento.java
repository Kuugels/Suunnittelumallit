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
public class Memento {
    private final int luku;
    
    public Memento(int luku) {
        this.luku = luku;
    }
    
    public int getLuku() {
        return luku;
    }
}
