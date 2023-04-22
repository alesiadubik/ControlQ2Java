public class Toy {
    private int id;
    private String name;
    private double time;

    public Toy(int id, String name, Double time) {
      this.id = id;
      this.name = name;
      this.time = time;
    }

    public int getId() {
      return id;
    }

    public String getName() {
      return name;
    }

    public double getTime() {
      return time;
    }

    public void setTime(double time) {
      this.time = time;
    }
  }
