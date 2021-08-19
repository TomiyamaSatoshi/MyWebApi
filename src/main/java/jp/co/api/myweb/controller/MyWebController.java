package jp.co.api.myweb.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jp.co.api.myweb.exception.ApplicationErrorException;
import jp.co.api.myweb.request.ContactRequestForm;
import jp.co.api.myweb.response.IntroductionResponseForm;
import jp.co.api.myweb.response.QualificationsResponseForm;
import jp.co.api.myweb.response.SkillsResponseForm;
import jp.co.api.myweb.service.ContactService;
import jp.co.api.myweb.service.IntroductionService;
import jp.co.api.myweb.service.QualificationsService;
import jp.co.api.myweb.service.SkillsService;

@RestController
@RequestMapping("/myweb")
public class MyWebController extends BaseController {
	
	@Autowired
	IntroductionService introductionService;
	@Autowired
	SkillsService skillsService;
	@Autowired
	QualificationsService qualificationsService;
	@Autowired
	ContactService contactService;
	
	@RequestMapping(value = "/get-introduction", method = RequestMethod.POST)
	public IntroductionResponseForm getIntoroduction() {
		return introductionService.selectParsonalAndCareerHistory();
	}
	
	@RequestMapping(value = "/get-skills", method = RequestMethod.POST)
	public List<SkillsResponseForm> getSkills() {
		return skillsService.selectSkills();
	}
	
	@RequestMapping(value = "/get-qualifications", method = RequestMethod.POST)
	public List<QualificationsResponseForm> getQualifications() {
		return qualificationsService.selectQualifications();
	}
	
	@RequestMapping(value = "/send-message", method = RequestMethod.POST)
	public void insertContact(@RequestBody @Valid ContactRequestForm contactForm, BindingResult result) throws ApplicationErrorException{
		
		// リクエストのバリデーションエラーチェック
		validate("insertContact", result.getAllErrors());
		
		contactService.insertContact(contactForm);
	}
}
