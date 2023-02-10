public class MainStudent{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.setGrade(7);
        s1.setName("Zag'thak");
        s1.setLocation("Honeysuckle Middle School in Dothan, Alabama");

        s1.getGrade();
        s1.getName();
        s1.getLocation();

        System.out.println(s1);
        System.out.println("");

        System.out.println("Zag'thak later was kicked out of middle school");
        System.out.println("for being 16 in the 7th grade. He was sent to a");
        System.out.println("special secondary school because he was stupid.");
        System.out.println("\n");

        s2.setGrade(9);
        s2.setName("Stu");
        s2.setLocation("East Buchanan Community School in quasqueton, Iowa");

        s2.getGrade();
        s2.getName();
        s2.getLocation();

        System.out.println(s2);
        System.out.println("");


        System.out.println("Stu tried really hard, but he just wasn't smart");
        System.out.println("enough. He was Zag'thak's half brother, so he figured");
        System.out.println("this would happen sooner or later. Oh well, it's");
        System.out.println("a hard knock life.");
    }
}