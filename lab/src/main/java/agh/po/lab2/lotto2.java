package agh.po.lab2;
import java.util.ArrayList;

public class lotto2 {

    public static ArrayList<Integer> losowanie() {
        ArrayList<Integer> los = new ArrayList<Integer>();
        for (int i = 0; i<6;i++) {
            int a = (int)(Math.random()* 50);
            if (los.contains(a)){
                 a = (int)(Math.random()* 50);
            }
            los.add(a);

        }
        los.sort(null);
        System.out.println("liczby wygrane: " + los);
        return los;





/*
        int losowania = 0;
        while (wygrane < 6 ){
            losowania++;
            ArrayList<Integer> trafienia = new ArrayList<Integer>();
            wygrane = 0;
            for (int i = 0; i<6;i++) {
                int b = (int) (Math.random() * 101);
                trafienia.add(b);
            }
            for (int i=0);
            if (liczby = trafienia){
                    wygrane++;
                }

        }
        System.out.println(losowania);
    }*/


}}
