package jp.co.api.myweb.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import jp.co.api.myweb.request.ContactRequestForm;

@Component
@Mapper
public interface ContactRepository {

	public void insertContact(ContactRequestForm contactForm);
}
