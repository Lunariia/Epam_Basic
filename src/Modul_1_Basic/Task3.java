package Modul_1_Basic;


import static java.lang.Math.*;

public class Task3 {
    public static void main(String[] args) {
        double x = 4, y = 4, z;
        z = (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x * y);
        System.out.printf("%.1f", z);
    }
}
