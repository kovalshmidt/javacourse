package Concurrency.ExecutorService;

import java.util.concurrent.*;

public class ExecutorServiceExample4 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future future = executorService.submit(newCallable("Call 1"));
        System.out.println(future.isDone());
        try {
            String result = (String) future.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(future.isDone());
        executorService.shutdown();
    }

    private static Callable newCallable(String message){
        return new Callable() {
            @Override
            public Object call() throws Exception {
                String callMessage = Thread.currentThread().getName()+" : "+message;
                return callMessage;
            }
        };
    }
}
