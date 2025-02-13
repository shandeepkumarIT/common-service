package com.dreamlayer.api.service.impl;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import com.dreamlayer.api.service.IMethodUtils;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class MethodUtils implements IMethodUtils {

	private final MessageSource messageSource;

	public String getLocalizedMessage(String translationKey) {
		
		return messageSource.getMessage(translationKey, null, LocaleContextHolder.getLocale());
	}
}
