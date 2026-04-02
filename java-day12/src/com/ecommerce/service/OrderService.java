package src.com.ecommerce.service;

import src.com.ecommerce.model.Order;
public class OrderService {
    public void placeOrder(Order order) {
        System.out.println(order.user.name);
        System.out.println(order.product.name);
        System.out.println(order.quantity);
        double totalPrice=order.product.price*order.quantity;
        System.out.println("Total price: "+totalPrice);
    }
}
