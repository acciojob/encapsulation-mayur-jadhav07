package com.driver;

public class Main {
    public static void main(String[] args){
        RWOnly rwOnlyObj = new RWOnly();

        // Uncommenting the following line will result in a compilation error
        // rwOnlyObj.name = "Mayur"; // Error: The field RWOnly.name is not visible

        // Uncommenting the following line will result in a compilation error
        // System.out.println(rwOnlyObj.name); // Error: The field RWOnly.name is not visible

        // Set value using setter
        rwOnlyObj.setName("Mayur Jadhav");

        // Access value using getter
        System.out.println("Name: " + rwOnlyObj.getName());
    }
}