package com.egm.ticketservice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Data
public class TicketDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private String organization;
	private String	from;
	private String to;
	private String	hour;
	private Long	capacity;
}
