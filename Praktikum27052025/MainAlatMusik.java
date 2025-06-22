/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum27052025;

/**
 *
 * @author akels
 */
public class MainAlatMusik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Gitar gitar = new Gitar("Gitar Klasik", "Petik", 6);
        Keyboard keyboard = new Keyboard("Yamaha PSR", "Elektronik", true);
        
        System.out.println("--Info Gitar--");
        gitar.info();
        gitar.mainkan();
        gitar.stem();
        
        System.out.println();
        
        System.out.println("--Info Keyboard--");
        keyboard.info();
        keyboard.nyalakan();
        keyboard.mainkan();
        keyboard.stem();
        keyboard.matikan();
        
    }
    
}
