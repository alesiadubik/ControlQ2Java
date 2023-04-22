import java.io.FileWriter;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    Shop rangeShop = new Shop();
    rangeShop.addToy(new Toy(1, "Конструктор", 0.2));
    rangeShop.addToy(new Toy(2, "Робот", 0.5));
    rangeShop.addToy(new Toy(3, "Кукла", 0.2));
    rangeShop.addToy(new Toy(3, "Корабль", 0.3));
    rangeShop.addToy(new Toy(3, "Кран", 0.6));
    rangeShop.addToy(new Toy(3, "Машина", 0.5));
    rangeShop.addToy(new Toy(3, "Лото", 0.6));
    
    try {
      FileWriter writer = new FileWriter("Shop of toys");
      int maxNumber = 10;
      int count = 0;
      while (count < maxNumber) {
        Toy toy = rangeShop.getRandomToy();

        if (toy != null) {
          count++;
          writer.write(count + ". " + "Выбор: " + toy.getName() + ", частота выпадения" + " " + toy.getTime() +  "%\n");
        }
      }

      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
