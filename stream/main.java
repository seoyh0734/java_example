import java.util.*;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

class main {

  Stream<String> createStreamFromArray() {
    String[] strArr = new String[] {"a", "b", "c"};

    Stream<String> strStream =  Arrays.stream(strArr);

    return strStream;
  }

  Stream<String> createStreamFromCollection() {
    List<String> strList = new ArrayList<>();
    strList.add("a");
    strList.add("b");
    strList.add("c");

    Stream<String> strStream = strList.stream();

    return strStream;
  }

  Stream<String> createStreamEmpty() {
    Stream<String> emptyStream = Stream.empty();

    return emptyStream;
   }

  Stream<String> createStreamUsingBuilder() {
    Stream<String> strStream = Stream.<String>builder().add("a").add("b").add("c").build();

    return strStream;
  }

  Stream<String> createStreamUsingGenerate() {
    Stream<String> strStream = Stream.generate(() -> "abc").limit(5);

    return strStream;
  }

  Stream<Integer> createStreamUsingIterate() {
    Stream<Integer> intStream = Stream.iterate(100, n -> n+2).limit(5);

    return intStream;
  }

  Stream<Integer> createStreamUsingRange() {
    Stream<Integer> intStream = IntStream.range(1, 5).boxed();

    return intStream;
  }

  public static void main(String[] argv) {
    System.out.println("main");

    main m = new main();

    // Create
    Stream<String> strStream1 = m.createStreamFromArray();
    Stream<String> strStream2 = m.createStreamFromCollection();
    Stream<String> strStream3 = m.createStreamEmpty();
    Stream<String> strStream4 = m.createStreamUsingBuilder();
    Stream<String> StrStream5 = m.createStreamUsingGenerate();
    Stream<Integer> intStream = m.createStreamUsingIterate();

    //strStream1.map(str -> str + "1").peek(str -> System.out.println(str)).collect(Collectors.toList());
    strStream1.map(str -> str + "1").peek(str -> System.out.println(str)).collect(Collectors.toList());
    //strStream1.map(str -> { str = str + "1";
    //                        str = str + "a";
    //                        return str;
    //                      }).filter(str -> true).peek(System.out::println).count();
    //List<String> strList = strStream1.map(str -> str + "1").collect(Collectors.toList());
    //for (String str : strList) {
    //  System.out.println(str);
    //}
    //List<String> strList = strStream1.toList();

    return ;
  }
};
