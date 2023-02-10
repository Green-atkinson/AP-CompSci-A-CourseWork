public class NumWordMain {
    public static void main(String[] args) {
        NumWord first = new NumWord(1, "Chicken");
        NumWord second = new NumWord(1, "Anti-establishment Government");
        NumWord third = new NumWord(1, "Chicken");
        String fourth = "fourth";
        NumWord fifth = first;

        System.out.println(first.equals(second));
        System.out.println(first.equals(third));
        System.out.println(first.equals(fourth));
        System.out.println(second.equals(third));
        System.out.println(first.equals(fifth));
    }
}