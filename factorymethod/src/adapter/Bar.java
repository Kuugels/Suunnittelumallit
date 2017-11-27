/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author Samuli Käkönen
 */
public class Bar {
    String beer1;
    String beer2;
    
    public Bar(String beer1, String beer2) {
        this.beer1 = beer1;
        this.beer2 = beer2;
    }
    
    public String getBeer1() {
        return this.beer1;
    }
 
    public String getBeer2() {
        return this.beer2;
    }
    
}
