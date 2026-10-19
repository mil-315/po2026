package agh.po.lab1;

public class Choinka {
    public static void rysowaniechoinki(int wysokosc) {
       for (int i = 0; i < wysokosc; i++) {
            for (int k = 0; k <= ((wysokosc) / 2 - i); k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {

                System.out.print("**");
            }
            System.out.println();
        }
    }
}
