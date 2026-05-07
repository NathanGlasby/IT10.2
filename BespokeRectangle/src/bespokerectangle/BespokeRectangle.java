/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bespokerectangle;

import javax.swing.JOptionPane;

/**
 *
 * @author natha
 */
public class BespokeRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Width
        String width = JOptionPane.showInputDialog("What is the width of your rectangle?");
        int widthInt = Integer.parseInt(width);

        // Height
        String height = JOptionPane.showInputDialog("What is the height of your rectangle?");
        int heightInt = Integer.parseInt(height);

        // String
        String pattern = JOptionPane.showInputDialog("Enter the pattern.");

        // Print in Terminal
        for (int i = 0; i < heightInt; i++) {
            for (int j = 0; j < widthInt; j++) {
                System.out.print(pattern);
            }
            System.out.println("");
            
        }
    }
}
