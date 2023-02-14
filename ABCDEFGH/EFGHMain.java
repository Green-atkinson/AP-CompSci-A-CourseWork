//Demonstrates how to use inheritances with Client program to use the E, F, G, and H classes

public class EFGHMain {
    public static void main(String[] args) {
        G[] elements = {new E(), new F(), new G(), new H()};

        //will print through each class, follow along to understand inheritance
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
            elements[i].method1();
            elements[i].method2();
            System.out.println();
        }
    }
}