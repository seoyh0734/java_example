import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Main {

  public static void main(String[] args)
  {
    System.out.println("main()");

    ExecutorService executor = Executors.newSingleThreadExecutor();

    Future<Integer> future = executor.submit(()-> {
      System.out.println("Thread func started!");
      return 10;
    });

    try {
    Integer result = future.get();
    System.out.println("result : " + result);
    } catch (Exception e) {
      e.printStackTrace();
    }

    executor.shutdown();

    return;
  }
}
