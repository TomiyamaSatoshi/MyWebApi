package jp.co.api.myweb.response;

import java.util.List;

import jp.co.api.myweb.entity.CareerHistoryEntity;
import jp.co.api.myweb.entity.ParsonalEntity;
import lombok.Data;

@Data
public class IntroductionResponseForm {
	
	private List<CareerHistoryEntity> careerHistoryEntity;
	private ParsonalEntity parsonalEntity;

}
