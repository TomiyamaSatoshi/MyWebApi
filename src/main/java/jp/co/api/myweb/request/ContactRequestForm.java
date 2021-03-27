package jp.co.api.myweb.request;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class ContactRequestForm {

	@NotBlank(message = "name is required.")
	private String name;
	
	@NotBlank(message = "mailAddress is required.")
	private String mailAddress;
	
	@NotBlank(message = "contactTitle is required.")
	private String contactTitle;
	
	@NotBlank(message = "contactContent is required.")
	private String contactContent;

}
