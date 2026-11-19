package agh.po.zadania;

public class Main {
    public static void main(String[] args){
        Zoo zoo = new Zoo();
        zoo.wypisywanie();
        System.out.println("suma nóg wsazytskich zwierząt wynosi: " + zoo.wypisz_nogi());
    }
}
