package lenriquez.example.tdd;

public class Account {
    int balance;


    public int totalBalance() {
        return balance;
    }

    public int increaseBalance(int amount) {
        return balance += amountNoNegativeAndMax300(amount);
    }

    private int amountNoNegativeAndMax300(int amount) {
        if (amount < 0 || amount > 3000) {
            balance = 0;
        }
        return balance;
    }


}
