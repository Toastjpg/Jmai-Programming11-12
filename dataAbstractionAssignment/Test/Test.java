import org.junit.Before;

import java.util.Date;

import static junit.framework.TestCase.assertEquals;

public class Test {
    Customer testCustomer;
    @Before
    public void setUp(){
        testCustomer = new Customer();
    }

    @org.junit.Test
    public void testDepositToString(){
        //Initializes objects
        Date date = new Date();
        Deposit depositClass = new Deposit(100.0, date, Customer.SAVING);
        //Test toString method by comparing to expected output
        assertEquals("Deposit of: $" + 100.0 + " Date: " + date + " into account: " + Customer.SAVING, depositClass.toString());
    }

    @org.junit.Test
    public void testWithdrawToString(){
        //Initializes objects
        Date date = new Date();
        Withdraw withdrawClass = new Withdraw(50.0, date, Customer.SAVING);
        //Test toString method by comparing to expected output
        assertEquals("Withdrawal of: $" + 50.0 + " Date: " + date + " from account: " + Customer.SAVING, withdrawClass.toString());
    }

    @org.junit.Test
    public void testDeposit(){
        //Check for correct amount in each account
        assertEquals(100.0, testCustomer.getCheckBalance());
        assertEquals (100.0, testCustomer.getSavingBalance());
        //Deposit into both accounts
        testCustomer.deposit(500.0, Customer.CHECKING);
        testCustomer.deposit(300.0, Customer.SAVING);
        //Check correct amount has been added
        assertEquals(600.0, testCustomer.getCheckBalance());
        assertEquals(400.0, testCustomer.getSavingBalance());
    }

    @org.junit.Test
    public void testWithdraw(){
        //Check for correct amount in each account
        assertEquals(100.0, testCustomer.getCheckBalance());
        assertEquals (100.0, testCustomer.getSavingBalance());
        //Withdraw from both accounts
        testCustomer.withdraw(50.0, Customer.CHECKING);
        testCustomer.withdraw(30.0, Customer.SAVING);
        //Check correct amount has been withdrawn
        assertEquals(50.0, testCustomer.getCheckBalance());
        assertEquals(70.0, testCustomer.getSavingBalance());
    }
}

