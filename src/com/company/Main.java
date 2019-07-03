package com.company;
import java.util.*;

enum Season {
    SPRING, SUMMER, AUTUMN, WINTER
}

enum UserStatus {
    PENDING, ACTIVE, BLOCKED
}

enum TransactionStatus {
    WAITING(false),
    PROCESSING(false),
    COMPLETED(false),
    ERROR(false);

    private boolean done;

    TransactionStatus(boolean done) {
        this.done = done;
    }

    public boolean isDone() {
        return done;
    }
}

enum Secret {
    STAR, CRASH, START
}

enum Direction {
    EAST("E"),
    WEST("W"),
    NORTH("N"),
    SOUTH("S");

    private final String shortCode;

    Direction(String code) {
        this.shortCode = code;
    }

    public String getShortCode() {
        return this.shortCode;
    }
}

enum Month {
    JAN(1),
    FEB(2),
    MAR(3),
    APR(4),
    MAY(5),
    JUN(6),
    JUL(7),
    AUG(8),
    SEP(9),
    OCT(10),
    NOV(11),
    DEC(12);

    Month(int number) {
        this.number = number;
    }

    private final int number;

    public int getNumber() {
        return number;
    }
}

enum Planet {

    VENUS   (4.869e+24, 6.0518e+6),
    EARTH   (5.976e+24, 6.37814e+6),
    MARS    (6.421e+23, 3.3972e+6),
    JUPITER (1.9e+27,   7.1492e+7),
    SATURN  (5.688e+26, 6.0268e+7),
    URANUS  (8.686e+25, 2.5559e+7);

    private final double m; // mass in kilograms
    private final double r; // radius in meters

    Planet(double mass, double radius) {
        this.m = mass;
        this.r = radius;
    }

    public double mass() { return m; }

    public double radius() { return r; }
}

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
        /*Season summer = Season.SUMMER;
        Season autumn = Season.AUTUMN;

        System.out.println(summer);
        System.out.println(summer.equals(Season.SUMMER));
        System.out.println(summer == Season.SUMMER);

        System.out.println(autumn.equals(Season.AUTUMN));
        System.out.println(autumn == Season.AUTUMN);

        Season[] seasons = Season.values();
        System.out.println(seasons);

        Season season = Season.valueOf("AUTUMN");
        System.out.println(season);

        String winter = Season.WINTER.name();
        String autumn2 = Season.AUTUMN.toString();
        System.out.println(winter);
        System.out.println(autumn2);

        UserStatus status = UserStatus.valueOf("ACTIVE");
        switch(status) {
            case PENDING:
                System.out.println("You need to wait a little");
                break;
            case ACTIVE:
                System.out.println("No problems, you may pass here");
                break;
            case BLOCKED:
                System.out.println("Stop! You can't pass here");
                break;
            default:
                System.out.println("Unsupported enum constant");
        }

        TransactionStatusDemo st = new TransactionStatusDemo();
        st.printFullStatus(TransactionStatus.COMPLETED);*/

        // Counting enums that contains string "STAR"
        /*int count = 0;
        for(Secret item : Secret.values()) {
            if(item.toString().startsWith("STAR")) {
                count++;
            }
        }
        System.out.println(count);*/

        /*for (Planet planet : Planet.values()) {
            if(planet.mass() > 5.0e+24 && planet.radius() > 6.0e+7) {
                System.out.println(planet);
            }
        }*/

        /**
         * Sorting numbers
         * Correct to incorrect ratio
         *       is 31%
         * Hard
         * ⏲
         * 3 minutes
         * Difficulty here is based on ratio of successful attempts
         *       vs. all problem attempts by all learners. Time here is how fast other
         *       learners usually solve it.
         * Code Challenge — Write a program
         * 213 learners successfully solved this problem.  These numbers are updated every 24 hours
         * The latest completion was a day ago.
         *
         * Implement a method for sorting a given array of integers in the ascending order.
         * You can use any algorithm for sorting it.
         *
         * Sample Input 1:
         *
         * 3 1 2
         * Sample Output 1:
         *
         * 1 2 3
         */

        final Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split("\\s+");
        int[] numbers = Arrays.stream(values)
                .mapToInt(Integer::parseInt)
                .toArray();
        sort(numbers);
        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));

    }

    public static void sort(int[] numbers) {
        int max = 0;
        int[] arr = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < )
        }
    }
}

class TransactionStatusDemo {
    void printFullStatus(TransactionStatus status) {
        System.out.println("Status: " + status + ", is finished: " + status.isDone());
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
