class A {
  void print() {
    System.out.println("Class A");
  }
}

class B extends A {
  @Override
  void print() {
    System.out.println("Class B");
  }
}

class C extends A {
  @Override
  void print() {
    System.out.println("Class C");
  }
}

class Main {
  public static void main(String[] args) {
    System.out.println("main()");
    A a = new A();
    B b = new B();
    C c = new C();
    a.print();
    b.print();
    c.print();

    Reflections rfs ;//= new Reflections("");
    return ;
  }
}
