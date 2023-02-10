public class Media implements Library{

    private String title;
    private int IDNum;
    private String format;

    public Media(String title, int IDNum, String format){
        this.title = title;
        this.IDNum = IDNum;
        this.format = format;
    }
    public Media(){
        this.title = "Title Unspecified";
        this.IDNum = -1;
        this.format = "Format Unspecified";
    }
    public String getTitle() {
        return title;
    }
    public int getIDNum(){
        return IDNum;
    }
    public String getFormat(){
        return format;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setIDNum(int IDNum){
        this.IDNum = IDNum;
    }
    public void setFormat(String format) {
        this.format = format;
    }
    public boolean isLonger(Library item) {
        System.out.println("isLonger() called from inappropriate class");
        return false;
    }
    public String creator() {
        return "creator() called from inappropriate class";
    }
}