public class Vehicle {
  //properties
  private String color;
  private int wheels;

  //getters
  public String getColors () {
    return this.color;
  }
  public int getWheels() {
    return this.wheels;
  }

  //setters
  public String setColor(String color) {
    return this.color = color;
  }
  public int setWheels(int wheels) {
    return this.wheels = wheels;
  }

  //methods
  public String honk () {
    return "Honk!";
  }
  public String output () {
    return "This car has " + this.wheels + " wheels and is " + this.color + ".";
  }

  //main
  public static void main(String [] args) {
    Vehicle aaron = new Vehicle();
    System.out.println(aaron.honk());
    aaron.setColor("silver");
    aaron.setWheels(4);
    System.out.println(aaron.output());
  }
}
