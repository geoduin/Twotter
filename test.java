public class test {
    public static void main(String[] args) {
        user xin = new user("Xin");
        user james = new user("James");

        post p1 = new post("Terry sucks", xin);
        post p2 = new post("Gerrard is much better", xin);

        post p3 = new post("Justins ass is great", james);

        xin.addPosts(p1);
        xin.addPosts(p2);
        xin.addPosts(p3);

        comment c1 = new comment("Jerremy is the best", new user("Hans"));

        p1.addComment(c1);

        System.out.println("Result");
        xin.printPosts();
        p1.printComments();
    }
}
