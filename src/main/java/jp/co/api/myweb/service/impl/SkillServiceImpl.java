package jp.co.api.myweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.api.myweb.repository.QualificationRepository;
import jp.co.api.myweb.repository.SkillRepository;
import jp.co.api.myweb.response.SkillResponseForm;
import jp.co.api.myweb.service.SkillService;

@Service
public class SkillServiceImpl implements SkillService {

	@Autowired
	private SkillRepository skillRepository;
	@Autowired
	private QualificationRepository qualificationRepository;
	
	@Override
	public SkillResponseForm selectSkill() {
		
		// ResponseFormの作成
		SkillResponseForm responseForm = new SkillResponseForm();
		// スキルの取得
		responseForm.setSkillEntityList(skillRepository.selectAll());
		responseForm.setQualificationEntitiyList(qualificationRepository.selectAll());
		
		return responseForm;
	}

}
