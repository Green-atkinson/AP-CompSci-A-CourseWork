//pub burger class, add extra costs

public class PubBurger extends Burger {
    private String fancySauce;
    private String fancyBun;

    //get toppings from superclass burger, intialize Pub burger toppings
    public PubBurger(boolean k, boolean mu, boolean pi, boolean o, boolean ma, boolean l,
                  boolean t, boolean c, int pa) {
        super(k, mu, pi, o, ma, l, t, c, pa);
        fancySauce = "";
        fancyBun = "";
    }

    //get toppings from superclass burger, set pub burger toppings
    public PubBurger(boolean k, boolean mu, boolean pi, boolean o, boolean ma, boolean l,
                  boolean t, boolean c, int pa, String fs, String fb){
        super(k, mu, pi, o, ma, l, t, c, pa);
        fancySauce = fs;
        fancyBun = fb;
    }

    //set topping values
    public void setFancySauce(String fancySauce) {
        this.fancySauce = fancySauce;
    }
    public void setFancyBun(String fancyBun) {
        this.fancyBun = fancyBun;
    }
    public String getFacnySauce() {
        return fancySauce;
    }
    public String FancyBun() {
        return fancyBun;
    }

    public double getPrice() {
        return super.getPrice() + 2.00;
    }

    //print true/false for what toppings it has
    public String toString() {
        return super.toString() + ", Fancy Sause: " + fancySauce + ", \nFancy Bun: " + fancyBun;
    }

    //check to see if 2 burgers are equal
    public boolean equals(Object o) {
        if(o instanceof PubBurger) {
            PubBurger other = (PubBurger)o;
            return this.ketchup == other.ketchup && this.mustard == other.mustard &&
            this.pickles == other.pickles && this.onion == other.onion &&
            this.mayo == other.mayo && this.lettuce == other.lettuce && this.tomato ==
            other.tomato && this.chesse == other.chesse && this.patties == other.patties
            && this.fancySauce == other.fancySauce && this.fancyBun == other.fancyBun;
        } else {
            return false;
        }
    }
}