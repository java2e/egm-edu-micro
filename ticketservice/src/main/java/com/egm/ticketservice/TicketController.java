package com.egm.ticketservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ticket")
public class TicketController {

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;

	private static final String TOPIC = "first_topic";


	@GetMapping("/create")
	public void createData() {
		// Sending the message
		kafkaTemplate.send(TOPIC, "{EGM}");
	}

}
