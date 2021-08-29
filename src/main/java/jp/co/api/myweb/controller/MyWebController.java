package jp.co.api.myweb.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jp.co.api.myweb.entity.ParsonalEntity;
import jp.co.api.myweb.exception.ApplicationErrorException;
import jp.co.api.myweb.request.ContactRequestForm;
import jp.co.api.myweb.response.IntroductionResponseForm;
import jp.co.api.myweb.response.SkillResponseForm;
import jp.co.api.myweb.service.ContactService;
import jp.co.api.myweb.service.HomeService;
import jp.co.api.myweb.service.IntroductionService;
import jp.co.api.myweb.service.SkillService;

@RestController
@RequestMapping("/myweb")
public class MyWebController extends BaseController {
	
	@Autowired
	HomeService homeService;
	@Autowired
	IntroductionService introductionService;
	@Autowired
	SkillService skillService;
	@Autowired
	ContactService contactService;
	
	@RequestMapping(value = "/get-home-contents", method = RequestMethod.POST)
	public ParsonalEntity getHomeContents() {
		return homeService.selectParsonal();
	}
	
	@RequestMapping(value = "/get-introduction", method = RequestMethod.POST)
	public IntroductionResponseForm getIntoroduction() {
		return introductionService.selectParsonalAndCareerHistory();
	}
	
	@RequestMapping(value = "/get-skills", method = RequestMethod.POST)
	public SkillResponseForm getSkillsAndQualifications() {
		return skillService.selectSkill();
	}
	
	@RequestMapping(value = "/send-message", method = RequestMethod.POST)
	public void insertContact(@RequestBody @Valid ContactRequestForm contactForm, BindingResult result) throws ApplicationErrorException{
		
		// リクエストのバリデーションエラーチェック
		validate("insertContact", result.getAllErrors());
		
		contactService.insertContact(contactForm);
	}
}
