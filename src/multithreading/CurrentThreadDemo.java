/**
 * Created by Rimon Mostafiz on 3/17/2016.
 */
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        /*System.out.println("Name " + t.getName());
        System.out.println("ID: " + t.getId());
        t.setName("my thread");
        System.out.println("Name " + t);

        //new NewThread();
        //new NewThreadAgain();*/
        new DemoMultThread("Rimon", 1000);
        new DemoMultThread("Love", 1000);
        new DemoMultThread("Remu", 1500);

        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Main : " + i);
                Thread.sleep(4000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main Thread Ends!!");
    }
}
