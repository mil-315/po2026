package agh.po.lab1;


public class Main {
    public static void main(String[] args){
       if(args.length>0) {
           int liczba = Integer.parseInt(args[0]);
           Choinka.rysowaniechoinki(liczba);
       }else{
           Choinka.rysowaniechoinki();
       }
    }
}

