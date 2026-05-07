/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fortheloveofloops;

/**
 *
 * @author natha
 */
public class ForTheLoveOfLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        // 2 4 6 8 10 12 14
        int two = 2;
        for (int i = 2; i < 10; i++) {
            System.out.print(two + " ");
            two = two + 2;
        }
        System.out.println("");
        
                // Teacher Memo
                for (int i = 0; i < 15; i+=2) {
                    System.out.print(i + " ");
                }
                System.out.println("");
        
        // -1 1 3 5 7 9
        int starter = -1;
        for (int i = 0; i < 10; i++) {
            System.out.print(starter + " ");
            starter = starter + 2;
        }
        
                // Teacher Memo
                for (int i = -1; i < 10; i+=2) {
                    System.out.print(i + " ");
                }
                System.out.println("");
                
        // 224 222 220 218 216
        
        
                // Teacher Memo
                for (int i = 224; i > 215; i+=2) {
                    System.out.print(i + " ");
                    }
                System.out.println("");
        
        // 1001 999 997 995 993 991
        
                // Teacher Memo
                for (int i = 1001; i > 990; i-+2) {
                    System.out.print(i + " ");
                            }
                System.out.println("");
        
        // 1 9 25 49 81
        
                // Teacher Memo
                for (int i = 1; i < 10; i+=2) {
                        System.out.print(i*i + " ");
                            }
                System.out.println("");
        
        System.out.println("");
        // 1 3 9 27 81 243 729
        
                // Teacher Memo
                for (int i = 0; i < 7; i++) {
                    System.out.print((int)Math.pow(3,i) + " ")
                }
                System.out.println("");

        }
    }
    
}
