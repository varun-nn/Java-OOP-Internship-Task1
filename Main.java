import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Conditions
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");

        // Loops
        System.out.println("\nNumbers from 1 to 5:");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Arrays
        int[] marks = {80, 85, 90, 95, 100};

        System.out.println("\nArray Elements:");

        for (int mark : marks) {
            System.out.println(mark);
        }

        // Encapsulation
        Student s = new Student("Rahul", 21);

        System.out.println("\nStudent Details:");
        s.display();

        // Inheritance + Polymorphism
        Animal a = new Dog();

        System.out.println("\nAnimal Sound:");
        a.sound();

        sc.close();
    }
}
