/*
 * Spare-time practice - loops + strings (same ballpark as ForLoops* and WordControl).
 * Work through the parts in order; uncomment each block as you go.
 */
package sparetimechallenge;

/**
 *
 * @author natha
 */
@SuppressWarnings("unused")
public class SpareTimeChallenge {

    public static void main(String[] args) {

        // --- Part 1: Double streak ------------------------------------------
        // Print exactly (spaces between numbers, newline at the end):
        // 1 2 4 8 16 32 64 128
        // Use one int variable, double it each iteration. Watch out for the
        // "wrong accumulator" bug you hit in ForLoopsAgain on the powers of two.

            for (int i = 1; i < 129; i*=2) {
                System.out.print(i + " ");
            }
            System.out.println("");
        // --- Part 2: String staircase -----------------------------------------
        // For this word, print a growing prefix on each line:
        // C
        // CO
        // COD
        // CODE
        String word = "CODE";
        //
        // YOUR CODE HERE (nested loop OR one loop with substring - your choice)
            for (int i = 0; i < word.length(); i++) {
                System.out.println(word.substring(0, i+1));


        // --- Part 3: Hollow box ---------------------------------------------
        // For side length n = 5, print a hollow rectangle of stars:
        // *****
        // *   *
        // *   *
        // *   *
        // *****
        // Inner rows: star, spaces, star. Corners are stars.
        int n = 5;
        //
        // YOUR CODE HERE (nested loops: outer = row, inner = column)


        // --- Part 4 (stretch): vowel census ---------------------------------
        // Count how many vowels (a, e, i, o, u - uppercase counts too) appear in:
        String sentence = "For loops and strings are a great mix";
        //
        // YOUR CODE HERE (loop + charAt, or loop over chars another way you like)


        // --- Part 5 (stretch): Caesar peek ----------------------------------
        // Each letter in cipher is shifted back by 1 in the alphabet to read the message.
        // Example: if cipher had 'B' it meant 'A'. Decode and print the plaintext.
        // Non-letters can stay as-is; only tweak A-Z and a-z.
        String cipher = "Ifmmp! Xpsme! Jt! b! opdl! pg! mpwf.";
        //
        // YOUR CODE HERE

    }
}
