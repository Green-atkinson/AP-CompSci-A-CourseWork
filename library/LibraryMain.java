public class LibraryMain {
    public static void main(String[] args) {
        Media[] libraryItem = {
            new Video("Shawshank Redemption", 101, "DVD", "Frank Darabont", "Drama", 143),
            new Music("Appetite for Destruction", 102, "CD", "Rock", 54, "Guns N' Roses"),
            new Music("Black on Both Sides", 103, ".mp3", "Hip-hop", 71, "Mos Def"),
            new Text("Othello", 104, "E-Reader", 26450, "William Shakespeare"),
            new Text("Captain Underpants and the Tyrannical Retaliation of the"
                     + " Turbo Toilet 2000", 105, "Paperback", 12145, "Dav Pilkey")
        };
        for(Media item : libraryItem){
            System.out.println(item.getTitle() + " created by " + item.creator());
            System.out.println(item.getFormat() + " item number: " + item.getIDNum());
        }

    }
}