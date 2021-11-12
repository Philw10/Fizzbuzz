package com.philsprogram;

public class Main {

    public static void main(String[] args) {

        for (int n = 1; n <= 100; n++) {
            String displayValue = "";
            if (n % 3 == 0)
                displayValue += "Fizz";

            if (n % 13 == 0)
                displayValue += "Fezz";

            if (n % 5 == 0)
                displayValue += "Buzz";

            if (n % 7 == 0)
                displayValue += "Bang";

            if (n % 11 == 0)
                displayValue = "Bong";


            if (displayValue == "")
                System.out.println(n);
            else
                System.out.println(displayValue);


        }
    }
}
