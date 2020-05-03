package Modul_1_Basic;

public class Tassk4 {
    public static void main(String[] args) {
        int a = 8;
        int b = 4;

        int x = 2;
        int y = 2;
        int z = 2;

        if ((x <= a) && (y <= b) || (y <= a) && (x <= b) || (x <= a) && (z <= b)
                || (z <= a) && (x <= b) || (z <= a) && (y <= b) || (y <= a) && (z <= b)) {
            System.out.print("Кирпич пройдет в отверстие");
        } else {
            System.out.print("Кирпич не пройдет в отверстие");

        }
    }
}
