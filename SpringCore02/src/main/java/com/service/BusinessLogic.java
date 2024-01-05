package com.service;

import org.springframework.stereotype.Service;

@Service(value="bl")
public class BusinessLogic {//businessLogic

	public BusinessLogic() {
		System.out.println("Service object is created");
	}

}
