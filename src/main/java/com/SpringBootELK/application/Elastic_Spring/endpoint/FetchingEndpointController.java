package com.SpringBootELK.application.Elastic_Spring.endpoint;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.SpringBootELK.application.Elastic_Spring.bean.DatabaseConfigBean;
import com.SpringBootELK.application.Elastic_Spring.dao.APPDataDao;
import com.SpringBootELK.application.Elastic_Spring.dao.impl.APPDataDaoImpl;
import com.SpringBootELK.application.Elastic_Spring.request.ELKSPGRequest;
import com.SpringBootELK.application.Elastic_Spring.response.ELKSPGShortUrlResponse;
import com.SpringBootELK.application.Elastic_Spring.validator.ELKSPGValidation;

@RestController
public class FetchingEndpointController {

	private ELKSPGShortUrlResponse response;
	
	@RequestMapping(value="/becomeShort",method=RequestMethod.POST)
    @ResponseBody
	public ResponseEntity<ELKSPGShortUrlResponse> registerData(@RequestBody ELKSPGRequest request) throws SQLException {
		ELKSPGValidation validateUrl = new ELKSPGValidation();
		response = new ELKSPGShortUrlResponse();
		HttpStatus httpStatus;
		String error = validateUrl.validateInput(request);
		if(error != null) {
			response.setErrors(error);
			response.setStatus("Not Done");
			httpStatus = HttpStatus.BAD_REQUEST;
		}
		else {
			APPDataDao applicationData = new APPDataDaoImpl();
			applicationData.registerData(request.getUrl(), request.getSuggestedUrl(), request.getDescription());
			response.setStatus("Done");
			httpStatus = HttpStatus.ACCEPTED;
		}
		return new ResponseEntity<ELKSPGShortUrlResponse>(response,httpStatus);
	}
	
	
}
