package chapterThree;

public class Account {
    private int balance;

    public void deposit(int amount) {
        balance+=amount;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        if(amount < balance){
        balance-= amount; 
        }
    }

}
