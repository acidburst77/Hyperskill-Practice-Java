package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
	    //The sum of elements
        /*Scanner sc = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        do {
            number = sc.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println(sum);*/

        // Enums
        enum Season {
            SPRING, SUMMER, AUTUMN, WINTER
        }

    }
}

// Интересный вывод массива строк
class Application {
    String name;

    public void run(String[] str) {
        System.out.println(this.name);

        for(String item : str) {
            System.out.println(item);
        }
    }
}
