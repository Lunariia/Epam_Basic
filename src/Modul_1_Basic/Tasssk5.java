package Modul_1_Basic;

import static java.lang.Math.*;

public class Tasssk5 {
    public static void main(String[] args) {

        double e = 0.002, sum = 0;

        for (int n = 2;; n++) {
            double a = (1 /pow(2, n)) + (1 /pow(3, n));

            if (abs(a) <= e)
                break;

            sum += a;
        }

        System.out.println(sum);
    }
}
