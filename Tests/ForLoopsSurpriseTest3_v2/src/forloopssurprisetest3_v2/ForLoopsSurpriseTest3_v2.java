/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forloopssurprisetest3_v2;

import javax.swing.JOptionPane;

/**
 *
 * @author natha
 */
public class ForLoopsSurpriseTest3_v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Question 1.1 (2)
        String brand = JOptionPane.showInputDialog("Enter the brand name.");
        String product = JOptionPane.showInputDialog("Enter the product name.");
        
    // Question 1.2 (6)
        System.out.println("You entered the following words:");
        System.out.println("\"" + brand + "\"" + " - " + brand.length() + " characters - All Caps: " + brand.toUpperCase());
        System.out.println("\"" + product + "\"" + " - " + product.length() + " characters - No Caps: " + product.toLowerCase());
        
    System.out.println("");
    
    // Question 1.3 (2)
        System.out.println(product.charAt(0) + brand.substring(1)
            + " " + brand.charAt(0)+ product.substring(1));
    System.out.println("");
    
    // Question 1.4 (4)
       int brandChar = 0;
        for (int i = 0; i < brand.length(); i++) {
            System.out.print(brand.charAt(brandChar) + " ");
            brandChar += 1;
        }
        
        int productChar = product.length() - 1;
        for (int i = 0; i < product.length(); i++) {
            System.out.print(product.charAt(productChar) + " ");
            productChar -= 1;
        }
        System.out.println("");
        
    // Question 1.5 (3)
    
        String temp = brand + product;
        int total = 0;

        for (int i = 0; i < temp.length(); i++) {
            total += temp.charAt(i);
        }

        System.out.println(total);

    // Question 1.6 (4)
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print(joined.charAt(counter) + " ");
            counter++;
        }
        System.out.println("");
        
    }
    
}
