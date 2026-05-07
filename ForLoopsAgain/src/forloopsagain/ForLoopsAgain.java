/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forloopsagain;

/**
 *
 * @author natha
 */
public class ForLoopsAgain {

    
// 0 1 2 3 4 5 6 7 8 9
    public static void main(String[] args) {
        
    for (int i = 0; i < 10; i++) {
    System.out.print(i + " ");
    }
System.out.println(" ");

// 0 10 20 30 40 50 60 70
    for (int i = 0; i < 71; i+=10) {
    System.out.print(i + " ");
    }
System.out.println("");    

// 10 8 6 4 2
    for (int i = 10; i > 0; i-= 2) {
            System.out.print(i + " ");
    }
System.out.println("");
        
// 1 4 16 25 36 49 64 81
    for (int i = 1; i < 10; i++) {
        System.out.print(i*i + " ");
    }
System.out.println("");

// 1 8 27 64 125 216
    for (int i = 1; i < 7; i++) {
        System.out.print(i*i*i + " ");
    }
System.out.println("");

// 0 1 3 6 10 15 21 28 36 45
    int num = 0;
    for (int i = 0; i < 10; i++) {
        num = num + i;
        System.out.print(num + " ");
    }
System.out.println("");

// 1 2 4 7 11 16 22 29 37 46
    int num2 = 1;
    for (int i = 0; i < 10; i++) {
        num2 = num2 + i;
        System.out.print(num2 + " ");
    }
System.out.println("");

// 1 2 4 8 16 32 64 128 || THIS IS BROKEN, TODO: FIX
    int num3 = 1;
    for (int i = 0; i < 8; i++) {
        System.out.print(num3 + " ");
        num = num3 * 2;
        }
System.out.println("");

// A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
        for (char ch = 65; ch < 91; ch++) {
            System.out.print(ch + " ");
        }
System.out.println("");
        
// a b c d e f g h i j k l m n o p q r s t u v w x y z
        for (char ch = 97; ch < 123; ch++) {
            System.out.print(ch + " ");
        }
    }
}



