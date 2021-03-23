package jp.co.api.myweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jp.co.api.myweb.request.ContactRequestForm;
import jp.co.api.myweb.response.QualificationsResponseForm;
import jp.co.api.myweb.response.SkillsResponseForm;
import jp.co.api.myweb.service.ContactService;
import jp.co.api.myweb.service.QualificationsService;
import jp.co.api.myweb.service.SkillsService;

@RestController
@RequestMapping("/myweb")
public class MyWebController {
	
	@Autowired
	SkillsService skillsService;
	@Autowired
	QualificationsService qualificationsService;
	@Autowired
	ContactService contactService;
	
	@RequestMapping(value = "/get-skills", method = RequestMethod.POST)
	public SkillsResponseForm getSkills() {
		return skillsService.selectSkills();
	}
	
	@RequestMapping(value = "/get-qualifications", method = RequestMethod.POST)
	public QualificationsResponseForm getQualifications() {
		return qualificationsService.selectQualifications();
	}
	
	@RequestMapping(value = "/send-message", method = RequestMethod.POST)
	public void insertContact(@RequestBody ContactRequestForm contactForm) {
		contactService.insertContact(contactForm);
	}
}
