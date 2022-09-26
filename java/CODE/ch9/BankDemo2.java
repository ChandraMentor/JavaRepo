class Account2 {
  private int balance;

  void deposit(int amount) {
    synchronized(this) {
      balance += amount;
    }
  }

  int getBalance() {
    return balance;
  }
}

class Customer2 extends Thread {
  Account2 account;

  Customer2(Account2 account) {
    this.account = account;
  }

  public void run() {
    try {
      for(int i = 0; i < 100000; i++) {
        account.deposit(10);
      }
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}

class BankDemo2 {
  private final static int NUMCUSTOMERS = 10;

  public static void main(String args[]) {

    // Create account
    Account2 account = new Account2();

    // Create and start customer threads
    Customer2 customers[] = new Customer2[NUMCUSTOMERS];
    for(int i = 0; i < NUMCUSTOMERS; i++) {
      customers[i] = new Customer2(account);
      customers[i].start();
    }

    // Wait for customer threads to complete
    for(int i = 0; i < NUMCUSTOMERS; i++) {
      try {
        customers[i].join();
      }
      catch(InterruptedException e) {
        e.printStackTrace();
      }
    }

    // Display account balance
    System.out.println(account.getBalance());
  }
}