package jp.co.api.myweb.entity;

import java.time.LocalDate;

import lombok.Data;

@Data
public class QualificationEntity {
	
	private int qualificationId;
	private String qualificationName;
	private LocalDate qualificationGetDate;
	
}
