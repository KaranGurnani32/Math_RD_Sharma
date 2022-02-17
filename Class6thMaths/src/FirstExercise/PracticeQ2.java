package FirstExercise;

import java.util.Scanner;

public class PracticeQ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = scanner.nextInt();
        String nameofNumber = convert(num);
        System.out.println("Numeral form : " + nameofNumber);

    }

    static String fun(int number){
        String str = "";

        String[] units = {" ", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
                "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
                "Seventeen", "Eighteen", "Nineteen"};

        String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        if (number<20){
            str =units[number];
        } else if (number>=20 && number<100){
            str = tens[number/10] + " " + units[number%10];
        }
        return str;
    }

    static String convert(int number) {
        String ss = "";

        if(number<100){
            ss = fun(number);
        } else if (number>=100 && number<1000) {
            ss = fun(number/100) + " Hundred " + convert(number%100);
        } else if (number>=1000 && number<100000) {
            ss = fun(number/1000) + " Thousand " + convert(number%1000);
        } else if (number>=100000 && number<10000000) {
            ss = fun(number/100000) + " Lakh " + convert(number%100000);
        }
        return ss;
    }
}
