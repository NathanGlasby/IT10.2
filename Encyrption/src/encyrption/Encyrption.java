/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encyrption;

/**
 *
 * @author natha
 */
public class Encyrption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String word = "Send troops";
        String encryptedWord = "";
        int key = 5;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            ch = (char)(ch + key);
            encryptedWord += ch;
        }
        System.out.println(word);
        System.out.println(encryptedWord);
        }



//
        // Unfinished decryption exercise (preserved for later).
        // String decryptedWord = "";
        // for (int i = 0; i < encyrptedWord.
        
    }
    
