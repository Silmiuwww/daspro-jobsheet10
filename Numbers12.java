import java.util.Arrays;
import java.util.Scanner;
public class Numbers12 {
    public static void main(String[] args) {
        
        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5]; 
        myNumbers[1] = new int[3]; 
        myNumbers[2] = new int[1]; 

        myNumbers[0][0] = 1; myNumbers[0][1] = 2; myNumbers[0][2] = 3; myNumbers[0][3] = 4; myNumbers[0][4] = 5;
        myNumbers[1][0] = 6; myNumbers[1][1] = 7; myNumbers[1][2] = 8;
        myNumbers[2][0] = 9;

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i+1) + ": " + myNumbers[i].length);
        }
    }
}

