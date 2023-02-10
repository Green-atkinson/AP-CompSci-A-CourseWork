public class Text extends Media {
        private int wordCount;
        private String author;

        public Text(String title, int IDNum, String format, int wordCount, String author){
            super(title, IDNum, format);
            this.wordCount = wordCount;
            this.author = author;
        }

        public Text() {
            super();
            this.wordCount = -1;
            this.author = "Author Unspecified";
        }

        public int getWordCount() {
            return wordCount;
        }

        public String getAuthor() {
            return author;
        }

        public void setWordCount(int wordCount) {
            this.wordCount = wordCount;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public boolean isLonger(Library item){
            if(item instanceof Text) {
                Text other = (Text)item;
                return getWordCount() > other.getWordCount();
            } else {
                return false;
            }
        }
        public String  creator() {
            return getAuthor();
        }
}