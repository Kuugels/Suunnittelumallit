/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Samuli Käkönen
 */
public class ProxyMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        final Image image2 = new ProxyImage("HiRes_10MB_Photo2");
        final Image image3 = new ProxyImage("HiRes_10MB_Photo3");
        final Image image4 = new ProxyImage("HiRes_10MB_Photo4");
        final Image image5 = new ProxyImage("HiRes_10MB_Photo5");
        
        List<Image> images = new ArrayList<Image>();
        
        images.add(image1);
        images.add(image2);
        images.add(image3);
        images.add(image4);
        images.add(image5);
        
        //Tulostaa valokuvien nimet
        for (Image img : images) {
            img.showData();
        }
        
        System.out.println("----------------------------------------------------");
        
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        String input = "";
        int pointer = 0;
        
        while (run) {
            
            System.out.println("Selaa kuvia: e = edellinen, s = seuraava, x = lopetus");
            
            input = scanner.nextLine();
            
            if (input.equals("e")) {
                if ((pointer - 1) >= 0) {
                    pointer -= 1;
                    images.get(pointer).displayImage();
                }else {
                    System.out.println("Ei edellisiä kuvia");
                }
            }else if (input.equals("s")) {
                if ((pointer + 1) < images.size()) {
                    pointer += 1;
                    images.get(pointer).displayImage();
                }else {
                    System.out.println("Ei enempää kuvia");
                }
            }else if (input.equals("x")){
                System.out.println("Ohjelma sulkeutuu");
                run = false;
            }else {
                System.out.println("Väärä input");
            }
        }
        
        
        /*
        image1.displayImage(); // loading necessary
        image1.displayImage(); // loading unnecessary
        image2.displayImage(); // loading necessary
        image2.displayImage(); // loading unnecessary
        image1.displayImage(); // loading unnecessary
        */
    }
    
}
