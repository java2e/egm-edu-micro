package com.egm.accountservice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Data
public class Account extends BaseModel {

	private String name;
	private String surname;
	@Size(min = 11,max = 11,message = "TC NO 11 haneli olmak zorundadır!")
	private String identiyNumber;
	private String city;
	private String address;
	private LocalDate birthDate;
	private String email;
	private String telephone;
}
