package agh.po.lab2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> zgadniecie = new ArrayList<Integer>();
        for (int i=0; i<6; i++){
            int liczba = Integer.parseInt(args[i]);
            zgadniecie.add(liczba);
        }
        System.out.println(zgadniecie);
        ArrayList<Integer> los = lotto2.losowanie();
        System.out.println("liczby wygrane: " + los);
        int liczba_traf = 0;
        for (int j=0; j<6; j++){
            if(los.contains(zgadniecie.get(j))){
                liczba_traf++;
            }
        }

        System.out.println("liczba trafień: " + liczba_traf);

        int liczba_trafien = 0;
        int liczba_losow = 0;
        double a = System.currentTimeMillis();
        while(liczba_trafien<6){
            liczba_trafien = 0;
            for (int j=0; j<6; j++){
                if(los.contains(zgadniecie.get(j))){
                    liczba_trafien++;
                }
            }
            liczba_losow ++;
            los = lotto2.losowanie();
        }
        System.out.println("liczba losowan: "+ liczba_losow +"\nczas: " + (System.currentTimeMillis()-a));



    }
}
