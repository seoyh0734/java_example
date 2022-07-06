import java.util.stream.*;
import java.util.*;

class Product {
  public String name;
  public int price;

  public int getPrice() {
    return price;
  };
  public void setPrice(int price) {
    this.price = price;
  };

  public Product(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public String toString() {
    return name + " " + Integer.toString(price);
  };

  public Product union(Product product) {
    return new Product(this.name + "&" + product.name, this.price + product.price );
  }

  public static void main(String[] args) {
    Product pen = new Product("pen", 100);
    Product cup = new Product("cup", 200);
    Product phone = new Product("phone", 1000);

    Stream<Product> pdStream = Arrays.<Product>asList(pen, cup, phone).stream();

    //pdStream.map(pd -> { pd.setPrice(pd.getPrice() + 100); return pd; })
    //        .filter(pd -> pd.getPrice() > 1000)
    //        .reduce((a, b) -> a.union(b))
    //        .ifPresent(System.out::println);

    //pdStream.parallel()
    pdStream
      .map(pd -> {
                   pd.price += 100;
                   return pd;
                 })
      .filter(pd -> pd.name.matches(".*[ne]"))
      .forEach(System.out::println);
    return ;
  }
}
