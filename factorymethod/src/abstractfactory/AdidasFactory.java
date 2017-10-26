/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author Samuli Käkönen
 */
public class AdidasFactory extends Vaatteet{
    @Override
    public Lippis pueLippis() {
        return new AdLippis();
    }
    
    @Override
    public Tpaita pueTpaita() {
        return new AdTpaita();
    }
    
    @Override
    public Housut pueHousut() {
        return new AdHousut();
    }
    
    @Override
    public Kengat pueKengat() {
        return new AdKengat();
    }
}
