class product {
    int id;
    String name;
    double price;
    int quantity;

    product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public void display() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + getTotalPrice());
        System.out.println("------------------------");
    }
    
}
public class shopping_cart
{
    public static void main(String[] args)
    {
        product p1=new product(1,"Laptop", 50000,1);
        product p2=new product(2,"light pen",2000,2);
        product p3=new product(3,"mouse", 200,1);

        double grandTotal = 0;

        p1.display();
        grandTotal += p1.getTotalPrice();

        p2.display();
        grandTotal += p2.getTotalPrice();

        p3.display();
        grandTotal += p3.getTotalPrice();

        System.out.println("Grand Total of Cart: " + grandTotal);
    }
}