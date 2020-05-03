package Modul_1_Basic;

import java.util.Scanner;

public class Tasssk7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Начало промежутка(m): ");
        int m = in.nextInt();
        System.out.print("Конец промежутка(n): ");
        int n = in.nextInt();
        for (int i = m; i <= n; i++) {
            System.out.print("Делители числа " + i + " : ");
            delitel(i);
            System.out.println("");
        }

    }

    private static void delitel(int last) {

        for (int i = 1; last >= i; i++) {
            if (i == 1 || i == last) {
                continue;
            } else if (last % i == 0) {
                System.out.print(i + " ");
            } else {
                continue;
            }
        }
    }
}
