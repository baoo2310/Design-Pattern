public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> GlobalInstance.getInstance().doSthing());
        Thread thread2 = new Thread(() -> GlobalInstance.getInstance().doSthing());

        thread1.start();
        thread2.start();
    }
}
