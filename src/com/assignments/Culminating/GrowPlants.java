package com.assignments.Culminating;

public class GrowPlants {
    public static void main(String[] args) {

        Plant eddy = new Plant(0, 0, 0);

        eddy.setRoots(4);
        eddy.setStems(5);
        eddy.setLeaves(3);

        System.out.println(eddy.getLeaves());
        System.out.println(eddy.getRoots());
        System.out.println(eddy.getStems());

        eddy.drinksWater(4);
        eddy.grows(7);
        eddy.eat("coffee");
        eddy.eat("light");


        Cactus jane = new Cactus(5, 5, 2);


        System.out.printf("the Cactus named \"Jane\" has %d needles per square centimetre, %d number of roots, " +
                "and %d number of stems (arms) \n",jane.getNeedles(), jane.getRoots(), jane.getStems());
        System.out.println("here 1\n");
        jane.drinksWater(5);
        System.out.println("here 2\n");
        jane.grows(jane.stems);
        //
        jane.sitsOnCactus(0);
//        jane.sitsOnCactus(12);

    }
}
