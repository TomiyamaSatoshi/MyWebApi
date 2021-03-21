package jp.co.api.myweb.service;

import org.springframework.stereotype.Service;

import jp.co.api.myweb.request.ContactRequestForm;

@Service
public interface ContactService {

	public void insertContact(ContactRequestForm contactForm);
}
