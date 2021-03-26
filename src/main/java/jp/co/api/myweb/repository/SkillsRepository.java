package jp.co.api.myweb.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import jp.co.api.myweb.response.SkillsResponseForm;

@Component
@Mapper
public interface SkillsRepository {

	public List<SkillsResponseForm> selectAll();
}
