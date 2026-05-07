/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forloopssurprisetest;

import javax.swing.*;

/**
 *
 * @author natha
 */
public class ForLoopsSurpriseTest {
    
    public static void main(String[] args) {
   
// Note: Teacher would prefer we use += or -= (ie. i+=2 istead of i++)        

// --- Question 1 ---

    // Question 1.1
        for (int i = 3; i < 9; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
        
    // Question 1.2
        for (int i = 16; i >= 9; i--) {
            System.out.print(i + " ");
        }
        System.out.println("");
    
    // Question 1.3
        for (int i = 3; i <= 17; i++) {
            System.out.print(i + " ");
            i = i+1;
        }
        System.out.println("");
        
    // Question 1.4
        for (int i = 4; i >= -6; i--) {
            System.out.print(i + " ");
            i = i-1;
        }
        System.out.println("");
        
    // Question 1.5 -- 1 4 9 16 25 36 49 64 81 100 121
        int squareNum = 1;
        for (int i = 0; i < 11; i++) {
            System.out.print(squareNum*squareNum + " ");
            squareNum = squareNum+1;
        }

    // Question 1.6 -- 1 2 4 8 16 32 64
        int doubles = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print("");
        }

    // Question 1.7
        for (int i = 0; i < 10; i++) {
            
        }
        
        System.out.println("");
        
    // Question 1.8
        for (char ch = 65; ch < 91; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println("");
        
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println("");
        
    // Question -- A   B   D  G  K  P  V
        int spacer = 0;
        for (char ch = 65; ch < 91; ch++) {
            System.out.print(ch + " ");  
            ch += spacer;
            spacer++;
        }
        System.out.println("");
        
    // Question 2 - Rectangle/Square
        int height = Integer.parseInt(JOptionPane.showInputDialog("Enter height"));
        int width = Integer.parseInt(JOptionPane.showInputDialog("Enter width"));
        String pattern = JOptionPane.showInputDialog("Enter pattern");
    
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(pattern + " ");
            }
        System.out.println("");
        }
        
    // M a t t
        String name = "Matt";
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
        System.out.println("");
    
    // M
    // a
    // t
    // t
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
        System.out.println("");

        
        
    }
}
