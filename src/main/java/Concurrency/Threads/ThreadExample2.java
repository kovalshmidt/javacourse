package Concurrency.Threads;

public class ThreadExample2 {
    public static void main(String[] args) {
        StoppableRunnable stopRun = new StoppableRunnable();
        Thread thread = new Thread(stopRun);
        thread.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Requesting to stop");
        stopRun.requestStop();
        System.out.println("stop requested");
    }

    private static class StoppableRunnable implements Runnable{
        private boolean stopRequest = false;
        @Override
        public void run() {
            System.out.println("Stoppable is running");
            while (!isStopRequested()){
                sleep(1000);
                System.out.println("...");
            }
            System.out.println("Stoppable has stopped");
        }

        public void requestStop(){
            this.stopRequest = true;
        }

        public boolean isStopRequested(){
            return stopRequest;
        }

        private void sleep(long ms) {
            try {
                Thread.sleep(ms);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
