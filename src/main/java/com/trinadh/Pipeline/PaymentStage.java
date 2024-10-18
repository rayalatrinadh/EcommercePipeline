package com.trinadh.Pipeline;

public class PaymentStage implements OrderProcessingStage{

    @Override
    public Order process(Order order) {
        if("VALID".equals(order.status)){
            order.status = "PAID";
            System.out.println("Payment Processed " + order);
        }else{
            order.status = "FAILED";
            System.out.println("Payment Failed " + order);
        }
        return order;
    }
}
