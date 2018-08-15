public class BlogPost {

    String authorName;
    String title;
    String text;
    String publicationDate;

    public BlogPost(String authorName, String title, String text, String publicationDate) {

        this.authorName = authorName;
        this.publicationDate = publicationDate;
        this.text = text;
        this.title = title;
    }

    public String toString() {
        return this.title + "titled by " + this.authorName + " posted at " + this.publicationDate + '\n' + this.text;
    }

}
