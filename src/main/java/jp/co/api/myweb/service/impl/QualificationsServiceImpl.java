package jp.co.api.myweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.api.myweb.repository.QualificationsRepository;
import jp.co.api.myweb.response.QualificationsResponseForm;
import jp.co.api.myweb.service.QualificationsService;

@Service
public class QualificationsServiceImpl implements QualificationsService{

	@Autowired
	private QualificationsRepository qualificationsRepository;
	
	@Override
	public QualificationsResponseForm selectQualifications() {
		return qualificationsRepository.selectAll();
	}

}