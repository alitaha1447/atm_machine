package atm;

public class ATMOperationImpl implements ATMOperationInterf{
    ATM atm = new ATM();
    @Override
    public void viewBalance() {
        System.out.println("Available Balance is : " + atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withDrawAmount) {
        System.out.println("Collect money : " +  withDrawAmount);
        atm.setBalance(atm.getBalance() - withDrawAmount);
        viewBalance();
    }

    @Override
    public void depositAmount(double depositAmount) {
        System.out.println(depositAmount + " Deposited Successfully");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();
    }


}
