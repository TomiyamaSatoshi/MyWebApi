package jp.co.api.myweb.response;

import java.util.List;

import jp.co.api.myweb.entity.QualificationEntity;
import jp.co.api.myweb.entity.SkillEntity;
import lombok.Data;

@Data
public class SkillResponseForm {

	private List<SkillEntity> skillEntityList;
	private List<QualificationEntity> qualificationEntitiyList;
}
