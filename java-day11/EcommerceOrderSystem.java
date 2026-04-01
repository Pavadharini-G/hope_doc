class Product
{
    String name;
    int Stock;
    double Price;
    Product(String name,int Stock,double Price)
    {
        this.name=name;
        this.Stock=Stock;
        this.Price=Price;
    }
}
class User
{
    String name;
    String address;
    User(String name,String address)
    {
        this.name=name;
        this.address=address;
    }
}
class order
{
    Product prod;
    User u;
    int quantity;
    order(Product prod,User u,int quantity)//order(int quantity)
    {
        this.prod=prod;
        this.u=u;
        this.quantity=quantity;
    }
}
class orderservice
{
    void placeorder(order ord) throws OutOfStockException,PaymentFailedException,OrderProcessingException
    {

        if(ord.prod.Stock<=0) 
            throw new OutOfStockException("Product out of stock");
        if(Math.random()<0.4)
            throw new PaymentFailedException("Payment failed");
        if(Math.random()<0.2)
            throw new OrderProcessingException("order processing failed");
        ord.prod.Stock-=ord.quantity;
        System.out.println("Order placed successfully!");
    }
}
//exceptions created manually
class OutOfStockException extends Exception {
    OutOfStockException(String msg) {
        super(msg);
    }
}

class PaymentFailedException extends Exception {
    PaymentFailedException(String msg) {
        super(msg);
    }
}

class OrderProcessingException extends Exception {
    OrderProcessingException(String msg) {
        super(msg);
    }
}
public class EcommerceOrderSystem 
{
    public static void main(String[] args) {
        Product p=new Product("mouse",5,200.0);
        User u=new User("test1","abc,chennai");
        order o=new order(p,u,3);
        orderservice s=new orderservice();
        try{
            s.placeorder(o);
        }catch(OutOfStockException | PaymentFailedException | OrderProcessingException e){
            System.out.println(e.getMessage());
        }
    }
}
