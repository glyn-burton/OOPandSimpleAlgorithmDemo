package com.example.oopandsimplealgorithmdemo;

import java.util.List;

public class Jungle {
    private List<Animal> animalList;
    private Integer tigNumber;
    private Integer snkNumber;
    private Integer monNumber;

 void CreateMonkey(){

     Animal newMonkey = new Monkey();
     newMonkey.setNumOfSameAnimal(newMonkey.getNumOfSameAnimal() + 1);
     animalList.add(newMonkey);
     monNumber++;



 }

 void CreateTiger(){
     Animal newTiger = new Tiger();
     newTiger.setNumOfSameAnimal(newTiger.getNumOfSameAnimal() + 1);
     animalList.add(newTiger);
     tigNumber++;





 }

 void CreateSnake(){

     Animal newSnake = new Snake();
     newSnake.setNumOfSameAnimal(newSnake.getNumOfSameAnimal() + 1);
     animalList.add(newSnake);
     snkNumber++;





 }

 void SoundOff(){
     for(int i =0; i < animalList.size(); i++){





     }






 }



}
