package encapsulation03_lib;
import java.util.Arrays;

public class Account {
  private int balance = 0;
  private int [] transactions = new int [10];
  private int index = 0;

  public int balance () {
    // return this.balance;
    for (int trxn : transactions) {
      this.balance += trxn;
    }
    return this.balance;
  }

  public void deposit (int amount) {
    // this.balance += amount;
    transactions[index] = amount;
    index++;
    System.out.println(Arrays.toString(transactions));

  }

  public void withdraw (int amount) {
    // this.balance -= amount;
    transactions[index] = -amount;
    index++;
    System.out.println(Arrays.toString(transactions));
  }
}
