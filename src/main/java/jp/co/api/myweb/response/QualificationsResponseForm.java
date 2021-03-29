package jp.co.api.myweb.response;

import java.time.LocalDate;

import lombok.Data;

@Data
public class QualificationsResponseForm {

	private int qualificationId;
	private String qualificationName;
	private LocalDate qualificationGetDate;
	
}
