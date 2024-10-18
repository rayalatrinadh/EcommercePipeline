package com.trinadh.Pipeline;

public class ValidationStage implements OrderProcessingStage{

    @Override
    public Order process(Order order){
        if(order.amount <= 0){
            order.status = "INVALID";
            System.out.println("Order Ivalid " + order);
        }else{
            order.status = "VALID";
            System.out.println("Order Validated "+ order);
        }
        return order;
    }
}
