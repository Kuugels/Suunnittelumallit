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
public class Tietokone {

    OsaOtus nayttis;
    OsaOtus muisti1;
    OsaOtus muisti2;
    OsaOtus prossu;
    OsaOtus verkkokortti;

    OsaOtus emo;
    OsaOtus kotelo;

    public void luoKone() {
        nayttis = new Naytonohjain(350);
        muisti1 = new Muistipiiri(60);
        muisti2 = new Muistipiiri(60);
        prossu = new Prosessori(250);
        verkkokortti = new Verkkokortti(30);
        
        emo = new Emolevy(100);
        kotelo = new Kotelo(100);
        
        emo.addOsa(nayttis);
        emo.addOsa(muisti1);
        emo.addOsa(muisti2);
        emo.addOsa(prossu);
        emo.addOsa(verkkokortti);
        kotelo.addOsa(emo);

        System.out.println(emo.toString());
        System.out.println(kotelo.toString());
    }
}
