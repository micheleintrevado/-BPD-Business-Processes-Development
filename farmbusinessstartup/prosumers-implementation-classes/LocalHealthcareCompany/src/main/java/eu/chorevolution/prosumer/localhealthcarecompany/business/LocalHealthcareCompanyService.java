package eu.chorevolution.prosumer.localhealthcarecompany.business;

import eu.chorevolution.prosumer.localhealthcarecompany.FarmBusinessStartupRequest;
import eu.chorevolution.prosumer.localhealthcarecompany.FarmSiteInspectionResponse;
import eu.chorevolution.prosumer.localhealthcarecompany.FarmRegistrationNotification;
import eu.chorevolution.prosumer.localhealthcarecompany.FarmSiteInspectionRequest;
import eu.chorevolution.prosumer.localhealthcarecompany.FarmOpeningNotification;
import eu.chorevolution.prosumer.localhealthcarecompany.FarmBusinessStartupResponse;

import eu.chorevolution.prosumer.localhealthcarecompany.model.ChoreographyLoopIndexes;

public interface LocalHealthcareCompanyService {

	void farmBusinessCodeRequest(FarmBusinessStartupRequest parameter, String choreographyTaskName, String senderParticipantName);
	      
	void farmSiteInspectionVerbal(FarmSiteInspectionResponse parameter, String choreographyTaskName, String senderParticipantName);
	      
	void farmBusinessStartupNotification(FarmRegistrationNotification parameter, String choreographyTaskName, String senderParticipantName);
	      
	FarmSiteInspectionRequest createFarmSiteInspectionRequest(ChoreographyInstanceMessages choreographyInstanceMessages, String choreographyTaskName, String receiverParticipantName);
    
	FarmOpeningNotification createFarmOpeningNotification(ChoreographyInstanceMessages choreographyInstanceMessages, String choreographyTaskName, String receiverParticipantName);
    
	FarmBusinessStartupResponse createFarmBusinessStartupResponse(ChoreographyInstanceMessages choreographyInstanceMessages, String choreographyTaskName, String receiverParticipantName);
    
}
