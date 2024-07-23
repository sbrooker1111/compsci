package com.assignments.Culminating;

public class GrowPlants {
    public static void main(String[] args) {

        Plant eddy = new Plant(0,0,0);

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
    }



}
