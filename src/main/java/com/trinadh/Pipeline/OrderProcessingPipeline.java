package com.trinadh.Pipeline;

import java.util.ArrayList;
import java.util.List;

public class OrderProcessingPipeline {

    public List<OrderProcessingStage> stages = new ArrayList<>();

    public OrderProcessingPipeline addStages(OrderProcessingStage stage){
        stages.add(stage);
        return this;
    }

    public Order execute(Order order){

        for(OrderProcessingStage stage: stages){
            order = stage.process(order);
            if("INVALID".equals(order.status) || "FAILED".equals(order.status))
                break;
        }

        return order;
    }
}
