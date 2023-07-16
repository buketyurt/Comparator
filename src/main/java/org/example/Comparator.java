package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Comparator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz : ");
        int number1 = scanner.nextInt();

        System.out.println("ikinci sayıyı giriniz : ");
        int number2 = scanner.nextInt();

        System.out.println("üçüncü sayıyı giriniz : ");
        int number3 = scanner.nextInt();


        if(number1>number2){
            int p = number1;
            number1 = number2;
            number2 = p;
        }if (number1>number3){
            int p = number1;
            number1 = number3;
            number3 = p;
        }if(number2>number3){
            int p = number3;
            number3 = number2;
            number2 = p;
        }

        System.out.println(""+ number1 + number2 + number3);
    }

}
