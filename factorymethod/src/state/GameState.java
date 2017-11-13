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
public interface GameState {
    public abstract int setHp();
    public abstract int setArmor();
    public abstract int setMr();
    public abstract int setDmg();
    public abstract int status();
}
