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
        assertEquals(10,account1.increaseBalance(10));
    }

    @Test
    void newIncreaseBalanceBig() {
        Account account1 = new Account();
        assertEquals(2000,account1.increaseBalance(2000));
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

        account1.increaseBalance(4000);
        account1.withdrawnMoneyFromAccount(3001);

        assertEquals(4000, account1.totalBalance());
    }

    @Test
    void tranferMoneyToAnotherAccount() {
        Account account1 = new Account();
        Account account2 = new Account();

        account1.increaseBalance(500);
        account1.moneyTransferToAnotherAccount(account2, 10);

        assertEquals(490, account1.totalBalance());
        assertEquals(10, account2.totalBalance());

    }

}
