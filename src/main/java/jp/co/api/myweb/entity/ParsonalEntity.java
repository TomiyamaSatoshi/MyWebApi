package jp.co.api.myweb.entity;

import java.util.Date;

import lombok.Data;

@Data
public class ParsonalEntity extends BaseEntity {
	
	private String parsonalName;
	private Date birthday;
	private String nativePlace;
	private String currentLocation;
	private String hobby;
	private String wellcomeMessageMain;
	private String wellcomeMessageSub;
	private String wellcomeMessageName;
	
	private String birthdayConvert;

}
