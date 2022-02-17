package FirstExercise;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = scanner.nextInt();
        String nameOfNumber = convert(num);
        System.out.println("Numeral form is : " + nameOfNumber);
    }

    static String fun(int num) {
        String[] units = {" ", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
                "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
                "Seventeen", "Eighteen", "Nineteen"};

        String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        String str = "";

        if (num < 20) {
            str = units[num];
        } else if (num >= 20 && num < 100) {
            str = tens[num / 10] + " " + units[num % 10];
        }
//        else if (num >= 100 && num < 1000) {
//            str = fun(num / 100) + " hundred " + fun(num % 100);
//        }
        return str;
    }


    static String convert(int num) {
        String ss = "";

        String[] hundreds = {"", "One Hundred", "Two Hundred", "Three Hundred", "Four Hundred", "Five Hundred", "Six Hundred",
                "Seven Hundred", "Eight Hundred", "Nine Hundred"};

        if (num<100) {
            ss = fun(num);
        }
        else if (num >= 100 && num < 1000) {
            ss = fun(num/100) + " hundred " + convert(num%100);
        }
        else if (num >= 1000 && num < 100000) {
            ss = fun(num/1000) + " thousand " + convert(num%1000);
        }
        else if (num >= 100000 && num < 10000000) {
            ss = fun(num/100000) + " lakh " + convert(num%100000);
        }
        return ss;
    }

}
