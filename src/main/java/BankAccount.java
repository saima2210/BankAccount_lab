// bank account class
    public class BankAccount {
    String firstName;
    String lastName;
    String dateOfBirth;
    int accountNumber;
    double balance;

    public BankAccount (String firstName, String lastName, String dateOfBirth, int accountNumber, double balance){
          this.firstName = firstName;
          this.lastName = lastName;
          this.dateOfBirth = dateOfBirth;
          this.accountNumber = accountNumber;
          this.balance = balance;
   }

// getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fistName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

//  Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

//  withdrawal method
    public void withdrawal(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;

        }
    }

// interest
    public void interest() {
        double interest = balance * 0.05;
        balance += interest;
    }
}








