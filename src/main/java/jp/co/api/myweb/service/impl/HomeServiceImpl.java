package jp.co.api.myweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.api.myweb.entity.ParsonalEntity;
import jp.co.api.myweb.repository.ParsonalRepository;
import jp.co.api.myweb.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	ParsonalRepository parsonalRepository;
	
	@Override
	public ParsonalEntity selectParsonal() {
		return parsonalRepository.selectAll();
	}

}
