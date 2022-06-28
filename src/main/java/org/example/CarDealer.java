package org.example;

public class CarDealer extends Main {
        String name;
        String color;
        int age;
        public CarDealer(String name, String color, int age) {
            this.name = name;
            this.color = color;
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public String getColor() {
            return color;
        }

        public int getAge() {
            return age;
        }

    }

