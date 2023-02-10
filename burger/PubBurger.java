public class PubBurger extends Burger {
    private String fancySauce;
    private String fancyBun;

    public PubBurger(boolean k, boolean mu, boolean pi, boolean o, boolean ma, boolean l,
                  boolean t, boolean c, int pa) {
        super(k, mu, pi, o, ma, l, t, c, pa);
        fancySauce = "";
        fancyBun = "";
    }

    public PubBurger(boolean k, boolean mu, boolean pi, boolean o, boolean ma, boolean l,
                  boolean t, boolean c, int pa, String fs, String fb){
        super(k, mu, pi, o, ma, l, t, c, pa);
        fancySauce = fs;
        fancyBun = fb;
    }

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
}