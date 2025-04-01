package lenriquez.example.tdd;

public class AccountManager {

    //Method to transfer the money to another account
    public void moneyTransferToAnotherAccount(Account accountSendMoney, Account accountRecived, int moneyTransferred) {
        if (!cantTransferNegativeAndMax1500(moneyTransferred)) {
            accountSendMoney.withdrawnMoneyFromAccount(moneyTransferred);
            accountRecived.increaseBalance(moneyTransferred);
        }
    }

    private boolean cantTransferNegativeAndMax1500(int moneyTransferred) {
        return moneyTransferred < 0 || moneyTransferred > 1500;
    }
}
