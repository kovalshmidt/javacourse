package Concurrency.ExecutorService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceExample6 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<Callable<String>> callables = new ArrayList<>();
        callables.add(newCallable("Call 1"));
        callables.add(newCallable("Call 2"));
        callables.add(newCallable("Call 3"));
        try {
            //In case you have many servers, but you just want one to return the information
            List<Future<String>> result = executorService.invokeAll(callables);
            for (Future future:result) {
                System.out.println(future.get());
            }
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }

    private static Callable newCallable(String message) {
        return new Callable() {
            @Override
            public Object call() throws Exception {
                String callMessage = Thread.currentThread().getName() + " : " + message;
                return callMessage;
            }
        };
    }
}
