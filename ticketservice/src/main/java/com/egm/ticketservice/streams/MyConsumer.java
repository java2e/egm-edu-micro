package com.egm.ticketservice.streams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class MyConsumer {

	@KafkaListener(topics = "first_topic",groupId = "groupId-1")
	public void consume(String message)
	{
		// Print statement
		System.out.println("message = " + message);
	}

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;

	private static final String TOPIC = "first_topic";

	@Scheduled(cron = "1 * * * *")
	public void createData() {
		// Sending the message
		kafkaTemplate.send(TOPIC, "{EGM}");
	}
}
