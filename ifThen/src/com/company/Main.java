package com.company;

public class Main {

    public static void main(String[] args) {
	// if statement without code block
        if (1 == 1)
            System.out.println("thats true");
                // cannot include more lines only one.

        // if statement with code block with else
        int topScore = 33;
        if (topScore > 99) {
            System.out.println("the score is greater then the minimum.");
        } else  {
            System.out.println("the score is not greater then the minimum.");
        }

        // ternary if statement
        boolean isGood = topScore > 22 ? true : false;
        if (isGood) {
            System.out.println("is good");
        }
    }
}
