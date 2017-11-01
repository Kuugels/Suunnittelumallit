/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author Samuli Käkönen
 */
public interface Laiteosa {
    public abstract int getHinta();
    public abstract void addOsa(Laiteosa osa);
}
