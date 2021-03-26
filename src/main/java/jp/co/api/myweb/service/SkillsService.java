package jp.co.api.myweb.service;

import java.util.List;

import jp.co.api.myweb.response.SkillsResponseForm;

public interface SkillsService {

	public List<SkillsResponseForm> selectSkills();
}
