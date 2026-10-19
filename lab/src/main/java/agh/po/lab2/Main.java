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
        int liczba_traf = 0;
        for (int j=0; j<6; j++){
            if(los.get(j) == zgadniecie.get(j)){
                liczba_traf++;
            }
        }

        System.out.println(liczba_traf);

    }
}
