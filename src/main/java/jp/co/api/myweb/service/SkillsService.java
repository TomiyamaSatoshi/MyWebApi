package jp.co.api.myweb.service;

import org.springframework.stereotype.Service;

import jp.co.api.myweb.response.SkillsResponseForm;

@Service
public interface SkillsService {

	public SkillsResponseForm selectSkills();
}
