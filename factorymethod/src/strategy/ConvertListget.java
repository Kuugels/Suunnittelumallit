/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.List;

/**
 *
 * @author Samuli Käkönen
 */
public class ConvertListget implements ListConverter{
    
    String höhö = "";
    int hihi = 1;

    public String listToString(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (hihi >= 3) {
                höhö += list.get(i) + " \n";
                hihi = 0;
            }else {
                höhö += list.get(i) + " ";
            }
            hihi++;
        }
        return höhö;
    }
    
}
