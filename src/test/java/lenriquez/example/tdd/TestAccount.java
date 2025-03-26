package lenriquez.example.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAccount {

    @Test
    void newAccountBalance() {
        Account account1 = new Account();
        assertEquals(0, account1.totalBalance());
    }

    @Test
    void newIncreaseBalance() {
        Account account1 = new Account();
        assertEquals(10,account1.increaseBalance(10));
    }

    @Test
    void newIncreaseBalanceBig() {
        Account account1 = new Account();
        assertEquals(2000,account1.increaseBalance(2000));
    }

    @Test
    void accumulateBalance() {
        Account account1 = new Account();
        account1.increaseBalance(2500);
        account1.increaseBalance(100);

        assertEquals(2600, account1.totalBalance());
    }
}
