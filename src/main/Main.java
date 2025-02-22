/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author ICT Computer Lab
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        square square = new square (5);
        System.out.println("Square");
        System.out.println("\tArea: " + square.area());
        System.out.println("\tPerimeter: " + square.perimeter());
        rectangle rectangle = new rectangle(5,6);
        System.out.println("Rectangle");
        System.out.println("\tArea: " + rectangle.area());
        System.out.println("\tPerimeter: " + rectangle.perimeter());
        triangle triangle = new triangle(5.0f,6.0f,7.0f);
        System.out.println("Triangle");
        System.out.println("\tArea: " + triangle.area());
        System.out.println("\tPerimeter: " + triangle.perimeter());
    }
    
}
