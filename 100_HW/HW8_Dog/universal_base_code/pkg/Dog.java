package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	 String name;
    int age;
    String breed;

    public Dog() {
        this.name = "Clifford";
        this.age = 3;
        this.breed = "big red dog";
    }

    public Dog(String name) {
        this.name = name;
        this.age = 1;
        this.breed = "dog dog";
    }

    public Dog(String name, String breed) {
        this.name = name;
        this.age = 1;
        this.breed = breed;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        this.breed = "dog dog";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getBreed() {
        return this.breed;
    }

    public boolean isSleeping() {
        Random rand = new Random();
        return rand.nextBoolean(); 
    }

    public void bark() {
        System.out.println(this.name + " barks!");
    }

}
