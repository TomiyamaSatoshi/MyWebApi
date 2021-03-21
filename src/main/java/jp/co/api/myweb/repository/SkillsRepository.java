package jp.co.api.myweb.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import jp.co.api.myweb.response.SkillsResponseForm;

@Component
@Mapper
public interface SkillsRepository {

	public SkillsResponseForm selectAll();
}
