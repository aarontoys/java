package galvanize;

import encapsulation01_lib.Proposal;

public class Encapsulation01 {
  public static void main(String[] args){
    Proposal prop = new Proposal();

    prop.setName("Aaron Toys");
    // prop.name = "Some thing";
    System.out.println(prop.getName());

    prop.allInFavor = 24;
    System.out.println(prop.allInFavor);

    prop.allAgainst = 2;
    System.out.println(prop.allAgainst);
  }
}
