// 4 constructer
// Write a class called Burger, a class called PubBurger that extends it, and a driver class called
// BurgerMain that proves the functionality listed below . Burger must contain boolean fields called
// ketchup, mustard, pickles, onion, mayo, lettuce, tomato and cheese. It must
// also contain an integer field called patties. PubBurgers have two additional fields, both
// Strings, called FancySauce and FancyBun respectively. Tomatoes cost $.25, cheese costs $.50,
// and burgers start at $4.00, with $1 added for each patty after 1, maximum 3. If a burger is a pub burger,
// it should cost $2 more than a burger with exactly the same condiments. Two Burgers are equal if their
// condiments and status as a PubBurger are all the same.
// You must:
// 1. Follow the syntax template for well-encapsulated classes.
// 2. Include the private fields listed above.
// 3. Have constructors that re-implement the default constructor and allow a user to set all fields.
// 4. Implement getPrice(), equals(), and toString()
// 5. Have accessors and mutators for each field.
// 6. Include a driver class called BurgerMain that proves you have completed the work above.
// 7. Save all of your work in a folder called lastName_Burger.
// in equalls, you need to compare 3 burgers

// look at NumWord.java


public class BurgerMain{
    public static void main(String[] args) {
        //constructs 4 burgers
        Burger burger1 = new Burger();
        Burger burger2 = new Burger(true, true, true, true, true, true, false, true, 3);
        Burger burger3 = burger2;
        PubBurger burger4 = new PubBurger(true, true, true, false, true, false, false, true, 1, "A1 Steak Suse", "Buttered & toasted honey glazed whole white bread");

        //Prints out a comparison of all 4 burgers
        System.out.println("BUGER COMPARISON");
        System.out.println();
        System.out.println("Is Burger 2 equal to Burger 3?");
        System.out.println(burger2.equals(burger3));
        System.out.println("Is Burger 1 equal to Burger 4?");
        System.out.println(burger1.equals(burger4));
        System.out.println("Is Burger 2 equal to Burger 1?");
        System.out.println(burger2.equals(burger1));
        System.out.println("Is Burger 4 equal to Burger 3?");
        System.out.println(burger4.equals(burger3));
        System.out.println();
        System.out.println();

        //Prints out the ingredients and price of the burgers
        System.out.println("BURGER 1");
        System.out.println();
        System.out.printf("$%.2f ", burger1.getPrice());
        System.out.println(burger1);
        System.out.println();
        System.out.println();


        System.out.println("BURGER 2");
        System.out.println();
        System.out.printf("$%.2f ", burger2.getPrice());
        System.out.println(burger2);
        System.out.println();
        System.out.println();

        System.out.println("BURGER 3");
        System.out.println();
        System.out.printf("$%.2f ", burger3.getPrice());
        System.out.println(burger3);
        System.out.println();
        System.out.println();

        System.out.println("BURGER 4");
        System.out.println();
        System.out.printf("$%.2f ", burger4.getPrice());
        System.out.println(burger4);
        System.out.println();
        System.out.println();

    }
}