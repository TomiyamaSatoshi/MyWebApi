package jp.co.api.myweb.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import jp.co.api.myweb.response.QualificationsResponseForm;

@Component
@Mapper
public interface QualificationsRepository {

	public List<QualificationsResponseForm> selectAll();
}
