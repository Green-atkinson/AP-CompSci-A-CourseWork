// A class to represent lawyers.
public class Lawyer extends Employee {
    // overrides getVacationDays from Employee class
    public int getVacationDays() {
        return 15;
    }

    // overrides getVacationForm from Employee class
    public String getVacationForm() {
        return "pink";
    }

    // this is the Lawyer's added behavior
    public void sue() {
        System.out.println("I'll see you in court!");
    }

    // this is an overloaded version of sue, because it has different parameters
    public void sue(String insult) {
        System.out.println("I'll see you in court, " + insult + "!");
    }
}