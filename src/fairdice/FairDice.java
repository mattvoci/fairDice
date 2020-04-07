/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fairdice;

import java.util.Random;

/**
 *
 * @author mattv
 */
public class FairDice {

    /**
     * @param randGenerator
     */
    public static void printDiceRolls(Random randGenerator) {
        for (int i = 0; i < 100; i++) {
            System.out.println(randGenerator.nextInt(6) + 1);
        }
    }
    public static void main(String[] args) {
        Random randGenerator = new Random();
        printDiceRolls(randGenerator);
        
    }
    
}
