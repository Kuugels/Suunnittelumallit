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
public class MidgameState implements GameState{

    public int setHp() {
        return 1000;
    }

    public int setArmor() {
        return 80;
    }

    public int setMr() {
        return 80;
    }

    public int setDmg() {
        return 100;
    }

    public int status() {
        return 2;
    }
    
}
