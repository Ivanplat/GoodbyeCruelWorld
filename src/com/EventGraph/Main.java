/*
 * Laboratory work #4. Platonov Ivan, group 02121-DB, IMIT ISU.
 * Block "Goodbye, cruel world!"
 * */
package com.EventGraph;

public class Main {

    public static void main(String[] args)
    {
        //Create a singleton factory and call methods from it
        AnimalFactory.getInstance().fillTheZoo();
        AnimalFactory.getInstance().speakAnimals();
        AnimalFactory.getInstance().printCountOfAnimals();
    }
}
