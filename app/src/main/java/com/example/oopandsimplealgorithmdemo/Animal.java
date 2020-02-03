package com.example.oopandsimplealgorithmdemo;

import android.view.textservice.SpellCheckerInfo;

class Animal {
    private int energyFood = 5;
    private int energySleep = 10;
    private int soundPenalty = 3;
    private  int numOfSameAnimal;
    private String noise;
    private int energy;


    Animal(String Species){


    }






    void eatFood(FoodType type){

        setEnergy(getEnergy() + getEnergyFood());



    }

    void  makeSound(){

        setEnergy(getEnergy() - getSoundPenalty());

    }

    void  sleep(){

        setEnergy((getEnergy() + getEnergySleep()));


    }

    Integer getSpecies(){

        return getNumOfSameAnimal();

    }


    public int getEnergySleep() {
        return energySleep;
    }

    public void setEnergySleep(int energySleep) {
        this.energySleep = energySleep;
    }

    public int getSoundPenalty() {
        return soundPenalty;
    }

    public void setSoundPenalty(int soundPenalty) {
        this.soundPenalty = soundPenalty;
    }

    public int getEnergyFood() {
        return energyFood;
    }

    public void setEnergyFood(int energyFood) {
        this.energyFood = energyFood;
    }

    public String getNoise() {
        return noise;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }

    public int getNumOfSameAnimal() {
        return numOfSameAnimal;
    }

    public void setNumOfSameAnimal(int numOfSameAnimal) {
        this.numOfSameAnimal = numOfSameAnimal;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
}


