package syncengine;

public class ReplicationWorker implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("Executing distributed synchronization");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}