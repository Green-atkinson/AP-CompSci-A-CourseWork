// Burger class, set variables, price, print what toppings each burger has
// and check if burgers are equal 

public class Burger {
    protected boolean ketchup;
    protected boolean mustard;
    protected boolean pickles;
    protected boolean onion;
    protected boolean mayo;
    protected boolean lettuce;
    protected boolean tomato;
    protected boolean chesse;
    protected int patties = 1;


    public Burger() {
        setValues(false, false, false, false, false, false, false, false, 1);
    }

    public Burger(boolean k, boolean mu, boolean pi, boolean o, boolean ma, boolean l,
                  boolean t, boolean c, int pa) {
        if(pa > 3  || pa < 1) {
            throw new IllegalArgumentException();
        }
        setValues(k, mu, pi, o, ma, l, t, c, pa);
    }

    //set boolean values of each topping
    public void setValues(boolean k, boolean mu, boolean pi, boolean o, boolean ma,
                          boolean l, boolean t, boolean c, int pa) {
        setKetchup(k);
        setMustard(mu);
        setPickles(pi);
        setOnion(o);
        setMayo(ma);
        setLettuce(l);
        setTomato(t);
        setChesse(c);
        setPatties(pa);
    }

    
    public void setKetchup(boolean ketchup) {
        this.ketchup = ketchup;
    }
    public void setMustard(boolean mustard) {
        this.mustard = mustard;
    }
    public void setPickles(boolean pickles) {
        this.pickles = pickles;
    }
    public void setOnion(boolean onion) {
        this.onion = onion;
    }
    public void setMayo(boolean mayo) {
        this.mayo = mayo;
    }
    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }
    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }
    public void setChesse(boolean chesse) {
        this.chesse = chesse;
    }
    public void setPatties(int patties) {
        this.patties = patties;
    }
    public boolean getKetchup() {
        return ketchup;
    }
    public boolean getMustard() {
        return mustard;
    }
    public boolean getPickles() {
        return pickles;
    }
    public boolean getOnion() {
        return onion;
    }
    public boolean getMayo() {
        return mayo;
    }
    public boolean getLettuce() {
        return lettuce;
    }
    public boolean getTomato() {
        return tomato;
    }
    public boolean getChesse() {
        return chesse;
    }
    public int getPatties() {
        return patties;
    }


    //set price of burger, add cost's if has certain toppings
    public double getPrice() {
        double price = 4.00;
        price += patties;
        if(tomato == true) {
            return price + 0.25;
        }
        if(chesse == true) {
            return price  + 0.50;
        }
        return price;
    }

    //print true/false for what toppings it has
    public String toString() {
        return "Ketchup: " + ketchup + ", Mustard: " + mustard + ", \nPickles: " + pickles
                + ", Onion: " + onion + ", Mayo: " + mayo + ", \nLettuce: " + lettuce
                + ", Tomato: " + tomato + ", Chesse: " + chesse + ", \nPatties: " + patties;
    }

    //check to see if 2 burgers are equal
    public boolean equals(Object o) {
        if(o instanceof Burger) {
            Burger other = (Burger)o;
            return this.ketchup == other.ketchup && this.mustard == other.mustard &&
            this.pickles == other.pickles && this.onion == other.onion &&
            this.mayo == other.mayo && this.lettuce == other.lettuce && this.tomato ==
            other.tomato && this.chesse == other.chesse && this.patties == other.patties;
        } else {
            return false;
        }
    }
}
