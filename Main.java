public class Main {
    public static void main(String[] args) {
        // membuat objek shared resource
        SharedResource sharedResource = new SharedResource();

        // membuat dan memulai thread
        Thread thread1 = new Thread(new MyRunnable(sharedResource));
        Thread thread2 = new Thread(new MyRunnable(sharedResource));
        thread1.start();
        thread2.start();
    }
}

