package jp.co.api.myweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.api.myweb.repository.SkillsRepository;
import jp.co.api.myweb.response.SkillsResponseForm;
import jp.co.api.myweb.service.SkillsService;

@Service
public class SkillsServiceImpl implements SkillsService {

	@Autowired
	private SkillsRepository skillsRepository;
	
	@Override
	public List<SkillsResponseForm> selectSkills() {
		return skillsRepository.selectAll();
	}

}
