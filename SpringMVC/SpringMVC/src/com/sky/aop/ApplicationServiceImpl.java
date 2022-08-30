package com.sky.aop;

import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImpl implements ApplicationService {
	@Log
	@Override
	public void processApplication() {
		// TODO Auto-generated method stub
		System.out.println("Process ApplicationForm");
	}

}
