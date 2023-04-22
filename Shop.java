import java.util.Comparator;
import java.util.PriorityQueue;

public class Shop {
    private PriorityQueue<Toy> queue;

    public Shop () {
        queue = new PriorityQueue<>(Comparator.comparing(Toy::getTime).reversed()); 
    }
    public void addToy(Toy toy) {
        queue.add(toy);
    }

    public Toy getRandomToy() {
        double randomNumber = Math.random();

        for (Toy toy : queue) {
            if (randomNumber < toy.getTime()) {
                return toy;
            }
            randomNumber -= toy.getTime();
        }

        return null;
    }

}