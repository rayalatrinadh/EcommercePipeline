package com.trinadh.Pipeline;

public class ShippingStage implements OrderProcessingStage{

    @Override
    public Order process(Order order) {

        if("PAID".equals(order.status)){
            order.status = "SHIPPED";
            System.out.println("order shipped " + order);
        }else{
            order.status = "FAILED";
            System.out.println("Shipping failed " + order);
        }
        return order;
    }
}
