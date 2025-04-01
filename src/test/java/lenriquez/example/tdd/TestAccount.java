package lenriquez.example.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAccount {

    @Test
    void newAccountBalanceCreate() {
        Account account1 = new Account();
        assertEquals(0, account1.totalBalance());
    }

    @Test
    void newIncreaseBalanceToNewAccount() {
        Account account1 = new Account();
        account1.increaseBalance(10);
        assertEquals(10, account1.totalBalance());
    }

    @Test
    void newIncreaseBalanceBig() {
        Account account1 = new Account();
        account1.increaseBalance(2000);
        assertEquals(2000,account1.totalBalance());
    }

    @Test
    void accumulateAnIncreaseBalanceToAccount() {
        Account account1 = new Account();
        account1.increaseBalance(2500);
        account1.increaseBalance(100);

        assertEquals(2600, account1.totalBalance());
    }

    @Test
    void newattemptIncreaseBalanceInNegative() {
        Account account1 = new Account();
        account1.increaseBalance(-10);
        assertEquals(0, account1.totalBalance());
    }

    @Test
    void maximumAllowableIncomeIs3000() {
        Account account1 = new Account();

        account1.increaseBalance(3001);

        assertEquals(0, account1.totalBalance());
    }

    @Test
    void withdrawnMoneyFromAccountWithSaves() {
        Account account1 = new Account();

        account1.increaseBalance(400);
        account1.withdrawnMoneyFromAccount(3001);

        assertEquals(400, account1.totalBalance());
    }

    @Test
    void tranferMoneyToAnotherAccount() {
        Account account1 = new Account();
        Account account2 = new Account();
        AccountManager accountManager = new AccountManager();

        account1.increaseBalance(300);
        account2.increaseBalance(400);

        accountManager.moneyTransferToAnotherAccount(account1, account2, 10);

        assertEquals(290, account1.totalBalance());
        assertEquals(410, account2.totalBalance());

    }

}
