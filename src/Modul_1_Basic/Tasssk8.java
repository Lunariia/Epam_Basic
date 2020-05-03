package Modul_1_Basic;

public class Tasssk8 {
    public static void main(String[] args) {
        int a = 14567;
        int b = 14959343;
        devid(a);
        devid(b);
    }

    private static void devid(int number) {
        System.out.print(number + " = ");

        while (number != 0) {
            int digit = number % 10;
            number /= 10;
            System.out.print(digit + " ");
        }
        System.out.println(" ");
    }
}
