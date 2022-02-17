package FirstExercise;

import java.util.Scanner;
import java.util.SortedMap;

public class NumToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int number = scanner.nextInt();

        String name = numberToWord(number);
        System.out.println("Numeric form is : " + name);

    }

//    private static String numberToWord2(int number) {
//        String name = "";
//
//        if (number<100){
//            name = numberToWord(number);
//        } else if (number>=100 && number<1000){
//            name = numberToWord(number/100) + " Hundred " + numberToWord2(number%100);
//        } else if (number>=1000 && number<100000){
//            name = numberToWord(number/1000) + " Thousand " + numberToWord2(number%1000);
//        } else if (number>=100000 && number<10000000){
//            name = numberToWord(number/100000) + " Lakh " + numberToWord2(number%100000);
//        }
//
//        return name;
//    }

    private static String numberToWord(int number) {
        String name = "";

        String[] ones = {" ", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
                "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
                "Seventeen", "Eighteen", "Nineteen"};

        String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        if (number < 20) {
            name = ones[number];
        } else if (number >= 20 && number < 100) {
            name = tens[number / 10] + " " + ones[number % 10];
        } else if (number>=100 && number<1000){
            name = numberToWord(number/100) + " Hundred " + numberToWord(number%100);
        } else if (number>=1000 && number<100000){
            name = numberToWord(number/1000) + " Thousand " + numberToWord(number%1000);
        } else if (number>=100000 && number<10000000){
            name = numberToWord(number/100000) + " Lakh " + numberToWord(number%100000);
        }
        return name;
    }



}
