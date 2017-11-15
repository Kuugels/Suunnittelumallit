/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import static java.util.Collections.list;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Samuli Käkönen
 */
public class ConvertIterator implements ListConverter{

    String lel = "";
    int x = 1;
    
    public String listToString(List list) {
        ListIterator itr = list.listIterator();
        while (itr.hasNext()) {
            if (x >= 2) {
                lel += itr.next() + " \n";
                x = 0;
            }else {
                lel += itr.next() + " ";
            }
            x++;
        }
        return lel;
    }
    
}
