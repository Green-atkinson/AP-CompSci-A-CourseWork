public class Video extends Media {
    //fields
    private String director;
    private String genre;
    private int runtime;

    //constructors
    public Video(String title, int IDNum, String format, String director, String genre, int runtime) {
        super(title, IDNum, format);
        this.director = director;
        this.genre = genre;
        this.runtime = runtime;
    }

    public Video() {
        super();
        this.director = "Director Unspecified";
        this.genre = "Genre Unspecified";
        this.runtime = -1;
    }

    //methods
    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public boolean isLonger(Library item) {
        if(item instanceof Video){
            Video other = (Video) item;
            return getRuntime() > other.getRuntime();
        } else {
            return false;
        }
    }
    public String creator() {
        return director;
    }
}