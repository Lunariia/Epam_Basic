package Modul_1_Basic;

public class Tasssk2 {
    public static void main(String[] args) {
        double a = 1, b = 10, h = 0.5, y;

        for (double x = a; x <= b; x += h) {
            if (x <= 2) {
                y = -x;
                System.out.println("y: " + y);

            } else {

                y = x;
                System.out.println("y: " + y);
            }
        }
    }
}
