package Modul_1_Basic;

public class Tassk3 {
    public static void main(String[] args) {
        int x1 = 1, y1 = 1;
        int x2 = 2, y2 = 2;
        int x3 = 3, y3 = 3;

        if (((x1 - x3) * (y2 - y3)) == ((x2 - x3) * (y1 - y3))) {
            System.out.print("Лежат на одной прямой");
        } else {
            System.out.print("Не лежат на одной прямой");
        }
    }
}
