// A class to represent legal secretaries
public class LegalSecretary extends Secretary {
    // overrides getSalary from Employee class
    public double getSalary() {
        return 45000.0;
    }

    // this is the LegalSecretary's added behavior
    public void fileLegalBriefs() {
        System.out.println("I could file all day!");
    }

}