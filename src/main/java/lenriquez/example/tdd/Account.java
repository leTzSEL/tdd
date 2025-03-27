package lenriquez.example.tdd;

public class Account {
    int balance;

    public int totalBalance() {
        return balance;
    }

    public int increaseBalance(int amount) {
        return balance += amountNoNegativeAndMax300(amount);
    }

    public void withdrawnMoneyFromAccount(int withdrawnAmount) {
        if (cantWithdrawnNegative_MoreThanBalanceAndMax300(withdrawnAmount)) {
            balance -= withdrawnAmount;
        }
    }

    public void moneyTransferToAnotherAccount(Account accountRecived, int moneyTransferred) {
        if (cantTransferNegativeAndMax1500(moneyTransferred)) {
            balance -= moneyTransferred;
        }
        accountRecived.moneyTransferRecive(moneyTransferred);
    }

    public void moneyTransferRecive(int moneyRecived) {
        balance += moneyRecived;
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

    private boolean cantTransferNegativeAndMax1500(int moneyTransferred) {
        return moneyTransferred > 0 && moneyTransferred < 1500;
    }
}