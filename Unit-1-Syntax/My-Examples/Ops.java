//define a calss called Ops
public class Ops {

  // define a method called sum
  // this metho returns and int
  // it has a parameter named x that is of type int
  // it has a parameter named y that is of type int

  public static int sum (int x, int y) {
    return x + y;
  }

  public static int mult (int x, int y, int z) {
    return x * y * z;
  }

  public static int power (int x, int y) {
    // int y;
    // y = 2;

    for (int i = 1; i < y; i++) {
      x = x * x;
    }
    return x;
  }

  // main get executed when we run this class with the java command 
  public static void main (String [] args) {
    //invoke sum, passing in 1 & 2 as arguments and print the result
    // System.out.println( sum(1,2) );
    // System.out.println( mult(2,5,7) );
    System.out.println( power(5,3) );
  }

}