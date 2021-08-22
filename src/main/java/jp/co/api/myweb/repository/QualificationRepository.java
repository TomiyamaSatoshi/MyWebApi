package jp.co.api.myweb.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import jp.co.api.myweb.entity.QualificationEntity;

@Component
@Mapper
public interface QualificationRepository {

	public List<QualificationEntity> selectAll();
}
