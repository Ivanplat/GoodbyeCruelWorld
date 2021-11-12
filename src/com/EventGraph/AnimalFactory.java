package com.EventGraph;

import java.util.ArrayList;

//This class is singleton factory
public class AnimalFactory
{
    //Private constructor, according to the singleton
    private AnimalFactory()
    {
        //Create all ArrayLists
        cats = new ArrayList<>();
        dogs = new ArrayList<>();
        hippos = new ArrayList<>();
        hamsters = new ArrayList<>();
    }
    //Get instance, according to the singleton
    public static AnimalFactory getInstance()
    {
        if(instance == null)
        {
            instance = new AnimalFactory();
        }
        return instance;
    }
    //Methode to fill the "Zoo"
    public void fillTheZoo()
    {
        //Min value of rand1
        int min = 1;
        //Min value of rand2
        int max = 100;

        //Calculation the rand1 value
        int rand1 = (int)Math.round((Math.random() * ( max - min )) + min);

        //Min value of rand2
        int min2 = 0;
        //Max value of rand2
        int max2 = 3;

        //From 0 to rand1 do
        for(int i = 0; i < rand1; i++)
        {
            //Calculation the rand2 value
            int rand2 = (int)Math.round((Math.random() * ( max2 - min2 )) + min2);
            //Switching on the rand2 value
            switch (rand2) {
                case 0 -> cats.add(new Cat()); //If rand2 == 0
                case 1 -> dogs.add(new Dog()); //If rand2 == 1
                case 2 -> hippos.add(new Hippo()); //If rand2 == 2
                case 3 -> hamsters.add(new Hamster()); //If rand2 == 3
            }
        }
    }
    //Public methode to speak animals
    public void speakAnimals()
    {
        //For each in cats
        for (var i : cats)
        {
            //Speak each cat
            i.speak();
        }
        //For each in dogs
        for (var i : dogs)
        {
            //Speak each dog
            i.speak();
        }
        //For each in hippos
        for (var i : hippos)
        {
            //Speak each hippo
            i.speak();
        }
        //For each in hamsters
        for (var i : hamsters)
        {
            //Speak each hamster
            i.speak();
        }
    }
    //Public methode to print count of animals
    public void printCountOfAnimals()
    {
        //Check if size of cats != 0
        if (cats.size() != 0)
        {
            //If true then print the cats count
            System.out.printf("Cats count is %d\n", cats.size());
        }
        else
        {
            //Else print 0
            System.out.printf("Cats count is %d\n", 0);
        }

        //Check if size of dogs != 0
        if (dogs.size() != 0)
        {
            //If true then print the dogs count
            System.out.printf("Dogs count is %d\n", dogs.size());
        }
        else
        {
            //Else print 0
            System.out.printf("Gogs count is %d\n", 0);
        }

        //Check if size of hippos != 0
        if (hippos.size() != 0)
        {
            //If true then print the hippos count
            System.out.printf("Hippos count is %d\n", hippos.size());
        }
        else
        {
            //Else print 0
            System.out.printf("Hippos count is %d\n", 0);
        }

        //Check if size of hamsters != 0
        if (hamsters.size() != 0)
        {
            //If true then print the hamsters count
            System.out.printf("Hamsters count is %d\n", hamsters.size());
        }
        else
        {
            //Else print 0
            System.out.printf("Hamsters count is %d\n", 0);
        }
    }

    //Private static instance, according to the singleton
    private static AnimalFactory instance;
    //Private ArrayList of the Cat class
    private final ArrayList<Cat> cats;
    //Private ArrayList of the Dog class
    private final ArrayList<Dog> dogs;
    //Private ArrayList of the Hippo class
    private final ArrayList<Hippo> hippos;
    //Private ArrayList of the Hamster class
    private final ArrayList<Hamster> hamsters;
}
