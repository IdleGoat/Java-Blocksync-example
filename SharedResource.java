public class SharedResource {
    private String value;

    public synchronized void update(String value) {
        // critical section of code
        // hanya satu thread yang dapat mengakses method ini
        this.value = value;

        // print the value
        System.out.println(Thread.currentThread().getName() + ": Updating shared resource with value " + value);
    }
}
