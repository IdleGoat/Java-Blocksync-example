public class MyRunnable implements Runnable {
    private SharedResource sharedResource;

    public MyRunnable(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        // update shared resource
        sharedResource.update(Thread.currentThread().getName());
    }
}
