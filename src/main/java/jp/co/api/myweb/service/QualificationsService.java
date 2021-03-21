package jp.co.api.myweb.service;

import org.springframework.stereotype.Service;

import jp.co.api.myweb.response.QualificationsResponseForm;

@Service
public interface QualificationsService {

	public QualificationsResponseForm selectQualifications();
}
