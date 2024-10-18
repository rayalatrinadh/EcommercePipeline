package com.trinadh.Pipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PipelineApplication {

	public static void main(String[] args) {

		System.out.println("Pipeline Validation");
		Order order = new Order("Order1234",55.2);

		OrderProcessingPipeline pipeline = new OrderProcessingPipeline()
				.addStages(new ValidationStage())
				.addStages(new PaymentStage())
				.addStages(new ShippingStage());

		pipeline.execute(order);
	}

}
