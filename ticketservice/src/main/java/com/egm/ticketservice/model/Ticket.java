package com.egm.ticketservice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;


@Entity
@Data
public class Ticket {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long userId; // userservice gelen id
	private LocalDate createdate;
	private LocalDate updatedate;
	private double	price;
	private LocalDate expireDate;


}
