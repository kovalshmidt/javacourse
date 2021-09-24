package Concurrency.ExecutorService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample5 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<Callable<String>> callables = new ArrayList<>();
        callables.add(newCallable("Call 1"));
        callables.add(newCallable("Call 2"));
        callables.add(newCallable("Call 3"));
        try {
            //In case you have many servers, but you just want one to return the information
            String result = executorService.invokeAny(callables);
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
