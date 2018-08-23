//created by Michael Kuhn

import java.util.*;

public class baseConverter {
    // Check # >= 0
    public static int prompt(String msg) {
        Scanner kb = new Scanner(System.in);

        System.out.println(msg);
        int x = (int) kb.nextDouble();

        if (x < 0) {
          x = prompt("It has to greater than or equal to 0! Enter new integer:");
        }

        kb.close();

        return x;
    }

    public static void main(String[] args) {

		// User Input
        int num = prompt("Enter an Integer Greater Than or Equal to 0 (in base 10):");
        int d;

        //Conversion
        String[] converted = new String[35];

        for(int b = 0; b < converted.length; b++) {

          d = num;
          converted[b] = "";

          while(d > 0) {

            int next = d%(b + 2);
            converted[b] = next > 10 ? (char)(next+55) + converted[b] : next + converted[b];

            d /= (b + 2);

          }

        }

        //Print
        System.out.println("\nThe (base 10) number " + num + ":");

        for(int b = 0; b < converted.length; b++) {
          System.out.println("Base " + (b+2) + " = " + converted[b]);
        }
	}
}
