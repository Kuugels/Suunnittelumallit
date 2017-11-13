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
public class EndgameState implements GameState{

    public int setHp() {
        return 3000;
    }

    public int setArmor() {
        return 150;
    }

    public int setMr() {
        return 150;
    }

    public int setDmg() {
        return 150;
    }

    public int status() {
        return 3;
    }
    
}
