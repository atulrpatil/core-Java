import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecuterService {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Runnable task1 = () -> {
            System.out.println("My task1 : " + Thread.currentThread().getName());
        };

        Runnable task2 = () -> {
            System.out.println("My task2 : " + Thread.currentThread().getName());
        };

        Runnable task3 = () -> {
            System.out.println("My task3 : " + Thread.currentThread().getName());
        };

        Runnable task4 = () -> {
            System.out.println("My task4 : " + Thread.currentThread().getName());
        };

        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);
        executorService.submit(task4);
        executorService.shutdown();
    }
}
