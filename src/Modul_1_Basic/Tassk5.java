package Modul_1_Basic;

import static java.lang.Math.*;

public class Tassk5 {
    public static void main(String[] args) {
        double x = 4;
        double fx;

        if (x <= 3)
        {
            fx = pow(x, 2) - 3 * x + 9;
            System.out.print(fx);
        }
        else if (x > 3)
        {
            fx = 1 / (pow(x, 3) + 6);
            System.out.print(fx);
        }
    }
}
