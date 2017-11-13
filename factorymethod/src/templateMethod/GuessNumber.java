/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templateMethod;

import java.util.Scanner;

/**
 *
 * @author Samuli Käkönen
 */
public class GuessNumber extends Game{

    Scanner lukija = new Scanner(System.in);
    int curPlayer;
    int num;
    
    @Override
    void initializeGame() {
        winner = 1 +(int)(Math.random() * 10);
        System.out.println(winner);
    }

    @Override
    void makePlay(int player) {
        curPlayer = player;
        System.out.println("Pelaaja " + player + ": ");
        num = lukija.nextInt();
        if (num > winner) {
            System.out.println("Smaller");
        }else if (num < winner) {
            System.out.println("Bigger");
        }
    }

    @Override
    boolean endOfGame() {
        if (num == winner) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    void printWinner() {
        System.out.println("Player " + curPlayer + " wins the game!");
    }
    
}
