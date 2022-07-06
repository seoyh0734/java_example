public class Main {

  public static void main(String[] args) {
    System.out.println("main() start");

    A a = new A();
    System.out.println("a.i : " + a.i);

    a.setI(100);

    B b = new B();
    System.out.println("b.i : " + b.i);

    b.setI(1000);
    System.out.println("a.i : " + a.i);
    System.out.println("b.i : " + b.i);
  }
}

class A {
  static int i=0;

  static int getI() {
    return i;
  }

  static void setI(int i) {
    A.i = i;
  }
}

class B extends A {
}

