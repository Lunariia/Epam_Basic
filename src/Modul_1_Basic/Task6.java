package Modul_1_Basic;

public class Task6 {
    public static void main(String[] args) {
        int x = -1, y = 3;

        if (y <= 4 && x >= -2 && x < 0 ||
                y <= 4 && x <= 2 && x > 0 && y > 0 ||
                x <= 4 && y >= -3 && y < 0 ||
                x >= -4 && y >= -3 && x < 0 && y < 0)
            System.out.print(true);
        else
            System.out.print(false);
    }
}
