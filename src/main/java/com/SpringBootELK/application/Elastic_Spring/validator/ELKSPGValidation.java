package com.SpringBootELK.application.Elastic_Spring.validator;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.SpringBootELK.application.Elastic_Spring.request.ELKSPGRequest;

import static com.SpringBootELK.application.Elastic_Spring.constants.ELKSPGConstants.*;

public class ELKSPGValidation {
	
	public String validateInput(ELKSPGRequest request) {
		String error = null;
		
		if(request == null) {
			error= ERR_REQ_EMPTY;
		}
		else {
			if(request.getUrl() == null) {
				error = ERR_URL_NOTFOUND;
			}
			else if(isFormatedUrl(request.getUrl()) == false) {
				error = ERR_URL_FORMAT;
			}
			else if(request.getSuggestedUrl() == null) {
				error = ERR_SURL_EMPTY;
			}
		}
		return error;
	}

	private boolean isFormatedUrl(String url) {
		
		String urlPattern =  "^(https|http)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
		Pattern pattern = Pattern.compile(urlPattern);
        Matcher matcher = pattern.matcher(url);
		return matcher.matches();
	}
}
