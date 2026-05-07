/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wordcontrol;

/**
 *
 * @author natha
 */
public class WordControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //             012345
        String name = "Nathan";
        
    /*
    N
    a
    t
    h
    a
    n
        */
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
         
        }
        System.out.println("");
        
    // Nathan
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
        System.out.println("");
        
    // nahtaN
        for (int i = name.length()-1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
        System.out.println("");
        
    }
    
}
