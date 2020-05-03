package Modul_1_Basic;

import java.util.Scanner;

public class Tasssk1 {
    public static void main(String[] args) {
        int sum = 0;
        System.out.print("Input number: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number > 1) {
            for (int i = 1; i <= number; i++)
            {
                sum += i;
            }
            System.out.println("Sum from 1 to " + number + " = " + sum);
        }
    }
}
