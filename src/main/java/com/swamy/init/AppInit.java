package com.swamy.init;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.swamy.config.AppConfig;

@Component
public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {
				AppConfig.class
		};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {
				"/"
		};
	}

}
