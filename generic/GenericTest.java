import java.util.List;
import java.util.ArrayList;

class GenericTest {

  public static class Log {
    public Log()
    {
    }
    public void write()
    {
      System.out.println("Log");
    }
  }

  public static class LogA extends Log {
    @Override
    public void write()
    {
      System.out.println("LogA");
    }
  }

  public static class LogB extends Log {
    @Override
    public void write()
    {
      System.out.println("LogB");
    }
  }

  public static class LogManager<T extends Log> {
    public T log;

    public LogManager(T log)
    {
      this.log = log;
    }

    public void write()
    {
      log.write();
    }
  }

  public static void main(String[] args)
  {
    //ArrayList<Log> logArr = new ArrayList<Log>(3);
    List<Log> list = new ArrayList<Log>();
    list.add(new Log());
    list.add(new LogA());
    list.add(new LogB());

    for (Log log : list)
    {
      log.write();
    }

    return ;
  }
}
