package agh.po.animals;

public class Parrot extends Animal {
    public Parrot(String name){
        super(name,2);
    }

    public String getDescription(){
        return  name + "(" + legs  +" nogi)";
    }

    @Override
    public void makeSound() {
        System.out.println("kraaa kraaaa");
    }
}

