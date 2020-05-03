package Modul_1_Basic;

public class Task5 {
    public static void main(String[] args) {
        int T = 10000;
        int hour = T / 3600;
        int min = (T % 3600) / 60;
        int sec = (T % 3600) % 60;
        System.out.print(hour + "ч " + min + "мин " + sec + "с");
    }
}
