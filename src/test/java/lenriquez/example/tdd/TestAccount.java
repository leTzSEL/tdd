package lenriquez.example.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAccount {

    @Test
    void newAccountBalance() {
        Account account1 = new Account();

        assertEquals(0, account1.totalBalance());
    }
}
