package jp.co.api.myweb.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.validation.ObjectError;

import jp.co.api.myweb.exception.ApplicationErrorException;

public class BaseController {
	
	protected static final Logger logger = LoggerFactory.getLogger(BaseController.class);
	
	public void validate(String funcName, List<ObjectError> errorList) throws ApplicationErrorException {
		
		StringBuilder sb = new StringBuilder();
		for (ObjectError error : errorList) {
			if (!StringUtils.isEmpty(sb.toString())) {
				sb.append("/");
			}
			sb.append(error.getDefaultMessage());
		}
		
		if (!StringUtils.isEmpty(sb.toString())) {
			// バリデーションエラーV001としてExceptionをThrowする
			throw new ApplicationErrorException("V001", funcName, sb.toString());
		}
	}

}
