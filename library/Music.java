public class Music extends Media
{
    //fields
    private String artist;
    private String genre;
    private int runtime;

    //constructors
    public Music(String title, int IDNum, String format, String genre, int runtime, String artist){
        super(title, IDNum, format);
        this.artist = artist;
        this.genre = genre;
        this.runtime = runtime;
    }
    public Music(){
        super();
        this.genre = "No Genre Specified";
        this.runtime = -1;
    }

    //methods
    public String getArtist(){
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void setRuntime(int runtime){
        this.runtime = runtime;
    }

    //returns true if item is shorter than this
    public boolean isLonger(Library item){
        if(item instanceof Music) {
            Music other = (Music)item;
            return runtime > other.getRuntime();
        } else {
            return false;
        }
    }

    //returns the artist
    public String creator() {
        return getArtist();
    }

}