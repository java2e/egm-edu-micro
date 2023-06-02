package com.egm.accountservice.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;


@MappedSuperclass
@Data
public class BaseModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private boolean deleted;
	private LocalDate created;
	private LocalDate updateDated;
}
