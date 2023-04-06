//2-5-4 abstract class

public abstract class BasicAccount {
    private String accountId;
    protected int amount;

    public abstract void withdraw(int amount);

    public abstract void deposit(int amount);
}
