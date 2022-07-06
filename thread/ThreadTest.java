import java.lang.Thread;

class ThreadTest implements Runnable {
  static Integer globalNum = 0;

  public void run()
  {
    //while (true)
    for (int i=0; i<1000; i++)
    {
      try {
        synchronized(globalNum) {
          System.out.println(globalNum++);
        }
      Thread.sleep(1);
      } catch (InterruptedException e)
      {
        e.printStackTrace();
      }
    }
  }

  public static void main(String[] args)
  {
    //Thread t = new Thread(new ThreadTest());
    //Thread t1 = new Thread(new ThreadTest());
    //t.start();
    //t1.start();
    new Thread(()->{ System.out.println("Hellow"); }).start();

    Custom c = new Custom() {
      public void print() {
        System.out.println("Custom");
      }
    };
    c.print();
  }
}
