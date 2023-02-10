//Create a new class. It must have at least two fields of at least two different types. It must also have at least three methods, of which one is a mutator, one is a accessor, and one is toString();
// Then, write client code that shows how your class works. Remember to sace all of these in the same folder

public class Student {
    int grade;
    String name;
    String location;

    public void setGrade(int gradeO) {
        grade = gradeO;
    }

    public void setName(String nameO) {
        name = nameO;
    }

    public void setLocation(String locationO){
        location = locationO;
    }

    public String toString(){
        return name + " has failed the " + grade + " grade at\n" + location + ". (╥_╥)";
    }


    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

}