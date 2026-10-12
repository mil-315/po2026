package agh.po.lab2;
import java.util.ArrayList;
import java.util.Scanner;

public class lotto2 {

    public static void losowanie() {
        System.out.println("podawaj liczby tylko od 0 do 100 ;)");
        ArrayList<Integer> liczby = new ArrayList<Integer>();
        ArrayList<Integer> liczby2 = new ArrayList<Integer>();
        int m =0;
        for (int i = 0; i<6;i++) {
            int a = (int)(Math.random()* 101);
            liczby.add(a);
            Scanner lib = new Scanner(System.in);
            System.out.println("podaj " + (i+1) + " liczbe");
            int los = lib.nextInt();
            liczby2.add(los);
            if (a == los){
                m++;
            }
        }

        System.out.println("liczby wygrane: " + liczby);
        System.out.println("twoje liczby:" + liczby2);
        System.out.println("trafione:" + m);
    }
}
