package jp.co.api.myweb.response;

import java.util.Date;

import lombok.Data;

@Data
public class QualificationsResponseForm {

	private int qualification_id;
	private String qualification_name;
	private Date qualification_get_date;
	
}
