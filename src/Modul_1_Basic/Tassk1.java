package Modul_1_Basic;

public class Tassk1 {
    public static void main(String[] args) {
        int a = 20;
        int b = 50;

        boolean var = 180 - a - b > 0 && a!= 0 && b!=0;
        if(var) System.out.print("треугольник сущиствует");
        else System.out.print("треугольник не существует");

        if (180 - a - b != 0 && 180 - a - b == 90 || 180 - a - b != 0 && a == 90 || 180 - a - b != 0 && b == 90)
            System.out.print(" и является прямоугольным.");
        }
}
