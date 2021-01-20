package program;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) throws ArrayIndexOutOfBoundsException{
        System.out.println("Put example");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();


        String[] example = input.split(" ");
        String x = example[0];
        char op = example[1].charAt(0);
        String y = example[2];

        if (isArabic(x) & isArabic(y)) {
            int number1 = Integer.parseInt(x);
            int number2 = Integer.parseInt(y);
            if (number1 > 10 || number1 < 1 || number2 > 10 || number2 < 1) {
                throw new IllegalArgumentException("Not in range [1,10]");
            }
            Calculator calc = new Calculator(number1, number2, op);
            System.out.println(calc.calculator());
        }
        if ((!isArabic(x)) & (!isArabic(y))) {
            int roman1 = Roman.romanToArabic(x);
            int roman2 = Roman.romanToArabic(y);
            Calculator calc2 = new Calculator(roman1, roman2, op);
            System.out.println(Arabic.arabicToRoman(calc2.calculator()));
        }

    }

    private static boolean isArabic(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c))
                return false;
        }
        return true;

    }





}
