package agh.po.zadania;
import agh.po.animals.*;
import java.util.Random;

public class ZOO{
    Animal[] animals = new Animal[100];
    Random rand = new Random();
    public ZOO(){
    for (int i=0; i < animals.length; i++){
        int type = rand.nextInt(3);
        if (type==0){
            animals[i] = new Dog("lilka" + i+1);
        }
        else if(type==1){
           animals[i] = new Parrot("papog" + i+1);
        }
        else if(type==2) {
            animals[i] = new Snake("sznórówek" + i+1);
        }
    }
    }
    public int wypisz_nogi(){
        int suma = 0;
        for(int i=0; i < animals.length;i++){
            suma = suma + animals[i].getlegs();
        }
        return suma;
    }
    public void wypisywanie(){
        for(Animal animal :animals){
            System.out.println(animal.getDescription());
        }
    }

}
