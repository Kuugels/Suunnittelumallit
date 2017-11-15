/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Samuli Käkönen
 */
public class StrategyMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<String> list = new ArrayList();
        list.add("porkkana");
        list.add("hauki");
        list.add("juusto");
        list.add("apina");
        list.add("leipä");
        list.add("siirappi");
        list.add("peura");
        list.add("ping pong");
        
        ListConverter ca = new ConvertArray();
        ListConverter ci = new ConvertIterator();
        ListConverter cg = new ConvertListget();
        
        System.out.println(ca.listToString(list));
        System.out.println("----------------------------------------------------");
        
        System.out.println(ci.listToString(list));
        System.out.println("----------------------------------------------------");
        
        System.out.println(cg.listToString(list));
        
    }
    
}
