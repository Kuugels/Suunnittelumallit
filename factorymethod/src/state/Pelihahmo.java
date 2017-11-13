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
public abstract class Pelihahmo {
    
    private int hp;
    private int armor;
    private int mr;
    private int dmg;
    private GameState state;
    
    public void changeState(GameState gs) {
        state = gs;
        hp = gs.setHp();
        armor = gs.setArmor();
        mr = gs.setMr();
        dmg = gs.setDmg();
        System.out.println("-----STATE CHANGED-----");
    }
    
    public String toString() {
        return "Max HP: " + hp + " Armor: " + armor + " Magic resist: " + mr + " Damage: " + dmg;
    }
}
