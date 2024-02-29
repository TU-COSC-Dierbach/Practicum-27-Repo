import java.util.Random;

public class Main {
  public static void main(String[] args) {

    Object obj = null;
    Random rand = new Random();

    // generate random number from up to but excluding 4
    int n = rand.nextInt(1, 4);

    switch(n) {
      case 1: obj = new Dishwasher("1243023"); break;
      case 2: obj = new Toaster("Ad9201"); break;
      case 3: obj = new Oven("F4231211KL"); break;
    }

    describeIt(obj);
  }

  public static void describeIt(Object something) {
  // ---------------------------------------
  // Should display either:
  //      Dishwasher  Model Number:  1243023
  //      Toaster  Model Number: AD9201
  //      Oven  Model Number: F4231211KL
  // ---------------------------------------
  // (to complete)
      
      
  }
  
}
