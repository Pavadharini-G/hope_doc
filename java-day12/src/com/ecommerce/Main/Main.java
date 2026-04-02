package src.com.ecommerce.Main;

import src.com.ecommerce.model.*;
import src.com.ecommerce.service.*;
public class Main {
    public static void main(String[] args)
    {
        User u=new User("Test_user","dubai");
        Product p=new Product("keyboard",800);
        Order o=new Order(u,p,4);
        OrderService service=new OrderService();
        service.placeOrder(o);
    }
}
