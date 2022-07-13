package it.univaq.disim.bpd.soap;

import java.util.Random;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

import it.univaq.disim.bpd.domain.FarmBusinessStartupRequest;
import it.univaq.disim.bpd.domain.FarmSiteInspectionResponse;
import it.univaq.disim.bpd.domain.FarmRegistrationNotification;

@Endpoint
public class LocalHealthcareCompanyEndpoint {

	private static final String NAMESPACE_URI = "http://eu.chorevolution.farmbusinessstartup/types";

	@Autowired
	private RuntimeService runtimeService;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "farmBusinessStartupRequest")
	public void requestFarmBusinessCode(@RequestPayload FarmBusinessStartupRequest request) {
		
		System.out.println("Received SOAP message farmBusinessStartupRequest");
		
		String businessKey = generateRandBusinessKey();

		runtimeService.createMessageCorrelation("farmBusinessStartupRequest")
				.processInstanceBusinessKey(businessKey)
				.setVariable("farmBusinessStartupRequest", request)
				.correlate();

	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "farmSiteInspectionResponse")
	public void receiveFarmSiteInspection(@RequestPayload FarmSiteInspectionResponse request) {
		
		System.out.println("Received SOAP message farmSiteInspectionResponse");
		
		String businessKey = generateRandBusinessKey();

		runtimeService.createMessageCorrelation("farmSiteInspectionResponse")
				.processInstanceBusinessKey(businessKey)
				.setVariable("farmSiteInspectionResponse", request)
				.correlate();

	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "farmRegistrationNotification")
	public void receiveFarmBusinessStartupNotification(@RequestPayload FarmRegistrationNotification request) {
		
		System.out.println("Received SOAP message farmRegistrationNotification");
		
		String businessKey = generateRandBusinessKey();

		runtimeService.createMessageCorrelation("farmRegistrationNotification")
				.processInstanceBusinessKey(businessKey)
				.setVariable("farmRegistrationNotification", request)
				.correlate();

	}

	private static String generateRandBusinessKey() {
		int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    Random random = new Random();

	    return random.ints(leftLimit, rightLimit + 1)
	      .limit(targetStringLength)
	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	      .toString();
	}

}
