public class EvenThread extends Thread {
    private int evenNumber = 10;

    public EvenThread(int evenNumber) {
        this.evenNumber = evenNumber;
    }

    @Override
    public void run() {
        for (int i=0;i<evenNumber;i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                try {
                    Thread.sleep(15);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
