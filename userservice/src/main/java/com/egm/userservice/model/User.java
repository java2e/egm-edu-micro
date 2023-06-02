package com.egm.userservice.model;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "users")
@Data
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String username;
	private String password; //=> hashlenmeiş md5 PasswordEncoder (min 8 karaker olup hem harf hemde rakam içer)
	private LocalDate createDate;
	private LocalDate updateDate;// => Localdate
	private boolean deleted; //=> boolean , int
	@OneToOne
	private Role role;

}
