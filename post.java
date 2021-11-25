import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class post {

    private String text;
    private int Likes;
    private user poster;
    private int commentNumber;
    private List<comment> commentSection;

    public post(String text, user poster) {
        this.text = text;
        this.Likes = 0;
        this.poster = poster;
        this.commentNumber = 1;
        this.commentSection = new ArrayList<>();
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
        for (comment comment : commentSection) {
            System.out.println(comment);
        }
    }

    public void addComment(comment text) {
        this.commentSection.add(text);
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

    public String toString() {
        return this.text + ", Original poster: " + this.poster.getName() + ", Likes: " + this.Likes + ", Comments: ";
    }

}
