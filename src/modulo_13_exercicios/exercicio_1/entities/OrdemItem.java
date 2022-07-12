package modulo_13_exercicios.exercicio_1.entities;

public class OrdemItem {

    private int quantity;
    private double price;

    private Product product;

    public OrdemItem() {
    }

    public OrdemItem(int quantity, double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double subTotal(){
        return quantity * price;
    }

    public String toString(){
        return product.getName()
                + ". $"
                + String.format("%.2f", price)
                + ", Quantity:"
                + quantity
                + ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }

}
