/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forloopssurprisetest2;

import javax.swing.*;

import static java.lang.Math.pow;

/**
 *
 * @author natha
 */
public class ForLoopsSurpriseTest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Question 1
        String country = "Denmark";

    // Question 2
        System.out.println("\"" + country + "\"" + " contains " + country.length() + " characters.");

        String countryUPPER = country.toUpperCase();
        System.out.println("All Caps: " + countryUPPER);

        String COUNTRYlower = country.toLowerCase();
        System.out.println("No Caps: " + COUNTRYlower);

    System.out.println();

    // Question 3.1
        int letter = 0;
        for (int i = 0; i < country.length(); i++) {
            System.out.println(country.charAt(letter));
            letter = letter + 1;
        }
    System.out.println();

    // Question 3.2
        int lastLetter = country.length() - 1;
        for (int i = 0; i < country.length(); i++) {
            System.out.print(country.charAt(lastLetter) + " ");
            lastLetter = lastLetter - 1;
        }
    System.out.println();

    // Question 3.3
                                            // First Attempt
                                                //        int evenLetters = 0;
                                                //        for (int i = 0; i < (country.length()/2 + 1); i++) {
                                                //            System.out.print(country.charAt(evenLetters));
                                                //            evenLetters = evenLetters + 2;
                                                //        }

        for (int evenLetters = 0; evenLetters < country.length(); evenLetters+=2) {
            System.out.print(country.charAt(evenLetters));
        }
    System.out.println();

        // Question 4
            int total = 0;
            for (int i = 0; i < country.length(); i++) {
                total += country.charAt(i);
            }
            System.out.println(total);
            System.out.println();

        // Question 5
            System.out.print("" + country.charAt(5) + country.charAt(4) + country.charAt(3) + country.charAt(1) + country.charAt(2));
        System.out.println();

                        // Teachers Memo
                        System.out.println(
                                        country.substring(5,6)
                                        + country.substring(4,5)
                                        + country.substring(3,4)
                                        + country.substring(1,3)
                                        );
                        System.out.println();

        // Question 6.1 -- 10 20 30 40 50
            for (int startingTen = 10; startingTen <= 50; startingTen +=10) {
                System.out.print(startingTen + " ");
            }
        System.out.println();

        // Question 6.2 -- 52 55 58 61 64 67 70
            for (int i = 52; i <= 70; i+=3) {
                System.out.print(i + " ");
            }
        System.out.println();

        // Question 6.3 -- 99 88 77 66 55 44 33 22 11
            for (int i = 99; i >= 11; i-=11) {
                System.out.print(i + " ");
            }
        System.out.println();

        // Question 6.4 -- 1 8 27 64 125 216 343 512 729
        for (int i = 1; i <= 9; i++) {
            System.out.print((int) pow(i, 3) + " ");
        }
        System.out.println();

        // Question 6.5 -- A B D G K P V
        int increasingNumber = 1;
        for (char i = 65; i <= 86; i++) {
            System.out.print(i*increasingNumber + " ");
            increasingNumber = increasingNumber + 1;
        }

        // Question 6.6 -- cjqx
            for (char ch = 'c'; ch < 'y'; ch+=7) {
                System.out.print(ch);
            }
        System.out.println();

        // Question 7 -- Rectangle
        int height = Integer.parseInt(JOptionPane.showInputDialog("Enter height"));
        int width = Integer.parseInt(JOptionPane.showInputDialog("Enter width"));
        String pattern = JOptionPane.showInputDialog("Enter pattern");
        String pattern2 = JOptionPane.showInputDialog("Enter pattern");

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(pattern + " ");
            }
            System.out.println();
        }
        }
}
