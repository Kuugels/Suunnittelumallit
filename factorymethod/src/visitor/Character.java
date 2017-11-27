/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

/**
 *
 * @author Samuli Käkönen
 */
public abstract class Character {
    private String name;
    private int lvl;
    
    public abstract void getName();
    public abstract int getLvl();
    public abstract void addXp(int xp);
    //public abstract accept(BonusVisitor visitor);
}
