/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forloopsyetagain;

/**
 *
 * @author natha
 */
public class ForLoopsYetAgain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    //  UPPERCASE ALPHABET
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println("");
        
    // lowercase alphabet
        for (char abc = 'a'; abc <= 'z'; abc++) {
            System.out.print(abc + " ");
        }
        System.out.println("");
    
    // b d f ... v x z
        for (char ch = 97; ch < 123; ch+=2) {
            System.out.print(ch + " ");
        }
        System.out.println("");
        
    // Z Y X ... C B A
        for (char ch = 90; ch > 65; ch-=2) {
            System.out.print(ch + " ");
        }
        System.out.println("");
    
    // y w u ... e c a
        for (char ch = 121; ch >= 97; ch-=2) {
            System.out.print(ch + " ");
        }
        System.out.println("");
    }
    
    
}
