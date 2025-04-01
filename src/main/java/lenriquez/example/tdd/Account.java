package lenriquez.example.tdd;

public class Account {
    int balance;

    //Method to increase just the balance on the account
    public void increaseBalance(int amount) {
        if (!amountNoNegativeAndMax3000(amount)) {
            balance += amount;
        }
    }

    //Method to decrease/withdraw just the balance on the account
    public void withdrawnMoneyFromAccount(int withdrawnAmount) {
        if (!cantWithdrawnNegative_MoreThanBalanceAndMax300(withdrawnAmount)) {
            balance -= withdrawnAmount;
        }
    }

    private boolean amountNoNegativeAndMax3000(int amount) {
        return amount < 0 || amount > 3000;
    }

    private boolean cantWithdrawnNegative_MoreThanBalanceAndMax300(int withdrawnAmount) {
        return withdrawnAmount < 0 || withdrawnAmount > 3000 || withdrawnAmount > balance;
    }

    public int totalBalance() {
        return balance;
    }
}