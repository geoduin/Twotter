import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Twotter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<user> users = new ArrayList<>();

        while (true) {
            System.out.println("Welcome on Twotter. Tell me what you want to do.");
            String i = scan.nextLine();
            if (i.isEmpty()) {
                break;
            }

            if (i.equals("add User")) {
                String name = scan.nextLine();
                user twotterUser = new user(name);
                users.add(twotterUser);
            }

            if (i.equals("Post")) {
                System.out.println("Who is posting?");
                String name = scan.nextLine();
                for (user user : users) {
                    if (user.getName().equals(name)) {
                        System.out.println("What do you want to post?");
                        String post = scan.nextLine();
                        post newPost = new post(post, user);

                        user.addPosts(newPost);
                    }
                }
            }

            // Like functie moet nog toegevoegd worden
            if (i.equals("Like")) {

            }

            if (i.equals("Show Posts")) {
                System.out.println("Who?");
                String name = scan.nextLine();

                for (user user : users) {
                    if (user.getName().equals(name)) {
                        user.printPosts();
                    }
                }

            }

            // Comment toevoegen is nog in een beta
            if (i.equals("Comment")) {
                String usr = scan.nextLine();

                for (user user : users) {
                    if (user.getName().equals(usr)) {
                        System.out.println("What do you want to comment?");
                        String text = scan.nextLine();
                        comment newComment = new comment(text, user);
                        System.out.println("On which comment do you want to react?");
                        String other = scan.nextLine();
                        user.addCommentToPost(newComment, other);
                    }
                }
            }
        }
    }
}
