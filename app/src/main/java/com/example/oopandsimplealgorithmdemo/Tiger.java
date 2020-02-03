package com.example.oopandsimplealgorithmdemo;

public class Tiger extends Animal {

    static int TigerNum;

    Tiger(String Species){

        super(Species);

    }

    private int energyFood = 2;
    private int energySleep = 5;
    private int soundPenalty = 4;
    private String noise = "Grrrrr";

    @Override
    void eatFood(FoodType type) {
        if (type == FoodType.Grain){


            setEnergy(getEnergy() + 0);
        }
    }
}
