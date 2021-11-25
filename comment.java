
public class comment {
    private String comment;
    private int volgnummer;
    private user user;
    private int likes;

    public comment(String comment, user twotters) {
        this.comment = comment;
        this.user = twotters;
        this.likes = 0;
    }

    public String getComment() {
        return comment;
    }

    public user getUser() {
        return user;
    }

    public void addLikes() {
        this.likes++;
    }

    public int getLikes() {
        return likes;
    }

    public String toString() {
        return this.comment + ", posted by: " + this.user.getName() + ", Likes:  " + this.likes;
    }
}
