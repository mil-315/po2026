package agh.po.lab2;
import java.util.ArrayList;

public class lotto2 {

    public static ArrayList<Integer> losowanie() {
        ArrayList<Integer> los = new ArrayList<Integer>();
        for (int i = 0; i<6;i++) {
            int a = (int)(Math.random()* 50);
            while (los.contains(a)){
                 a = (int)(Math.random()* 50);
            }
            los.add(a);

        }
        los.sort(null);
        return los;





}}
