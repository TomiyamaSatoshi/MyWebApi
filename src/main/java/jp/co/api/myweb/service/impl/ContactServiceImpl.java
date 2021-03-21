package jp.co.api.myweb.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.api.myweb.repository.ContactRepository;
import jp.co.api.myweb.request.ContactRequestForm;
import jp.co.api.myweb.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {
	
	protected final static Logger logger = LoggerFactory.getLogger(ContactServiceImpl.class);

	@Autowired
	ContactRepository contactRepository;

	@Override
	public void insertContact(ContactRequestForm contactForm) {
		logger.debug("コンタクトフォームのINSERT");
		contactRepository.insertContact(contactForm);
	}

}
