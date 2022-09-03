package it.univaq.disim.bpd.soap;

import java.util.Random;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

import it.univaq.disim.bpd.domain.FarmBusinessStartupRequest;
import it.univaq.disim.bpd.domain.FarmRegistrationNotification;
import it.univaq.disim.bpd.domain.FarmSiteInspectionRequest;

@Endpoint
public class LocalHealthcareCompanyEndpoint {

	private static final String NAMESPACE_URI = "http://eu.chorevolution.farmbusinessstartup/localhealthcarecompany";

	@Autowired
	private RuntimeService runtimeService;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "farmBusinessStartupRequestElementRequest")
	public void requestFarmBusinessCode(@RequestPayload FarmBusinessStartupRequest request) {
		
		System.out.println("Received SOAP message farmBusinessStartupRequest");
		String businessKey = generateRandBusinessKey();

		runtimeService.createMessageCorrelation("farmBusinessStartupRequest")
				.processInstanceBusinessKey("XXXXX")
				.setVariable("farmBusinessStartupRequest", request)
				.correlate();

	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "farmSiteInspectionResponseElementRequest")
	public void receiveFarmSiteInspectionVerbal(@RequestPayload FarmSiteInspectionRequest request) {
		String businessKey = generateRandBusinessKey();

		System.out.println("Received SOAP message farmSiteInspectionResponse");
		runtimeService.createMessageCorrelation("farmSiteInspectionResponse")
				.processInstanceBusinessKey("XXXXX")
				.setVariable("farmSiteInspectionResponse", request)
				.correlate();

	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "farmRegistrationNotification")
	public void receiveFarmBusinessStartupNotification(@RequestPayload FarmRegistrationNotification request) {
		
		System.out.println("Received SOAP message farmRegistrationNotification");
		
		String businessKey = generateRandBusinessKey();

		runtimeService.createMessageCorrelation("farmRegistrationNotification")
				.processInstanceBusinessKey("XXXXX")
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
