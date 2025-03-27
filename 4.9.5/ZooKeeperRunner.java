

/*
 * Activity 4.9.2
 */

import java.util.ArrayList;
public class ZooKeeperRunner
{
  public static void hearTheAnimal(Animal animal){
    animal.speak();
  }
  
  public static void main(String[] args)
  { 
    Elephant elephant = new Elephant("leaves, grasses, roots", false, 60.0);
    elephant.trumpet();    
    elephant.eat();
    elephant.isNocturnal();

    Tiger tiger = new Tiger("leaves, grasses, roots", false, 60.0);
    tiger.swim();
    tiger.huntAlone();
    tiger.roar();
    tiger.growl();
    tiger.eat();
    tiger.isNocturnal();
    tiger.getLifeSpan();
    tiger.sleep();

    Gorilla gorilla = new Gorilla();
    gorilla.eat();

    Giraffe giraffe = new Giraffe("leaves", false, 25.0);
    giraffe.eat();  

    Hippo hippo = new Hippo("leaves", false, 25.0);
    hippo.eat();
    ArrayList<Animal> zoo = new ArrayList<Animal>();
    zoo.add(elephant);
    zoo.add(tiger);
    zoo.add(gorilla);
    zoo.add(giraffe);
    zoo.add(hippo);
    for (Animal e:zoo){
      hearTheAnimal(e);
    }
    hearTheAnimal(elephant);
    hearTheAnimal(hippo);
  }
}