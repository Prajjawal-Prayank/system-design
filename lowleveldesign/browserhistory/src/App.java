import browserhistory.BrowserHistory;

public class App {
    public static void main(String[] args) throws Exception {
        BrowserHistory bh = new BrowserHistory("youtube.com");
        bh.visit("google.com");
        bh.visit("github.com");
        System.out.println(bh.back());
        System.out.println(bh.forward());
        bh.visit("linkedin.com");
        System.out.println(bh.forward());
        System.out.println(bh.back());
    }
}
