package threads.executor_service;

import java.util.concurrent.*;

public class AnotherExecutorServiceExampleApp {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<Integer> future = service.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(3000);
                int c = 10;
                return c;
            }
        });

        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("END");
        service.shutdown();
    }
}
