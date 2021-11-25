
public class comment {
    private String comment;
    private user user;
    private int likes;
    private int nr;

    public comment(int a, String comment, user twotters) {
        this.nr = a;
        this.comment = comment;
        this.user = twotters;
        this.likes = 0;
    }

    public int getNr() {
        return nr;
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
        return "Nr: " + this.nr + ", Comment " + this.comment + ", posted by: " + this.user.getName() + ", Likes:  "
                + this.likes;
    }
}
