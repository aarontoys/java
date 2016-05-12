class Car extends Vehicle {
  
  //methods
  public String drive(int miles) {
    return "This car just drove " + miles + " miles.";
  }
  //main
  public static void main(String[] args) {
    Car mike = new Car();
    System.out.println(mike.honk());
    mike.setColor("blue");
    mike.setWheels(4);
    System.out.println(mike.output());
    System.out.println(mike.drive(20));
  } 
}