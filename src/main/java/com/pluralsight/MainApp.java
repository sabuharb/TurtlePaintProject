package com.pluralsight;
import java.awt.*;
import java.util.Scanner;


public class MainApp
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // This starter code to get you familiar with how
        // the TurtleLogo application works
        System.out.println("Welcome to Turtle Paint!");
        System.out.println("-----------------------------------");
        System.out.println("For the size of the world canvas: ");
        System.out.println("Enter the world canvas width: ");
        int width = scanner.nextInt();
        System.out.println("Enter the world canvas height: ");
        int height = scanner.nextInt();
        System.out.print("""
                Home Screen
                _______________________
                1. Add Shape
                2. Save Image
                0. Exit
                _______________________
                Please select a choice:
                """);
    int choice = scanner.nextInt();



        // The world is your canvas
        World world = new World(width, height);
        Turtle turtle = new Turtle(world,-100, -100);
        
        int width = 200;
        int height = 200;

        // calculate the hypotenuse (diagonal)
        // a2 + b2 = c2
        double widthSquared = Math.pow(width, 2);
        double heightSquared = Math.pow(height, 2);
        double hypotenuse = Math.sqrt(widthSquared + heightSquared);





        turtle.setPenWidth(3);
        turtle.setColor(Color.GREEN);

        turtle.turnRight(45);
        turtle.forward(hypotenuse);

        turtle.penUp();
        turtle.goTo(100, 100);
        turtle.turnRight(90);

        turtle.penDown();
        turtle.forward(hypotenuse);
    }
}
