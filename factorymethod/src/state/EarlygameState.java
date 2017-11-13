/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author Samuli Käkönen
 */
public class EarlygameState implements GameState{

    public int setHp() {
        return 300;
    }

    public int setArmor() {
        return 20;
    }

    public int setMr() {
        return 20;
    }

    public int setDmg() {
        return 50;
    }

    public int status() {
        return 1;
    }

    
}
