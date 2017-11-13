/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author Samuli Käkönen
 */
public class StateMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pelihahmo maokai = new Maokai();
        GameState s1 = new EarlygameState();
        GameState s2 = new MidgameState();
        GameState s3 = new EndgameState();
        
        maokai.changeState(s1);
        System.out.println(maokai.toString());
        
        maokai.changeState(s2);
        System.out.println(maokai.toString());
        
        maokai.changeState(s3);
        System.out.println(maokai.toString());
    }
    
}
