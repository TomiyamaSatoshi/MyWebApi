package jp.co.api.myweb.entity;

import java.util.Date;

import lombok.Data;

@Data
public class CareerHistoryEntity extends BaseEntity {

	private long careerHistoryId;
	private String career;
	private Date careerFromDate;
	private Date careerToDate;
	
	private String careerFromDateConvert;
	private String careerToDateConvert;
	
}
