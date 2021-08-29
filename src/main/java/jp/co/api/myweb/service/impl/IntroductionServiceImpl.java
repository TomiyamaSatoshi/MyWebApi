package jp.co.api.myweb.service.impl;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.api.myweb.entity.CareerHistoryEntity;
import jp.co.api.myweb.entity.ParsonalEntity;
import jp.co.api.myweb.repository.CareerHistoryRepository;
import jp.co.api.myweb.repository.ParsonalRepository;
import jp.co.api.myweb.response.IntroductionResponseForm;
import jp.co.api.myweb.service.IntroductionService;

@Service
public class IntroductionServiceImpl implements IntroductionService {

	@Autowired
	ParsonalRepository parsonalRepository;
	@Autowired
	CareerHistoryRepository careerHistoryRepository;
	
	@Override
	public IntroductionResponseForm selectParsonalAndCareerHistory() {
		
		// 日付フォーマットの定義
		SimpleDateFormat parsonalFormatter = new SimpleDateFormat("MMM d, y", new Locale("en", "US"));
		SimpleDateFormat careerFormatter = new SimpleDateFormat("MMM y", new Locale("en", "US"));
		
		// ParsonalEntity全件取得
		ParsonalEntity parsonalEntity = parsonalRepository.selectAll();
		// 日付を変換して格納
		parsonalEntity.setBirthdayConvert(parsonalFormatter.format(parsonalEntity.getBirthday()));
		
		// CareerHistoryEntity全件取得
		List<CareerHistoryEntity> careerHistoryEntityList = careerHistoryRepository.selectAll();
		// 日付を変換して格納
		careerHistoryEntityList.forEach(entity -> {
			if (entity.getCareerFromDate() != null) entity.setCareerFromDateConvert(careerFormatter.format(entity.getCareerFromDate()));
			if (entity.getCareerToDate() != null) entity.setCareerToDateConvert(careerFormatter.format(entity.getCareerToDate()));			
		});
		
		// ResponseForm作成
		IntroductionResponseForm responseForm = new IntroductionResponseForm();
		responseForm.setParsonalEntity(parsonalEntity);
		responseForm.setCareerHistoryEntity(careerHistoryEntityList);
		
		return responseForm;
	}
}
