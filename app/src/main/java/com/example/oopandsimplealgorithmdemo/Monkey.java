package com.example.oopandsimplealgorithmdemo;

public class Monkey extends Animal {

    static int MonkeyNum;
    Monkey(String Species){

        super(Species);

    }

    private int energyFood = 2;
    private int energySleep = 10;
    private int soundPenalty = 4;
    private String noise = "Oooo";

    String Play ()

    {
        if (getEnergy() > 8)
        {
            setEnergy(getEnergy() - 8);
            return "Ooo Ooo Ooo";


        }
        else
        {

            return "Monkey is too tired";
        }



    }





}
