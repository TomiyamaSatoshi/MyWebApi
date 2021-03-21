package jp.co.api.myweb.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import jp.co.api.myweb.response.QualificationsResponseForm;

@Component
@Mapper
public interface QualificationsRepository {

	public QualificationsResponseForm selectAll();
}
