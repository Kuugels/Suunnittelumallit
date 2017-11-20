/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author Samuli Käkönen
 */
public class Asiakas extends Thread{
    
    private boolean arvattu = false;
    private String nimi;
    private int arvausKerrat = 0;
    private Object obj;
    
    public Asiakas(String nimi) {
        this.nimi = nimi;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public void pelinAvaus(Object obj) {
        this.obj = obj;
    }
    
    public void arvaus(Arvuuttaja arvuuttaja) {
        int luku = 1 + (int)(Math.random() * 10);
        System.out.println("Asiakkaan arvottu arvaus: " + luku);
        arvuuttaja.vertaa(obj, luku);
    }
}
