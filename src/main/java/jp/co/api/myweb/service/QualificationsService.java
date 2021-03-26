package jp.co.api.myweb.service;

import java.util.List;

import jp.co.api.myweb.response.QualificationsResponseForm;

public interface QualificationsService {

	public List<QualificationsResponseForm> selectQualifications();
}
