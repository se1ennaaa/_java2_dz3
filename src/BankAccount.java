public class BankAccount {
    private double amount;


    public double getAmount() {
        return amount;
    }

    public void depozit(double sum){
        amount = amount + sum;
        System.out.println("--------You deposited money " + sum+ "som to the account");

    }

    public void withDraw(Integer sum) throws LimitException{
        if (sum < amount){
            throw  new LimitException("There are not enough funds on your account to withdraw this amount." , amount);
        }else {
            amount = amount - sum;
            System.out.println("You have withdrawn money in the amount "+ sum + "  som from the account.");
        }
    }
}


