package lenriquez.example.tdd;

public class Account {
    int balance;

    public int totalBalance() {
        return balance;
    }

    //Method to increase just the balance on the account
    public int increaseBalance(int amount) {
        return balance += amountNoNegativeAndMax300(amount);
    }

    //Method to decrease/withdraw just the balance on the account
    public void withdrawnMoneyFromAccount(int withdrawnAmount) {
        if (cantWithdrawnNegative_MoreThanBalanceAndMax300(withdrawnAmount)) {
            balance -= withdrawnAmount;
        }
    }

    private int amountNoNegativeAndMax300(int amount) {
        if (amount < 0 || amount > 3000) {
            balance = 0;
        }
        return balance;
    }

    private boolean cantWithdrawnNegative_MoreThanBalanceAndMax300(int withdrawnAmount) {
        return withdrawnAmount > 0 && withdrawnAmount < 3000 && withdrawnAmount < balance;
    }
}