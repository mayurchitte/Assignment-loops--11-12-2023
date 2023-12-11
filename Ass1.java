import java.util.Scanner;
import java.util.Arrays;
public class Ass1 {
    public static void main(String[] args) {
        int[] profits = {12, 18, 20, 38, 53, 93, 77, 61, 59, 56};

        for (int i = 1; i < profits.length; i++) {
            if (profits[i] > profits[i + 1]) {
                System.out.print(i+1+2001);
                break;
            }
        }
     
    }
}


    




    


