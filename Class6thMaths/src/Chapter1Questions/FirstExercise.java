package Chapter1Questions;

import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {
        //Q2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = scanner.nextInt();
        String nameOfNumber = convert(num);
        System.out.println("Numeral form is : " + nameOfNumber);
    }

    //Q2
    static String fun(int num) {
        String[] units = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
                "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
                "Seventeen", "Eighteen", "Nineteen"};

        String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        String str = "";

        if (num < 20) {
            str = units[num];
        } else if (num >= 20 && num < 100) {
            str = tens[num / 10] + " " + units[num % 10];

        }
        return str;
    }

    static String convert(int num) {
        String ss = "";

        String[] hundreds = {"", "One Hundred", "Two Hundred", "Three Hundred", "Four Hundred", "Five Hundred", "Six Hundred",
                "Seven Hundred", "Eight Hundred", "Nine Hundred"};
        if (num<100) {
            ss = fun(num);
        }
//        else if (num >= 100 && num < 1000 ){
//            ss = hundreds[num/100] + fun(num);
//        }
//
        return ss;
    }
}
