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
public interface VaateFactory {
    public abstract Lippis pueLippis();
    public abstract Tpaita pueTpaita();
    public abstract Housut pueHousut();
    public abstract Kengat pueKengat();
}
