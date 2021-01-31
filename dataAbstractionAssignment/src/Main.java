public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Johnny Mai", 1000.0, 1500.0);
        customer.deposit(1337.42, Customer.SAVING);
        customer.withdraw(500.0, Customer.CHECKING);
        customer.displayDeposits();
        customer.displayWithdraws();
    }
}
