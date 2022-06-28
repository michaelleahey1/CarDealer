package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarDealer c = new CarDealer("Ford Mustang", "yellow", 10);
        System.out.println(" Name: " + c.getName( ) + " color: " + c.getAge( ) + " age: " + c.getColor( ));
        Scanner in = new Scanner(System.in);
        System.out.println("enter color('Red'/'Blue')>");
        String color = in.nextLine( );
        System.out.println("Enter age (0-10)>");
        String ageS = in.nextLine( );
        int age = Integer.parseInt(ageS);
       try {
           setColor(color);
           setAge(age);
       }
       catch(NoSuchFieldException e){
           System.out.println(e.getMessage());
       }
       catch (IllegalArgumentException e)
       {
           System.out.println(e.getMessage() );
       }
    }
    public static void setColor(String color)throws NoSuchFieldException {
        System.out.println("Color is :" + color);
        {
            if (color.equals("Red") || color.equals("Blue"))
                return;
        }
        throw new NoSuchFieldException("Color not red/blue");
    }
    public static void setAge(int age) throws IllegalArgumentException {
        System.out.println("Age is : " + age);
        if (age >= 0 && age <= 10) {
            return;
        }
        throw new IllegalArgumentException("age is not between 0-10");
    }
    }







