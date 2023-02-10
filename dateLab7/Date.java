// Create a class called Date that represents a year, month, and day. It must contain private fields,
// accessor and mutator methods for each field, a toString()method that is non-default, at least two
// constructors, and work for the following client code.
public class Date {
    private int Day;
    private int Month;
    private int Year;

    public String toString(){
        return "The date is " + Month + "/" + Day + "/" + Year + ".";
    }

    //constructers
        //same name as class
        //doesn't return
        //used to allocate memory
    public Date(int M, int D, int Y) {
        Month = M;
        Day = D;
        Year = Y;
    }

    public Date(Date d2) {
        this(d2.Month, d2.Day, d2.Year);
        //thanks evan
        Month = this.Month;
        Day = this.Day;
        Year = this.Year;
    }

    //get the year
    public int getYear(){
        return Year;
    }

    public boolean isLeapYear(){
        return Year % 4 == 0;
    }

    public void setMonth(int MonthO) {
        Month = MonthO;
    }
    public void setDay(int DayO) {
        Day = DayO;
    }
    public void setYear(int YearO) {
        Year = YearO;
    }
}
