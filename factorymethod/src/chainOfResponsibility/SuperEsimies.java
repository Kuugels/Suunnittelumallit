/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainOfResponsibility;

/**
 *
 * @author Samuli Käkönen
 */
public class SuperEsimies extends Palkankorotus{

    @Override
    protected double maxKorotus() {
        return KOROTUS * 5;
    }

    @Override
    protected String getRooli() {
        return "Super esimies";
    }
    
}
