/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Samuli Käkönen
 */
public class LaptopFactory extends AbstractComputer{
    Singleton s;
    
    public LaptopFactory(Singleton s) {
        super(s);
        this.s = s;
    }
    
    @Override
    public Laptop comp(){
        return new Laptop(s);
    }
}
