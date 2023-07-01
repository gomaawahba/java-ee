package com.mohmmed.validation;

import javax.faces.flow.builder.ReturnBuilder;

public class checkvaliduser {
	public boolean isvalid(String name,String password) {
		if(name.equalsIgnoreCase("gomaa wahba") && password.equals("12344321")) {
			return true;
		}
		return false;
	}
	

}
