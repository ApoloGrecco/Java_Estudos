package modulo8_exercicios.exercicio_1.entities;

public class Account {

    private String accountNumber;

    private String name;

    private double quantity;

    public Account(String accountNumber, String name, double quantity) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.quantity = quantity;
    }

    public Account(String accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void deposit(double quantity){
        this.quantity += quantity;
    }

    public void withdraw(double quantity){
        this.quantity -= quantity + 5;
    }

    public String toString(){
        return "Account number: "
                + accountNumber
                + ", name: "
                + name
                + ", balance: $ "
                + String.format("%.2f", quantity)
                + "\n";
    }
}
