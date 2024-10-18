package com.trinadh.Pipeline;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    String orderId;
    double amount;
    String status;

    public Order(String orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
        this.status = "NEW";
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                '}';
    }
}
