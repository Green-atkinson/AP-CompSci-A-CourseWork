// Create a class called Date that represents a year, month, and day. It must contain private fields,
// accessor and mutator methods for each field, a toString()method that is non-default, at least two
// constructors, and work for the following client code.

import java.util.*;

public class DateMain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Day? ");
        while(!console.hasNextInt()){
            console.next();
            System.out.print("Day? ");
        }
        int day = console.nextInt();

        System.out.print("Month? ");
        while(!console.hasNextInt()){
            console.next();
            System.out.print("Month? ");
        }
        int month = console.nextInt();

        System.out.println("Year? ");
        while(!console.hasNextInt()){
            console.next();
            System.out.println("Year? ");
        }
        int year = console.nextInt();


        Date d1 = new Date(2, 13, 2008);
        Date d2 = new Date(4, 6, 2025);
        Date d3 = new Date(month, day, year);
        Date d4 = new Date(d2);


        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4.getYear());
        System.out.println(d1.isLeapYear());
        System.out.println(d2.isLeapYear());
        System.out.println(d3.isLeapYear());

    }
}