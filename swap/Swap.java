
class Swap {
  public static class MyObject {
    public int num;
    public MyObject(int num)
    {
      this.num = num;
    }
    public String toString()
    {
      return Integer.toString(num);
    }
    public static void print()
    {
      System.out.println("MyObject");
    }
  }
  public static void swap(int a, int b)
  {
    int tmp = a;
    a = b;
    b = tmp;
  }

  public static void swap(String str1, String str2)
  {
    String tmp = str1;
    str1 = str2;
    str2 = tmp;
  }

  public static void swap(Integer a, Integer b)
  {
    Integer tmp = a;
    a = b;
    b = tmp;
  }

  public static void swap(MyObject a, MyObject b)
  {
    int tmp = a.num;
    a.num = b.num;
    b.num = tmp;
  }

  public static void main(String[] args) {
    //Integer a = 10, b = 20;
    String a = "Hello", b = "World";
    System.out.println(a + " " + b);
    swap(a, b);
    System.out.println(a + " " + b);

    MyObject.print();
    MyObject m1 = new MyObject(10);
    MyObject m2 = new MyObject(20);
    System.out.println(m1 + " " + m2);
    swap(m1, m2);
    System.out.println(m1 + " " + m2);


    return ;
  }
}
