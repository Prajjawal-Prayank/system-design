package singleton;

public class Application {

    public static void main(String args[]) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if(singleton1==singleton2) {
            System.out.println("Both objects are same. Singleton works.");
        } else {
            System.out.println("Both objects are different. Singleton does not work.");
        }
    }

}