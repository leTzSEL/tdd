package lenriquez.example.tdd;

public class Account {
    int balance = 0;


    public int totalBalance() {
        return balance;
    }

    public int increaseBalance(int amount) {
        return balance += amount;
    }
}
