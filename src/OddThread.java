public class OddThread extends Thread {
    private int oddNumber;

    public OddThread(int oddNumber) {
        this.oddNumber = oddNumber;
    }

    @Override
    public void run() {

        for (int i=0;i<oddNumber;i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
