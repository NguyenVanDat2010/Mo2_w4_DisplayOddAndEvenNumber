public class Main {
    public static void main(String[] args) throws InterruptedException {
        OddThread oddThread = new OddThread(10);
        EvenThread evenThread = new EvenThread(10);

        oddThread.start();
        oddThread.join();
        evenThread.start();
    }
}
