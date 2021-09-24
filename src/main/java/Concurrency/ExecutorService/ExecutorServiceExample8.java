package Concurrency.ExecutorService;

import java.util.concurrent.*;

public class ExecutorServiceExample8 {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future future = executorService.submit(newCallable("Task 1"));
        System.out.println("Future is done? " + future.isDone()); //false
        boolean mayInterrupt = true;
        boolean wasCancelled = future.cancel(mayInterrupt);
        System.out.println("Future is cancelled? " + wasCancelled);

        try {
            String result = (String) future.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (CancellationException e) {
            System.out.println("Can not call future.get(), since task was cancelled");
        }

        System.out.println("Future is done? " + future.isDone());
        System.out.println("Future is cancelled? " + future.isCancelled());

        executorService.shutdown();

    }

    private static Callable newCallable(String message) {
        return new Callable() {
            @Override
            public Object call() throws Exception {
                String completeMessage = Thread.currentThread().getName() + " : " + message;
                return completeMessage;
            }
        };
    }
}
