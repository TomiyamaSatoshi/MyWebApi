package jp.co.api.myweb.request;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class ContactRequestForm {

	@NotBlank
	private String name;
	@NotBlank
	private String mailAddress;
	private String contactTitle;
	private String contactContent;

}
