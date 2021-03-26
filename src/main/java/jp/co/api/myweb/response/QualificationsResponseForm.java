package jp.co.api.myweb.response;

import java.util.Date;

import lombok.Data;

@Data
public class QualificationsResponseForm {

	private int qualificationId;
	private String qualificationName;
	private Date qualificationGetDate;
	
}
