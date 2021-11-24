import java.util.ArrayList;
import java.util.List;

public class post {

    private String text;
    private int Likes;
    private user poster;
    private List<comment> section;

    public post(String text, user poster) {
        this.text = text;
        this.Likes = 0;
        this.poster = poster;
        this.section = new ArrayList<>();
    }

    public void setLikes(int likes) {
        Likes = likes;
    }

    public int getLikes() {
        return Likes;
    }

    public void addLikes() {
        this.Likes++;
    }

    public void printComments() {
        for (comment comment : section) {
            System.out.println(comment);
        }
    }

    public void addComment(comment text) {
        this.section.add(text);
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public user getPoster() {
        return this.poster;
    }

    public List<comment> getSection() {
        return this.section;
    }

    public String toString() {
        return this.text + ", Original poster: " + this.poster.getName() + ", Likes: " + this.Likes + ", Comments: ";
    }

}
