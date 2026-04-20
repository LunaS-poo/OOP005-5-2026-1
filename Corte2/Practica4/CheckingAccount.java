public class CheckingAccount{
  private String name;
  private int balance;
  private String id;
  private double interestRate;

  public CheckingAccount(String inputName, int inputBalance, String inputId){
    this.name = inputName;
    this.balance = inputBalance;
    this.id = inputId;
    this.interestRate = 0.02;
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

  public int getBalance(){
    return this.balance;
  }
  
  public void setBalance(int newBalance){
    this.balance = newBalance;
  }

  public double getMonthlyInterest(){
    return this.interestRate * this.balance;
  }
}

 