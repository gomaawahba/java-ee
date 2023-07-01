package com.mohmmed.validation;

public class checklength {
	
	public boolean checklengthmethod(String name,String password) {
		if(name.length()>3 &&password.length()>3) {
			return true;
		}
		return false;
	}

}
