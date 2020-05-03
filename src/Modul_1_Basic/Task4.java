package Modul_1_Basic;

public class Task4 {
    public static void main(String[] args) {
        double r = 451.321;
        int x = (int) r;
        double part1 = (double) x / 1000;
        double part2 = (r % x) * 1000;
        double result = part1 +part2;
        System.out.printf("%.3f",result);
    }
}
