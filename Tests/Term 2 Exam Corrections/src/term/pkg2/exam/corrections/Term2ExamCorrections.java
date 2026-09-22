/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package term.pkg2.exam.corrections;

/**
 *
 * @author natha
 */
public class Term2ExamCorrections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Q2.5
            int visitors = 532;
            int groupSize = 20;
            
            System.out.println(visitors + " vistors will be split into " +
                    (visitors / groupSize) + " groups with " +
                    (visitors % groupSize) + " visitors remaining for one last group.");
            
        // Q2.6
        double globeRad = 6.371;
        double surArea = 4 * Math.PI * (Math.pow(globeRad, 2.0));
        
        // Unknown Question
        //              01234567
        String theme = "vacation";
        System.out.println(theme.length());
        System.out.println(theme.charAt(0));
        
        System.out.println("" + theme.charAt(0) + theme.charAt(6) + theme.substring(2));
       
        // v a c a t i o n
        
        System.out.println("");
        int letter = 0;
        for (int i = 0; i < theme.length(); i++) {
            System.out.print(theme.charAt(letter) + " ");
            letter += 1;
        }
        
// noitacav
System.out.println("");
int backLetter = theme.length() - 1;
for (int i = theme.length() - 1; i >= 0; i--) {
    System.out.print(theme.charAt(backLetter) + " ");
    backLetter = backLetter - 1;
}
            
        System.out.print(theme.charAt(letter) + 0);
        
    }
    
}
