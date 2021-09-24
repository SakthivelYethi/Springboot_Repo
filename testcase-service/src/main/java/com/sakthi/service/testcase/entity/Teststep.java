package com.sakthi.service.testcase.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Table(name = "TESTSTEP")
@Data
public class Teststep {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_profile")
	@SequenceGenerator(name= "seq_profile", sequenceName = "seq_profile", initialValue = 500)
	private Long id;
	
	@Column(name = "JOIN_DATE")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date joinDate;
	
	@Column(name = "IS_CONFIRMED")
	private boolean confirmed;
	
	@Column(name = "CURRENT_PROJECT")
	private String currentProject;
}
