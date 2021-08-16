package chapterThree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AccountTest {




    @Test
    public void accountCanDepositTest(){
        //given
        Account tomiwaAccount = new Account();
        //when
        tomiwaAccount.deposit(5000);

        //assert
        int balance = tomiwaAccount.getBalance();
        assertEquals(5000, balance);
    }

    @Test
    public void accountCanWithdrawTest(){
        //given
        Account account = new Account();
        account.deposit(5000);
        //when
        account.withdraw(2000);
    

        //then
        assertEquals(3000, account.getBalance());
    }
    

    @Test
    public void accountCannotWithdrawMoreThanBalanceTest(){
        //given
        Account tomiwAccount = new Account();
        tomiwAccount.deposit(3000);
        //when
        tomiwAccount.withdraw(5000);
        //assert
        assertEquals(3000, tomiwAccount.getBalance());

    }
}
