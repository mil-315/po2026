package agh.po.zadania;
import agh.po.animals.*;
import java.util.Random;

public class Zoo {
    Animal[] animals = new Animal[100];
    Random rand = new Random();
    public Zoo(){
    for (int i=0; i < animals.length; i++){
        int type = rand.nextInt(3);
        if (type==0){
            animals[i] = new Dog("pies " + (i+1));
        }
        else if(type==1){
           animals[i] = new Parrot("papuga " + (i+1));
        }
        else if(type==2) {
            animals[i] = new Snake("wąż " + (i+1));
        }
    }
    }
    public int wypisz_nogi(){
        int suma = 0;
        for(int i=0; i < animals.length;i++){
            suma = suma + animals[i].getLegs();
        }
        return suma;
    }
    public void wypisywanie(){
        for(Animal animal :animals){
            int legs = animal.getLegs();
            System.out.println(animal.getDescription());
            animal.makeSound();
        }
    }

}
