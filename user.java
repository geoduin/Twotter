import java.util.ArrayList;
import java.util.List;

public class user {
    private String name;
    private List<post> allPosts;
    private int likes;
    private int posts;
    private comment reacts;

    public user(String name) {
        this.name = name;
        this.allPosts = new ArrayList<>();
        this.likes = 0;
        this.posts = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printPosts() {
        for (post post : allPosts) {
            System.out.println(post);
        }
    }

    public void addLikes() {
        this.likes++;
    }

    public void addPosts() {
        this.posts++;
    }

    public void addLikes(int likes) {
        this.likes += likes;
    }

    public int getLikes() {
        return likes;
    }

    public void addPosts(post posts) {
        this.allPosts.add(posts);
        this.posts++;
    }

    public int getPosts() {
        return posts;
    }

    public void addCommentToPost(comment text, String name) {
        // Hier voegt men geen comment toe

    }

    public String toString() {
        return "Name: " + this.name + ", Likes: " + getLikes();
    }
}
