package Modul_1_Basic;

import static java.lang.Math.pow;

public class Tasssk4 {
    public static void main(String[] args) {
        int sum = 1;
        for (int i = 1; i <= 200; i++) {sum *=pow(i,2);}
        System.out.println(sum);
    }
}
