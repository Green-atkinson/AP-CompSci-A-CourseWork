public class BurgerMain{
    public static void main(String[] args) {
        //constructs 4 burgers
        Burger burger1 = new Burger();
        Burger burger2 = new Burger(true, true, true, true, true, true, false, true, 3);
        Burger burger3 = burger2;
        PubBurger burger4 = new PubBurger(true, true, true, false, true, false, false, true, 1);

        //Prints out a comparison of all 4 burgers
        System.out.println("BUGER COMPARISON");
        System.out.println("");
        System.out.println(burger2.equals(burger3));
        System.out.println(burger1.equals(burger4));
        System.out.println(burger2.equals(burger1));
        System.out.println(burger4.equals(burger3));
        System.out.println("\n");

        //Prints out the ingredients and price of the burgers
        System.out.println("BURGER 1");
        System.out.println("");
        System.out.printf("$%.2f ", burger1.getPrice());
        System.out.println(burger1);
        System.out.println("\n");


        System.out.println("BURGER 2");
        System.out.println("");
        System.out.printf("$%.2f ", burger2.getPrice());
        System.out.println(burger2);
        System.out.println("\n");

        System.out.println("BURGER 3");
        System.out.println("");
        System.out.printf("$%.2f ", burger3.getPrice());
        System.out.println(burger3);
        System.out.println("\n");

        System.out.println("BURGER 4");
        System.out.println("");
        System.out.printf("$%.2f ", burger4.getPrice());
        System.out.println(burger4);
        System.out.println("\n");

    }
}