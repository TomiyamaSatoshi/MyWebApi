package jp.co.api.myweb.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import jp.co.api.myweb.entity.ParsonalEntity;

@Component
@Mapper
public interface ParsonalRepository {

	public ParsonalEntity selectAll();
}
