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
public class BossFactory extends Vaatteet{
    @Override
    public Lippis pueLippis() {
        return new BossLippis();
    }
    
    @Override
    public Tpaita pueTpaita() {
        return new BossTpaita();
    }
    
    @Override
    public Housut pueHousut() {
        return new BossHousut();
    }
    
    @Override
    public Kengat pueKengat() {
        return new BossKengat();
    }
}
