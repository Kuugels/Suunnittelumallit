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
public class ConvertArray implements ListConverter{
    
    private String[] array;
    private String x;

    public String listToString(List list) {
        array = (String[])list.toArray(new String[0]);
        x = "";
        for (int i = 0; i < array.length; i++) {
            x += array[i] + "\n";
        }
        return x;
    }
    
}
