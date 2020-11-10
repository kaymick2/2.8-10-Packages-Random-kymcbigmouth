import java.util.Random;

class Main {
  public static void main(String[] args) {
    Random rand = new Random();
    int value = rand.nextInt(9);
    System.out.println(value);
    value = rand.nextInt(9) + 1;
    System.out.println(value);
    System.out.println("your random number is (within 3-15)is: " + extraMode());
    System.out.println("your random boolean is: " + tooExtra());

  }

  public static int extraMode() {
    Random threefifteen = new Random();
    int x = threefifteen.nextInt(16);
    x = threefifteen.nextInt(16) + 3;
    return x;

  }

  public static boolean tooExtra() {
    Random randBool = new Random();
    boolean y = randBool.nextBoolean();
    return y;

  }
}
