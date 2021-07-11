import java.util.concurrent.*;

public class CallableThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> task1 = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "My Task is done";
            }

        };

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(task1);
        if (future.isDone()) {
            try {
//                System.out.println(future.get(500, TimeUnit.MILLISECONDS));
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException e) {
                System.out.println(e);
            }
            executorService.shutdown();
        }
    }
}
