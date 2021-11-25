public class test {
    public static void main(String[] args) {
        user xin = new user("Xin");
        user james = new user("James");

        post p1 = new post("Terry sucks", xin);

        xin.addPosts(p1);

        comment c1 = new comment(1, "Jerremy is the best", james);
        comment c2 = new comment(2, "Test test", james);

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println("Result");
        xin.printPosts();
        p1.printComments();
    }
}
