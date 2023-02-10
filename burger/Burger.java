// 4 constructer
// Write a class called Burger, a class called PubBurger that extends it, and a driver class called
// BurgerMain that proves the functionality listed below . Burger must contain boolean fields called
// ketchup, mustard, pickles, onion, mayo, lettuce, tomato and cheese. It must
// also contain an integer field called patties. PubBurgers have two additional fields, both
// Strings, called FancySauce and FancyBun respectively. Tomatoes cost $.25, cheese costs $.50,
// and burgers start at $4.00, with $1 added for each patty after 1, maximum 3. If a burger is a pub burger,
// it sh/*ould cost $2 more than a burger with exactly the same condiments. Two Burgers are equal if their
// condiments and status as a PubBurger are all the same.
// You must:
// 1. Follow the syntax template for well-encapsulated classes.
// 2. Include the private fields listed above.
// 3. Have constructors that re-implement the default constructor and allow a user to set all fields.
// 4. Implement getPrice(), equals(), and toString()
// 5. Have accessors and mutators for each field.
// 6. Include a driver class called BurgerMain that proves you have completed the work above.
// 7. Save all of your w*/ork in a folder called &lt;lastName&gt;Burger.
//in equalls, you need to compare 3 burger\s

//look at NumWord.java



public class Burger {
    private boolean ketchup;
    private boolean mustard;
    private boolean pickles;
    private boolean onion;
    private boolean mayo;
    private boolean lettuce;
    private boolean tomato;
    private boolean chesse;
    private int patties = 1;


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
    public String toString() {
        return "Ketchup: " + ketchup + ", Mustard: " + mustard + ", \nPickles: " + pickles
                + ", Onion: " + onion + ", Mayo: " + mayo + ", \nLettuce: " + lettuce
                + ", Tomato: " + tomato + ", Chesse: " + chesse + ", \nPatties: " + patties;
    }


    public boolean equals(Object o) {
        if( o instanceof Burger) {
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
